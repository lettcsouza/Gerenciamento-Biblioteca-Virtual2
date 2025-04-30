import java.util.LinkedList;
import java.util.Queue;

class BFS {
    public static boolean searchByTitle(TreeNode raiz, String tituloBuscado) {
        if (raiz == null) return false;

        Queue<TreeNode> fila = new LinkedList<>();
        fila.add(raiz);

        while (!fila.isEmpty()) {
            TreeNode node = fila.poll();

            System.out.println("Visitando: " + node.book.getTitle());

            if (node.book.getTitle().equalsIgnoreCase(tituloBuscado)) {
                System.out.println("Livro encontrado com BFS.");
                return true;
            }

            if (node.left != null) fila.add(node.left);
            if (node.right != null) fila.add(node.right);
        }

        return false;
    }
}
