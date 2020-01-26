import java.io.*;

public class Task17 {
    public static void main(String args[]) {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Признак конца ввода - строка 'стоп'");
        try (FileWriter fw = new FileWriter("text.txt")) {
            do {
                System.out.print("Введите строку: ");
                str = br.readLine();
                if (str.compareTo("стоп") == 0) break;
                str = str + "\r\n";
                fw.write(str);
            } while (str.compareTo("стоп") != 0);
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}