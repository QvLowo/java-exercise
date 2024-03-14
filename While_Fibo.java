public class While_Fibo {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("請輸入範圍:");
        int MaxNumber = sc.nextInt();
        int num1 = 1, num2 = 1; // a b
        System.out.print(num1 + " " + num2);
        int numNext = num1 + num2; // c
        while (numNext <= MaxNumber) {
            System.out.print(" " + numNext);
            num1 = num2; // a => b
            num2 = numNext; // b => c
            numNext = num1 + num2; // c = a + b
        }
    }
}
// QvL0307