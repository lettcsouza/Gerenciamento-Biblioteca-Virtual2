public class BinarySearchTree {
    private TreeNode root;

    public void insert(Book book){
        root = insertRec(root, book);
    }

    private TreeNode insertRec(TreeNode node, Book book){
        if (node == null) return new TreeNode(book);

        if (book.getTitle().compareToIgnoreCase(node.book.getTitle()) < 0){
            node.left = insertRec(node.left, book);
        } else{
            node.right = insertRec(node.right, book);
        }

        return node;
    }

    public void inOrderTraversal(){
        inOrderRec(root);
    }

    private void inOrderRec(TreeNode node){
        if (node != null){
            inOrderRec(node.left);
            System.out.println(node.book);
            inOrderRec(node.right);
        }
    }
}
