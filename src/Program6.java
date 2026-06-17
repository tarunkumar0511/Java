public class Program6 {
    public static void main (String[] args) {
        // Swap 2 numbers
        int a = 5;
        int b = 8;
        System.out.println("Before Swap");
        System.out.println(a);
        System.out.println(b);

        int temp = a;
        a=b;
        b=temp;

        System.out.println("After Swap");
        System.out.println(a);
        System.out.println(b);
    }
}
