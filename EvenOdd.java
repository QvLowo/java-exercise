public class EvenOdd {
    public static void main(String[] args) {
        int a = 20;
        String even = (a % 2 == 0) ? "偶數" : "奇數";
        System.out.println(a + "為" + even);
        int b = 77;
        String odd = (b % 2 == 0) ? "偶數" : "奇數";
        System.out.println(b + "為" + odd);
    }
}
// QvL0307