public class DrawTriangle {
    public static void main(String[] args) {
        // 印出A-E排序的金字塔
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--)
                System.out.print(" ");
            for (int k = 0; k < i + 1; k++)
                System.out.print((char) (65 + i));
            for (int L = 1; L < i + 1; L++)
                System.out.print((char) (65 + i));

            System.out.println();
        }
    }
}
// QvL0307