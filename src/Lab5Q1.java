import java.util.*;

public class Lab5Q1 {
    public static void main(String[] args) {
        System.out.println(checkArr());
    }

    public static String checkArr() {
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();
        String result = "";

        for (int i = 0; i <= 10; i++) {
            list.add(rand.nextInt(50));
        }
        System.out.println(list);

        Scanner scan = new Scanner(System.in);
        System.out.println("Input number");
        int inputNum = scan.nextInt();

        for (int i : list) {
            if (list.contains(inputNum)) {
                result = inputNum + " is in the list";
            } else {
                result = inputNum + " is not in the list";
            }
        }
        return result;
    }
}