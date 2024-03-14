public class Sum {
    public static void main(String[] args) {
        // 計算從1加到使用者輸入的整數之總和
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("請輸入整數:");
        int Max_Count = sc.nextInt();
        int sum = 0;
        for (int count = 1; count <= Max_Count; count++) {
            sum += count;
        }
        System.out.println("從1加到" + Max_Count + "的總和是" + sum);
    }
}
// QvL0307