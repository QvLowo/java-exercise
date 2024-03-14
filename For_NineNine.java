public class For_NineNine {
    public static void main(String[] args) {
        // 九九乘法表
        int num1 = 1, num2 = 1;
        int result = 0;
        for (num1 = 1; num1 <= 9; num1++) {
            for (num2 = 1; num2 <= 9; num2++) {
                result = num1 * num2;
                System.out.print(num1 + "*" + num2 + "=" + result + "\t");
            }
            System.out.print("\n");
        }
    }
}
// QvL0307