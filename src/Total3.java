import java.math.RoundingMode;
import java.util.Scanner;
import java.math.BigDecimal;

public class Total3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текущий курс");
        double x = in.nextDouble();
        System.out.println("Введите сумму в рублях");
        double y = in.nextDouble();
        double z = y / x;
        BigDecimal z1 = new BigDecimal(Double.toString(z));
        z1 = z1.setScale(2, RoundingMode.HALF_UP);
        System.out.println("Сумма в долларах: " + z1);
    }
}


