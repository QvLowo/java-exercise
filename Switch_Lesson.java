public class Switch_Lesson {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("請輸入星期:");
        String week = sc.nextLine();
        week = week.toUpperCase();
        String lesson = " ";
        switch (week) {
            case "MON":
                lesson = "鋼琴課";
                break;
            case "TUE":
                lesson = "圍棋課";
                break;
            case "WED":
                lesson = "英文課";
                break;
            case "THU":
                lesson = "桌球課";
                break;
            case "FRI":
                lesson = "跆拳道";
                break;
            case "SAT":
                lesson = "電腦課";
                break;
            case "SUN":
                lesson = "作文課";
                break;
            default:
                System.out.println("輸入星期錯誤");
                return;
        }
        System.out.println(week + "上" + lesson);
    }
}
// QvL0307