import java.util.Stack;

public class BookHistory {
    private Stack<String> history = new Stack<>();

    public void addToHistory(String bookTitle) {
        history.push(bookTitle);
        System.out.println("\"" + bookTitle + "\" foi incluido ao histórico.");
    }

    public void viewLastViewedBook() {
        if (!history.isEmpty()) {
            System.out.println("Último livro visto: " + history.peek());
        } else {
            System.out.println("Nenhum histórico disponível.");
        }
    }

    public void displayHistory() {
        if (history.isEmpty()) {
            System.out.println("Histórico de navegação vazio.");
        } else {
            System.out.println("Histórico de Navegação: " + history);
        }
    }
}
