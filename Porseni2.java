import java.util.Scanner;

public class Porseni2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namaCabor, namaAtlet, namaPoliteknik;
        int jmlCabor, jmlAtlet = 5, jmlPoliteknik;

        System.out.print("Masukkan jumlah politeknik yang ingin didaftarkan: ");
        jmlPoliteknik = sc.nextInt();
        System.out.print("Masukkan jumlah cabang olahraga: ");
        jmlCabor = sc.nextInt();
        sc.nextLine();

        for (int h = 1; h <= jmlPoliteknik; h++){
            System.out.print("Daftarkan Nama Politeknik Mu : ");
            namaPoliteknik = sc.nextLine();
        for (int i = 1; i <= jmlCabor; i++) {
            System.out.print("Masukkan cabang olahraga ke-" + i + ": ");
            namaCabor = sc.nextLine();
            for (int j = 1; j <= jmlAtlet; j++) {
                System.out.print("Masukkan nama atlet ke-" + j + ": ");
                namaAtlet = sc.nextLine();
            }
                System.out.println();
        }
    }
}
}