

public class LinkedList {
    Node head;

    class Node {
        Object data;
        Node next;//next is a reference

        public Node(Object data) {
            this.data = data;
        }
    }

   
   public void addLast(Object data) {
        Node newNode = new Node(data);
        if (head == null)
            head = newNode;
        else if (head.next == null)
            head.next = newNode;
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    


}

    
    public void display() {
        if (head == null)
            System.out.println("No elements to display");
        else {
            Node temp = head;
            while (temp.next != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Linked list !!!!");
        LinkedList linkedList = new LinkedList();
        linkedList.addLast(56);
        linkedList.addLast(30);
        linkedList.addLast(70);
        linkedList.display();


    }
}