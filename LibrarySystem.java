public class LibrarySystem {
    public static void main(String[] args) {
        LinkedList library = new LinkedList();

        library.addBook("As Aventuras de Pi", "Yann Martel", 2001);
        library.addBook("A Incoveniente Loja de Conveniência", "Kim Ho-yeon", 2023);
        library.addBook("O Colecionador", "John Fowles", 1963);

        System.out.println("books in the library:");
        library.displayBooks();
    
        System.out.println("\n----------------\n");

        BookQueue bookQueue = new BookQueue();
        BookHistory bookHistory = new BookHistory();

        bookQueue.addToWaitList("Pedro");
        bookQueue.addToWaitList("Gabo");
        bookQueue.addToWaitList("Leleca");

        bookQueue.displayWaitList();
        bookQueue.serveNextUser(); //pedro recebe o livro
        bookQueue.displayWaitList();

        System.out.println("\n----------------\n");

        bookHistory.addToHistory("As Aventuras de Pi");
        bookHistory.addToHistory("A Inconveniente Loja de Conveniência");
        bookHistory.addToHistory("O Colecionador");

        bookHistory.displayHistory();
        bookHistory.viewLastViewedBook();
    }
}