import java.util.Scanner;
public class LayananAkademikSIAKAD24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AntrianLayanan24 antrian =
        new AntrianLayanan24(5);

        int pilihan;

        do {

            System.out.println("\n=== MENU ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Cek Antrian Terdepan");
            System.out.println("4. Cek Semua Antrian");
            System.out.println("5. Cek Jumlah Antrian");
            System.out.println("6. Cek Antrian Belakang");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("8. Exit");

            System.out.print("Pilih menu : ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {

                case 1:

                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();

                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();

                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();

                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();

                    Mahasiswa24 mhs =
                            new Mahasiswa24(
                                    nim,
                                    nama,
                                    prodi,
                                    kelas);

                    antrian.enqueue(mhs);

                    break;

                case 2:

                    Mahasiswa24 data =
                            antrian.dequeue();

                    if (data != null) {

                        System.out.println("Antrian yang dipanggil:");

                        data.tampilkanData();
                    }
                    break;

                case 3:
                    antrian.peek();
                    break;

                case 4:
                    antrian.print();
                    break;

                case 5:
                    antrian.getJumlahAntrian();
                    break;

                case 6:
                    antrian.lihatAkhir();
                    break;

                case 7:
                    antrian.clear();
                    break;

                case 8:
                    System.out.println("Program selesai");
                    break;
            }
        } while (pilihan != 8);
    }
}