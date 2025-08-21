package trash;

import java.util.HashMap;
import java.util.Map;

// Фабрика легковесов
class TreeFactory {
    public static final Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, String color, String texture) {
        String key = name + color + texture;
        if (!treeTypes.containsKey(key)) {
            treeTypes.put(key, new TreeType(name, color, texture));
            System.out.println("Создан новый тип дерева: " + name);
        }
        return treeTypes.get(key);
    }

}