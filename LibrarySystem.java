public class LibrarySystem {
    public static void main(String[] args) {
        LinkedList library = new LinkedList();

        library.addBook("As Aventuras de Pi", "Yann Martel", 2001);
        library.addBook("A Incoveniente Loja de Conveniência", "Kim Ho-yeon", 2023);
        library.addBook("O Colecionador", "John Fowles", 1963);

        System.out.println("books in the library:");
        library.displayBooks();
    }

}