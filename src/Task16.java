import java.io.*;

public class Task16 {
    public static void main(String args[]) {
        String s;
        try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}

