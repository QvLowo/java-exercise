public class Discount {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("請輸入購物金額:");
        int i = sc.nextInt();
        /*
         * 2000元以下九折
         * 2000-2999元 八五折
         * 3000-4999元 八折
         * 5000元以上 七折
         */
        if (i < 2000)
            i = (int) (i * 0.9);
        else if (i >= 2000 && i < 3000)
            i = (int) (i * 0.85);
        else if (i >= 3000 && i < 5000)
            i = (int) (i * 0.8);
        else if (i >= 5000)
            i = (int) (i * 0.7);
        if (i > 0)
            System.out.println("折扣金額為:" + i);
        else
            System.out.println("輸入金額錯誤");

    }
}

// QvL0307