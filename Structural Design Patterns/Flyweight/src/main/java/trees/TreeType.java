package trees;

public class TreeType {
    private String name;
    private String texture;
    private String color;

    public TreeType(String name, String texture, String color) {
        this.name = name;
        this.texture = texture;
        this.color = color;
    }

    public void draw(int x, int y) {
        System.out.printf(
                "Paint tree for %s with texture %s and color %s on position %d || %d\n",
                name, texture, color, x, y);
    }

    public String getName() {
        return name;
    }

    public String getTexture() {
        return texture;
    }

    public String getColor() {
        return color;
    }
}
