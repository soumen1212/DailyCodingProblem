
import java.util.*;

//dailyCodingProblem 3

class BinaryTree {

    public static void main(String args[])
    {

        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(17);
        tree.root.left = new TreeNode(8);
        tree.root.right = new TreeNode(20);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(12);
        tree.root.left.right.left = new TreeNode(10);
        tree.root.left.right.right = new TreeNode(14);

        String serialized = serialize(tree.root);
        System.out.println("Serialized tree:");
        System.out.println(serialized);
        System.out.println();


        TreeNode t = deserialize(serialized);


        inorder(t);
    }

    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            data = x;
        }
    }
    TreeNode root;


    public static String serialize(TreeNode root)
    {
        if (root == null) {
            return null;
        }
        Stack<TreeNode> s = new Stack<>();
        s.push(root);

        List<String> list = new ArrayList<>();
        while (!s.isEmpty()) {
            TreeNode t = s.pop();

            if (t == null) {
                list.add("-1");
            }
            else {

                list.add("" + t.data);
                s.push(t.right);
                s.push(t.left);
            }
        }
        return String.join(",", list);
    }

    static int t;


    public static TreeNode deserialize(String data)
    {
        if (data == null)
            return null;
        t = 0;
        String[] arr = data.split(",");
        return helper(arr);
    }

    public static TreeNode helper(String[] arr)
    {
        if (arr[t].equals("-1"))
            return null;

        TreeNode root
                = new TreeNode(Integer.parseInt(arr[t]));
        t++;
        root.left = helper(arr);
        t++;
        root.right = helper(arr);
        return root;
    }

    static void inorder(TreeNode root)
    {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }



}
