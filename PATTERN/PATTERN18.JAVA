public class Pattern18 {
    public static void main() {
        int n = 5;

        for (int row = 1; row <= n; row++) {
            for (char ch = 'E'; ch >= 'E' - row + 1; ch--) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}

OUTPUT:

E
ED
EDC
EDCB
EDCBA
