import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    public static Map<String, TreeType> treeTypeMap = new HashMap<>();

    public static TreeType getType(String name, String color, String texture){
        String key = name+color+texture;
        if(!treeTypeMap.containsKey(key)){
            treeTypeMap.put(key,new TreeType(name,texture,color));
            System.out.println("Added new TreeType!");
        }
        return treeTypeMap.get(key);
    }
}
