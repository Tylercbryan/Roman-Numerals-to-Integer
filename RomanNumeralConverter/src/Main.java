import java.util.Scanner;
public class Main {


    //Integer to Roman Numerals
    /* Roman Numerals conversions to remember:
    I = 1
    V = 5
    X = 10
    L = 50
    C = 100
    D = 500
    M = 1000
    */

    public static String intToRoman(int num) {
        String[] thousands = new String[]
                {"", "M", "MM", "MMM"};
        String[] hundreds =
                {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] tens =
                {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] units =
                {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return thousands[num / 1000] +
                hundreds[(num % 1000) / 100] +
                tens[(num % 100) / 10] +
                units[num % 10];
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number 1-3999 to convert to Roman Numerals: ");
        int num = input.nextInt();
        System.out.println("Result: " + intToRoman(num));
    }
}