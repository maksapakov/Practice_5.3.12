import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter(" |\n");
        Double sumDouble = 0.0;
        try {
            do {
                if (Math.abs(Double.parseDouble(scanner.next())) >= 0) {
                    sumDouble += Double.parseDouble(scanner.next());
                }
            } while (scanner.hasNext());
        } catch (Exception e) {

        }
        System.out.println(String.format("%.6f", sumDouble));
    }
}
