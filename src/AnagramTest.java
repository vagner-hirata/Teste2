import java.util.Arrays;

public class AnagramTest {
    public static void main(String[] args) {
        String o1 = "carro";
        String o2 = "arrco";
        char[] oArray1 = o1.toCharArray();
        char[] oArray2 = o2.toCharArray();
        Arrays.sort(oArray1);
        Arrays.sort(oArray2);
        String newO1 = new String(oArray1);
        String newO2 = new String(oArray2);
        if(newO1.equals(newO2) ) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

     }
}
