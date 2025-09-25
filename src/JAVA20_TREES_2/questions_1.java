package JAVA20_TREES_2;

import java.math.MathContext;

public class questions_1 {

public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val) {
            this.val = val;
        }
    }

public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node (4);
        Node d = new Node (5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        b.right = e;

//        preorder(root);
//        System.out.println();

//        postorder(root);
//        System.out.println();

//        inorder(root);
//        System.out.println();

//        int size = size(root);
//        System.out.println(size);

//        int sum = sum(root);
//        System.out.println(sum);

//        int max = max(root);
//        System.out.println(max);

//        int min = min(root);
//        System.out.println(min);

//        int level = level(root);
//        System.out.println(level);

//        int height = height(root);
//        System.out.println(height);

//        nthLevel(root,3);
//        System.out.println();

//        BFS(root);
//        System.out.println();

    }


    // PRE ORDER -
    static void preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // POST ORDER -
    static void postorder(Node root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }

    // IN ORDER -
    static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    // SIZE OF TREE -
    static int size(Node root){
        if (root==null) return 0;
        return 1 + size(root.left) + size(root.right);
    }

    // SUM OF TREE -
    static int sum(Node root){
        if(root==null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }

    // MAX OF TREE -
    static int max(Node root){
        if(root==null) return Integer.MIN_VALUE;
        int a = root.val;
        int b = max(root.left);
        int c = max(root.right);
        return Math.max(a, Math.max(b,c));
        // or
        // return Math.max(root.val, Math.max(max(root.left),max(root.right)));
    }

    // MIN OF TREE -
    static int min(Node root){
        if(root==null) return Integer.MAX_VALUE;
        int a = root.val;
        int b = min(root.left);
        int c = min(root.right);
        return Math.min(a, Math.min(b,c));
        // or
        // return Math.min(root.val, Math.min(min(root.left),min(root.right)));
    }

    // LEVEL OF TREE -
    static int level(Node root){
        if(root==null) return 0;
        int a = level(root.left);
        int b = level(root.right);
        return 1 + Math.max(a,b);
    }

    // HEIGHT OF TREE -
    static int height(Node root){
        if(root==null || (root.left==null && root.right==null)) return 0;
        int a = height(root.left);
        int b = height(root.right);
        return 1 + Math.max(a,b);
    }

    // PRINT Nth LEVEL OF TREE -
    static void nthLevel(Node root , int n){
        if (root == null) return;
        if(n==1) {
            System.out.print(root.val+" ");
            return ; // this returns stops the unnecessary traversals if node is found
        }
        nthLevel(root.left,n-1);
        nthLevel(root.right,n-1);
    }

    // LEVEL ORDER TRAVERSAL (BFS - Breadth First Search) -
    // This algo is not preferred as it's time complexity is high
    static void BFS(Node root){
        int level = level(root); // calling level function to get level
        for (int i = 1; i <=level ; i++) {
//            nthLevel(root,i); // calling nthLevel function to get nthLevel Nodes
//            or
            nthLevel(root,i);
            System.out.println();
        }
    }


}
