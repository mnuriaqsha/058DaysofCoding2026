import java.util.Scanner;

public class Day57 {
    public static void main(String[] args) {
        Scanner hi = new Scanner(System.in);

        System.out.print("Masukkan angka N: ");
        int n = hi.nextInt();

        int i = n;

        System.out.println("Angka " + n + " sampai ganjil 1");
        while (i >= 1) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i--;
        }

        i = n;

        System.out.println("\nAngka " + n + " sampai genap 2");
        while (i >= 2) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i--;
        }

        hi.close();
    }
}
