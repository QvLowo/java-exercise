public class Quiz {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("請輸入成績:");
        int i = sc.nextInt();
        // 分數40-60的學生須補考，判斷補考資格如下
        if (i >= 40 && i <= 60)
            System.out.println("恭喜你得到補考的機會!");
        else
            System.out.println("不用補考，快回家睡覺!");

    }
}
// QvL0307