//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        String input;
        do {
            input = sc.nextLine();
            String[] parts = input.split(" ");
            int num[] = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                num[i] = Integer.parseInt(parts[i]);
            }
            if (num[0] == 1)
              list = new ArrayList<>(3);
            if (num[0]== 2)
                list = null;
            if (num[0] == 3) {
                try {
                    list.add(num[1]);
                }catch (NullPointerException e){
                    System.out.println("nulle");
                }

            }
            if (num[0] == 4)
                try {
                    System.out.println(list.get(num[1]));
                }catch (IndexOutOfBoundsException e) {
                    System.out.println("oute");
                }catch (NullPointerException e) {
                    System.out.println("nulle");
                }
            if (num[0] == 5)
                try {
                    System.out.println(num[1]/num[2]);
                }catch (ArithmeticException e) {
                    System.out.println("sefre");
                }

        } while (!input.equals("6"));
    }
}