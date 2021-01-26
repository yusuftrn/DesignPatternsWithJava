package structural.flyweight.FlyweightExample1.trees;

import structural.flyweight.FlyweightExample1.trees.TreeType;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {
    static Map<String, TreeType> treeTypeMap = new HashMap<>();

    public static TreeType getTreeType(String name, Color color, String otherTreeData){
        TreeType treeType = treeTypeMap.get(name);
        if(treeType == null){
            treeType = new TreeType(name, color, otherTreeData);
            treeTypeMap.put(name, treeType);
        }
        return treeType;
    }
}
