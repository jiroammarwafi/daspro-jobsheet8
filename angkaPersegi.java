import java.util.Scanner;
public class angkaPersegi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte N;

        System.out.print("Masukkan N (minimal 3) = ");
        N = sc.nextByte();

        if (N < 3) {
            System.out.println("N harus minimal 3.");
            return;
        }

        for (int o = 1; o <= N; o++) {
            for (int i = 1; i <= N; i++) {
                if (o == 1 || o == N) {
                    System.out.print(N + " ");
                } else {
                    if (i == 1 || i == N) {
                        System.out.print(N + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}