import java.util.Scanner;

public class MainKRS {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AntrianKRS antri = new AntrianKRS(10);

        int pilih;

        do {

            System.out.println("\n=== MENU ANTRIAN KRS ===");
            System.out.println("1. Tambah antrian");
            System.out.println("2. Proses KRS");
            System.out.println("3. Tampilkan semua");
            System.out.println("4. Tampilkan 2 depan");
            System.out.println("5. Tampilkan belakang");
            System.out.println("6. Jumlah antrian");
            System.out.println("7. Jumlah sudah proses");
            System.out.println("8. Sisa belum proses");
            System.out.println("9. Kosongkan antrian");
            System.out.println("10. Exit");

            System.out.print("Pilih menu : ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {

                case 1:

                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();

                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();

                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();

                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();

                    Mahasiswa mhs =
                            new Mahasiswa(nim, nama, prodi, kelas);

                    antri.enqueue(mhs);

                    break;

                case 2:
                    antri.dequeue();
                    break;

                case 3:
                    antri.tampilSemua();
                    break;

                case 4:
                    antri.tampilDepan();
                    break;

                case 5:
                    antri.tampilBelakang();
                    break;

                case 6:
                    antri.jumlahAntrian();
                    break;

                case 7:
                    antri.jumlahSudahProses();
                    break;

                case 8:
                    antri.sisaBelumProses();
                    break;

                case 9:
                    antri.clear();
                    break;

                case 10:
                    System.out.println("Program selesai");
                    break;
            }

        } while (pilih != 10);
    }
}