import java.util.Scanner;
public class PercentageCal {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sub1 marks: ");
        float a = sc.nextFloat();
        System.out.print("Enter Sub2 marks: ");
        float b = sc.nextFloat();
        System.out.print("Enter Sub3 marks: ");
        float c = sc.nextFloat();
        System.out.print("Enter Sub4 marks: ");
        float d = sc.nextFloat();
        System.out.print("Enter Sub5 marks: ");
        float e = sc.nextFloat();
        float sum = (a+b+c+d+e);
        float pr = (sum/500)*100;
        System.out.print("Percentage : " + pr);
    }
}
