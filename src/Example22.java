public class Example22 {
    public static void main(String[] args) {
        int sum = 0, prod = 1;

        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
            prod = prod * i;
        }
        System.out.println("Addition = " + sum);
        System.out.println("Product = " + prod);
    }
}
