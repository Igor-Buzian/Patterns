import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private static int FOREST_COUNT = 50;
    private static int RANDOM_AREA = 150;
    private static List<Tree> forest = new ArrayList<>();

    // This method seems to be an alternative way to plant trees, but is not used in the main method.
    private static void plantTree(int x, int y, TreeType type) {
        TreeType treeType = TreeFactory.getType(type.getName(), type.getColor(), type.getTexture());
        Tree newTree = new Tree(x, y, treeType);
        forest.add(newTree);
    }

    private static void draw() {
        for (Tree tree : forest) {
            tree.draw();
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();

        System.out.println("--- Planting trees in the forest ---");

        // The client requests tree types from the factory in a loop
        for (int i = 0; i < FOREST_COUNT; i++) {
            if (i % 2 == 0) {
                // The factory will return an existing "Oak" object
                TreeType type = TreeFactory.getType("Oak", "oak-texture", "green");
                forest.add(new Tree(rand.nextInt(RANDOM_AREA), rand.nextInt(RANDOM_AREA), type));
            } else {
                // The factory will return an existing "Birch" object
                TreeType type = TreeFactory.getType("Birch", "birch-texture", "white");
                forest.add(new Tree(rand.nextInt(RANDOM_AREA), rand.nextInt(RANDOM_AREA), type));
            }
        }

        System.out.println("\n--- Ready forest ---");

        draw();

        System.out.println("\nTotal Tree objects created: " + forest.size());
        System.out.println("Total unique TreeType objects (flyweights): " + TreeFactory.treeTypeMap.size());
    }
}