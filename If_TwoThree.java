public class If_TwoThree {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("請輸入整數:");
        int i = sc.nextInt();
        if (i % 6 == 0)
            System.out.println(i + "是3和2的倍數");
        else if (i % 3 == 0)
            System.out.println(i + "是3的倍數");
        else if (i % 2 == 0)
            System.out.println(i + "是2的倍數");
        else
            System.out.println(i + "不是3也不是2的倍數");
    }
}
// QvL0307