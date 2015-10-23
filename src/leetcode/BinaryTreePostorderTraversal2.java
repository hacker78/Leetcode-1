package leetcode;

import java.util.ArrayList;
import java.util.List;
/* Given a binary tree, return the postorder traversal of its nodes' values.
 * For example:
 * Given binary tree {1,#,2,3},
 * 1
 *   \
 *     2
 *   /
 * 3
 * return [3,2,1].
 * Note: Recursive solution is trivial, could you do it iteratively?
 */
public class BinaryTreePostorderTraversal2 {
	public List<Integer> postorderTraversal(TreeNode root) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		if (root == null)
			return list;
		return helper(root, list);
	}

	public ArrayList<Integer> helper(TreeNode root, ArrayList<Integer> list) {
		if (root != null) {
			list = helper(root.left, list);
			list = helper(root.right, list);
			list.add(root.val);
		}
		return list;
	}
}
