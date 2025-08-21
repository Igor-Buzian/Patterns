package trash;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Forest {
    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, TreeType info) {
        TreeType type = TreeFactory.getTreeType(info.getName(), info.getColor(), info.getTexture());
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    public void draw() {
        for (Tree tree : trees) {
            tree.draw();
        }
    }

        public static void main(String[] args) {
            Forest forest = new Forest();
            Random rand = new Random();

            // 1. Создаем пул уникальных типов деревьев
            TreeType oak = new TreeType("Дуб", "зеленый", "текстура-дуба");
            TreeType birch = new TreeType("Береза", "белый", "текстура-березы");

            // 2. Храним их в массиве для быстрого доступа
            TreeType[] treeTypes = {oak, birch};

            System.out.println("--- Сажаем деревья в лесу ---");

            // 3. Используем массив для посадки деревьев
            for (int i = 0; i < 50; i++) {
                // Выбираем тип дерева по индексу (0 для дуба, 1 для березы)
                int treeTypeIndex = rand.nextInt(2);
                TreeType selectedType = treeTypes[treeTypeIndex];
                forest.plantTree(rand.nextInt(100), rand.nextInt(100), selectedType);
            }

            System.out.println("\n--- Готовый лес ---");
            forest.draw();

            System.out.println("\nВсего создано объектов Tree: " + forest.trees.size());
            System.out.println("Всего уникальных типов TreeType: " + treeTypes.length);
        }
    }
