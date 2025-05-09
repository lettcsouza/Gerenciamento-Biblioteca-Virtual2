import java.util.Map;
import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        //Graph bookGraph = new Graph();
        Graph bookGraph = new Graph();

        // criando livros
        Book b1 = new Book("As Aventuras de Pi", "Yann Martel", 2001);
        Book b2 = new Book("O Colecionador", "John Fowles", 1963);
        Book b3 = new Book("Dracula", "Bram Stoker", 1897);
        Book b4 = new Book("Bem-vindos à livraria Hyunam-dong", "Hwang Bo-Reum", 2023);
        Book b5 = new Book("A inconveniente loja de conveniência", "Kim Ho-Yeon", 2023);
        Book b6 = new Book("Príncipe Lestat", "Anne Rice", 2014);
        Book b7 = new Book("Crepúsculo", "Stephenie Meyer", 2005);
        Book b8 = new Book("Crime e Castigo", "Fiódor Dostoiévski", 1866);
        Book b9 = new Book("Antes que o café esfrie", "Toshikazu Kawaguchi", 2022);
        Book b10 = new Book("Anna Karerina", "Liev Tolstói", 1878);

       //colocando livros no grafo
        bookGraph.addBook(b1);
        bookGraph.addBook(b2);
        bookGraph.addBook(b3);
        bookGraph.addBook(b4);
        bookGraph.addBook(b5);
        bookGraph.addBook(b6);
        bookGraph.addBook(b7);
        bookGraph.addBook(b8);
        bookGraph.addBook(b9);
        bookGraph.addBook(b10);

        // criando recomendações (arestas = conexões)
        bookGraph.addRecommendation(b4, b5);
        bookGraph.addRecommendation(b3, b8);
        bookGraph.addRecommendation(b2, b3);
        bookGraph.addRecommendation(b1, b4);
        bookGraph.addRecommendation(b3, b7);
        bookGraph.addRecommendation(b3, b6);
        bookGraph.addRecommendation(b6, b7);
        bookGraph.addRecommendation(b4, b9);
        bookGraph.addRecommendation(b5, b9);
        bookGraph.addRecommendation(b8, b10);

        // mostrando o grafo completo
        System.out.println("Library Book Graph:");
        bookGraph.displayGraph();

        // recomendações específicas
        System.out.println("--- Recommendations ---");
        bookGraph.displayRecommendations(b3);
        bookGraph.displayRecommendations(b5);

        /*tree.insert(b1);
        tree.insert(b2);
        tree.insert(b3);
        tree.insert(b4);
        tree.insert(b5);
        tree.insert(b6);
        tree.insert(b7);
        tree.insert(b8);
        tree.insert(b9);
        tree.insert(b10);

        System.out.println("Books in alphabetical order, by title:");
        tree.inOrderTraversal();*/

        System.out.println("----------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o livro de origem para recomendação: ");
        String tituloOrigem = scanner.nextLine();

        Book livroOrigem = null;
        for (Book livro : bookGraph.getBooks()){
            if (livro.getTitle().equalsIgnoreCase(tituloOrigem)){
                livroOrigem = livro;
                break;
            }
        }

        if (livroOrigem != null){
            Map<Book, Integer> recommendations = bookGraph.dijkstrMap(livroOrigem);
            System.out.println("\n--- Livros Recomendados: ---");
            recommendations.entrySet()
                           .stream()
                           .sorted(Map.Entry.comparingByValue())
                           .forEach(entry -> System.out.println("livro: " + entry.getKey().getTitle() + "| Distância: " + entry.getValue()));
        } else{
            System.out.println("livro nao encontrado.");
        }

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("digite o titulo do livro que queira buscar: ");
        String tituloBusca = scanner.nextLine();

        boolean encontrado = DFS.searchByTitle(tree.getRoot(), tituloBusca);
        if (!encontrado){
            System.out.println("livro nao encontrado com dfs.");
        }

        boolean encontrado = BFS.searchByTitle(tree.getRoot(), tituloBusca);
        if (!encontrado){
            System.out.println("livro nao encontrado com bfs.");
        }

        System.out.println("Generating Books Names...");
        String[] bookNames = BooksNamesGenerator.generateNames(20);

        //ordenando com bubble
        String[] bubbleSorted = BubbleSort.order(bookNames);
        System.out.println("Comparações Bubble Sort: " + BubbleSort.comparacoes);

        //ordenando com merge
        String[] mergeSorted = MergeSort.order(bookNames);
        System.out.println("Comparações Merge Sort: " + MergeSort.comparacoes);*/
    }
}