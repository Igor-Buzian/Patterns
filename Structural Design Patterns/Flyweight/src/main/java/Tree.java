public class Tree implements ITree{
    private int x;
    private  int y;
    private TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    @Override
    public void draw() {
        type.draw(x,y);
    }
}
