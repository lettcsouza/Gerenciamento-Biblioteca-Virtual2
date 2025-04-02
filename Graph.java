import java.util.*;

public class Graph {
    private Map<Book, Set<Book>> bookGraph = new HashMap<>();

    public void addBook(Book book){
        bookGraph.putIfAbsent(book, new HashSet<>());
    }

    public void addRecommendation(Book book1, Book book2){
        bookGraph.putIfAbsent(book1, new HashSet<>());
        bookGraph.putIfAbsent(book2, new HashSet<>());

        bookGraph.get(book1).add(book2);
        bookGraph.get(book2).add(book1); //criando conexões direcionadas
    }

    public void displayRecommendations(Book book){
        if (bookGraph.containsKey(book)){
            System.out.println("Recommendations for " + book.getTitle() + ":");
        }else{
            System.out.println("Books not found.");
        }
    }

    public void displayGraph(){
        for (Book book : bookGraph.keySet()){
            System.out.println(book + " is connected to: " + bookGraph.get(book));
        }
    }
}
