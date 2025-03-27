public class LinkedList {
    private Node head;

    public void addBook(String title, String author, int year){
        Book newBook = new Book(title, author, year);
        Node newNode = new Node(newBook);

        if (head == null){
            head = newNode;
        }else{
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void displayBooks(){
        Node temp = head;
        if (temp == null){
            System.out.println("Library is empty!");
            return;
        }
        while (temp != null){
            System.out.println(temp.book);
            temp = temp.next;
        }
    }
}
