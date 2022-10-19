import java.util.*;

public class Lab5Q2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i <= 10; i++) {
            list.add(rand.nextInt(50));
        }
        LinkedList<Integer> linkedlist = new LinkedList<>();
        linkedlist.addAll(list);

        System.out.println(linkedlist);
        list.set(0, -5);
        System.out.println(list);
    }
}
