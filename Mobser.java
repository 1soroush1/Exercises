import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mobser javad = new Mobser();

        while (true) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) continue;

            String[] parts = line.split("\\s+");
            int deter;

            try {
                deter = Integer.parseInt(parts[0]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
                continue;
            }

            if (deter >= 9) break;

            switch (deter) {
                case 1:
                case 2:
                    if (parts.length < 2) {
                        System.out.println("Missing name");
                        break;
                    }
                    String name = parts[1];
                    javad.add(deter, name);
                    break;

                case 3:
                case 4:
                    javad.list_count(deter);
                    break;

                case 5:
                case 6:
                    javad.clear(deter);
                    break;

                case 7:
                case 8:
                    if (parts.length < 2) {
                        System.out.println("Missing index");
                        break;
                    }
                    int index;
                    try {
                        index = Integer.parseInt(parts[1]);
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid index");
                        break;
                    }
                    System.out.println(javad.print(deter, index));
                    break;

                default:
                    System.out.println("Invalid command");
            }
        }
    }
}


 class Mobser{

    ArrayList<String> goods =  new ArrayList<>();
    ArrayList<String> bads = new ArrayList<>();

    void add(int deter, String name){
        if(deter==1)
            goods.add(name);
        if(deter==2)
            bads.add(name);
    }
    void list_count(int deter){
        if(deter==3)
            System.out.println(goods.size());
        if(deter==4)
            System.out.println(bads.size());
    }
    void clear(int deter){
        if (deter==5)
            goods.clear();
        if (deter==6)
            bads.clear();
    }
    String print(int deter, int num){
        num -= 1;
        if (deter==7)
            if (num < goods.size())
                return goods.get(num);
            else return "not available!";
        if (deter==8)
            if (num < bads.size())
                return bads.get(num);
            else return "not available!";
        return "";
    }

}
