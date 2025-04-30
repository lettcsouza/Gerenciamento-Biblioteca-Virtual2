public class DFS {
    public static boolean searchByTitle(TreeNode node,String titleSearched){
        if (node == null) return false;

        System.out.println("Visitsando: " + node.book.getTitle());
        if (node.book.getTitle().equalsIgnoreCase(titleSearched)){
            System.out.println("livro encontrado com dfs: " + node.book.getTitle());
            return true;
        }

        return searchByTitle(node.left, titleSearched) || searchByTitle(node.right, titleSearched);
    }
}
