/*
rm *.class
/usr/local/Cellar/openjdk/21.0.2/bin/javac *.java
/usr/local/Cellar/openjdk/21.0.2/bin/java Main
*/

import java.io.*;
import java.util.*;

class Solution {

    public int maxDepth(TreeNode root) {

        if(root == null){
            return 0;
        }

        int lh = maxDepth(root.left);
        int rh = maxDepth(root.right);

        return  (Math.max(lh,rh)+1);
    }

}
