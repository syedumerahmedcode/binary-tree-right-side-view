import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        /**
         * edge case scenario
         */
        if (root == null) {
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        /**
         * We store everything in a queue and for a particular level keep polling values 
         * till i == levelSize - 1. If yes, that the element that we want for your answer. 
         * hence, we add it to the result list
         */
        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                /**
                 * Add last node's value of the current level to the result list
                 */
                if (i == levelSize - 1) {
                    result.add(currentNode.val);
                }

                /**
                 * Add child nodes to the queue for the next level
                 */
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
        }
        return result;
        
    }

}
