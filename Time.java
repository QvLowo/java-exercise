public class Time {
    public static void main(String[] args) {
        // 將三年換算成 : 月/天/小時/秒/毫秒
        int year = 3, month = 12, day = 365, hour = 24, minute = 60, s = 60, ms = 1000;
        int AnsMonth = year * month;
        int AnsDay = year * day;
        int AnsHour = AnsDay * hour;
        int AnsMinute = AnsHour * minute;
        int AnsS = AnsMinute * s;
        long AnsMs = (long) AnsS * ms;
        System.out.println(
                "3年為" + AnsMonth + "個月" + AnsDay + "天" + AnsHour + "小時" + AnsMinute + "分鐘" + AnsS + "秒" + AnsMs + "毫秒");
    }
}
// QvL0306