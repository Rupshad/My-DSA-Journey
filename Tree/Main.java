class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Main {
    
    // The Magic Printing Function (Inorder Traversal)
    static void printInorder(Node root) {
        // 1. Base Case: If we hit a dead end, stop and go back.
        if (root == null) {
            return;
        }
        
        // 2. Go Left as far as possible
        printInorder(root.left);
        
        // 3. Print the current node's data
        System.out.print(root.data + " ");
        
        // 4. Go Right
        printInorder(root.right);
    }

    public static void main(String[] args) {
        // 1. Build the Tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        
        /* The tree looks like this:
                 1
               /   \
              2     3
        */

        // 2. Print the Tree
        System.out.print("Tree Inorder output: ");
        printInorder(root); 
    }
}