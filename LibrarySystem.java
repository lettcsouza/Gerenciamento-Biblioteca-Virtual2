public class LibrarySystem {
    public static void main(String[] args) {
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

        // colocando livros no grafo
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
    }
}