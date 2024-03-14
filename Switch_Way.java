public class Switch_Way {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("請輸入字母:");
        char direction = sc.next().charAt(0);
        String way = " ";
        direction = Character.toUpperCase(direction); // 輸入的字母轉成大寫
        switch (direction) {
            case 'R':
                way = "向右走";
                break;
            case 'L':
                way = "向左走";
                break;
            case 'U':
                way = "向上走";
                break;
            case 'D':
                way = "向下走";
                break;
            default:
                System.out.println("輸入字母錯誤");
                return;
        }
        System.out.println(direction + "請" + way);
    }
}
// QvL0307