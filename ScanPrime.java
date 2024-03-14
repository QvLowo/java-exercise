public class ScanPrime {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("請輸入整數:");
        int num = sc.nextInt();

        boolean isprime = true;
        if (num > 2) {
            for (int i = 2; i < num; ++i)
                if (num % i == 0) {
                    isprime = false;
                    break;
                }
        } else if (num != 2)
            isprime = false;

        if (isprime)
            System.out.println(num + "是質數");
        else
            System.out.println(num + "不是質數");
    }
}
// QvL0307