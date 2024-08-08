class TreeNode1 {
    int value;
    TreeNode1 left, right;

    TreeNode1(int value) {
        this.value = value;
        left = right = null;
    }
}

class Main {
    public static void preOrder(TreeNode1 root) {
        if (root == null) {
            return;
        }
        System.out.print(root.value + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(TreeNode1 root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.value + " ");
        inOrder(root.right);
    }

    public static void postOrder(TreeNode1 root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.value + " ");
    }

    public static void main(String[] args) {
        TreeNode1 root = new TreeNode1(1);
        root.left = new TreeNode1(2);
        root.right = new TreeNode1(3);
        root.left.left = new TreeNode1(4);
        root.left.right = new TreeNode1(5);
        root.right.left = new TreeNode1(6);
        root.right.right = new TreeNode1(7);
        root.left.right.left = new TreeNode1(8);
        root.right.right.left = new TreeNode1(9);
        root.right.right.right = new TreeNode1(10);

        // Main tree = new Main();
        System.out.println("PreOrder Traversal: ");
        preOrder(root);

        System.out.println("\nInOrder Traversal: ");
        inOrder(root);

        System.out.println("\nPostOrder Traversal: ");
        postOrder(root);
    }
}