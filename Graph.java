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
            Set<Book> recommendations = bookGraph.get(book);

            if (recommendations.isEmpty()){
                System.out.println("No recommendations found!");
            } else{
                for (Book recommendedBook : recommendations){
                    System.out.println("  - " + recommendedBook);
                }
            } 
        } else{
            System.out.println("Book not found!");
        }
    }

    public void displayGraph(){
        for (Book book : bookGraph.keySet()){
            System.out.println(book + " is connected to: " + bookGraph.get(book));
        }
    }
}
