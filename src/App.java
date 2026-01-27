import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        /**
         * Given the root of a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.
        
        
        
        Example 1:
        
        Input: root = [1,2,3,null,5,null,4]
        
        Output: [1,3,4]
        
        Explanation:
        
        
        
        Example 2:
        
        Input: root = [1,2,3,4,null,null,null,5]
        
        Output: [1,3,4,5]
        
        Explanation:
        
        
        
        Example 3:
        
        Input: root = [1,null,3]
        
        Output: [1,3]
        
        Example 4:
        
        Input: root = []
        
        Output: []
         */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);

        Solution solution = new Solution();
        List<Integer> result = solution.rightSideView(root);

        System.out.println(result);

    }
}
