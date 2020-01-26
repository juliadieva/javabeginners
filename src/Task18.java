import java.io.*;
import java.util.Scanner;

public class Task18 {
    public static void main(String args[]) throws FileNotFoundException {
        String s;
        try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
        File file = new File("file.txt");
        Scanner scanner = new Scanner(file);
        int lines = 0;
        while (scanner.hasNextLine()) {
            lines++;
            String[] array = scanner.nextLine().split(" ");
        }
        String str;
        BufferedReader brbr = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите свой текст: ");
        try (FileWriter fw = new FileWriter("text.txt")) {
            int k;
            for (k = 0; k < lines; k++) {
                str = brbr.readLine();
                str = str + "\r\n";
                fw.write(str);
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}





