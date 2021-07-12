import java.io.*;
import java.util.*;

public class Problem01 {
    public static void main(String[] args) throws IOException {
//        /*Ввод проверочных данных*/
//        List<String> lines = new ArrayList<>(Arrays.asList("3", "sam 99912222", "tom 11122222", "harry 12299933", "sam", "edward", "harry"));
//        /*Ввод вручную*/
        List<String> lines = new ArrayList<>();
        Map<String, String> phoneBook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            lines.add(scanner.nextLine());
        }
        scanner.close();
        int n = Integer.parseInt(lines.get(0));
        for (int i = 1; i <= n; i++) {
            phoneBook.put(lines.get(i).split(" ")[0], lines.get(i).split(" ")[1]);
        }
        for (int i = n + 1; i < lines.size(); i++) {
            if (phoneBook.containsKey(lines.get(i))) {
                System.out.format("%s=%s\n", lines.get(i), phoneBook.get(lines.get(i)));
            } else System.out.println("Not found");
        }
    }
}
