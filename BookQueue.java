import java.util.LinkedList;
import java.util.Queue;

public class BookQueue {
    private Queue<String> waitList = new LinkedList<>();

    public void addToWaitList(String user) {
        waitList.add(user);
        System.out.println(user + " foi incluido à lista de espera.");
    }

    public void serveNextUser() {
        if (!waitList.isEmpty()) {
            System.out.println(waitList.poll() + ", o livro que você queria está disponível agora!");
        } else {
            System.out.println("A lista de espera está vazia.");
        }
    }

    public void displayWaitList() {
        if (waitList.isEmpty()) {
            System.out.println("Nenhum usuário na lista de espera.");
        } else {
            System.out.println("Lista de Espera: " + waitList);
        }
    }
}

