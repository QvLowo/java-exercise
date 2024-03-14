public class Temperature {
    public static void main(String[] args) {
        // F = 9/5*C+32
        int C1 = 0, C2 = 54, C3 = 98;
        int F1 = (int) (9.0 / 5.0 * C1 + 32); // int/int 會捨去小數點
        int F2 = (int) (9.0 / 5.0 * C2 + 32);
        int F3 = (int) (9.0 / 5.0 * C3 + 32);
        System.out.println("攝氏" + C1 + "度為華氏:" + F1 + "度");
        System.out.println("攝氏" + C2 + "度為華氏:" + F2 + "度");
        System.out.println("攝氏" + C3 + "度為華氏:" + F3 + "度");
    }
}
// QvL0306