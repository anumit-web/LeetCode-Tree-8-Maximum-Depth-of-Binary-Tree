/*
rm *.class
/usr/local/Cellar/openjdk/21.0.2/bin/javac *.java
/usr/local/Cellar/openjdk/21.0.2/bin/java Main
*/

import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {

        // A binary tree's maximum depth is the number of nodes along the 
        // longest path from the root node down to the farthest leaf node.

        System.out.println("Maximum Depth of Binary Tree");
        System.out.println("A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.");
        System.out.println("");

        Solution solution = new Solution();

        BuildTree1 tree1 = new BuildTree1();
        TreeNode root1 = tree1.getTree();

        int return_value = solution.maxDepth(root1);
        
        System.out.println("Output Tree = (Maximum Depth of Binary Tree) = " + return_value); // how to print tree

    }

}
