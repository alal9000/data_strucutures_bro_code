import java.util.LinkedList;

public class LinkedLists {
    public LinkedLists() {
    }

    public void myMethod() {
        LinkedList<String> linkedList = new LinkedList();
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        linkedList.add(4, "E");
        linkedList.remove("E");
        System.out.println((String)linkedList.peekFirst());
        System.out.println((String)linkedList.peekLast());
        linkedList.addFirst("0");
        linkedList.addLast("G");
        String first = (String)linkedList.removeFirst();
        String last = (String)linkedList.removeLast();
        System.out.println(linkedList);
    }
}