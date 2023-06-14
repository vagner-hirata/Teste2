
import java.util.HashSet;

public class HappyNumberTest {
    public static void main(String[] args) {
        HashSet<Integer> visitado = new HashSet<>();
        int n = 19;
        while(visitado.add(n)) {
            visitado.add(n);
            n = sumOfSquare(n);
            if(n == 1) {
                System.out.println("True");
            }

        }
        System.out.println("False");

    }

    private static int sumOfSquare(int n) {
        int output = 0;
        while(n != 0) {
            int digit = n % 10;
            digit = digit * digit;
            output += digit;
            n = n / 10;
        }
        return output;
    }


}
