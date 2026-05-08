import java.util.Scanner;
public class QueueMain24 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue: ");
        int jumlah = sc.nextInt();

        Queue24 Q = new Queue24(jumlah);

        int pilih;

        do {

            System.out.println("\nMenu");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Print");
            System.out.println("4. Peek");
            System.out.println("5. Clear");
            System.out.println("6. Exit");
            System.out.print("Pilih : ");
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data : ");
                    int dataMasuk = sc.nextInt();
                    Q.enqueue(dataMasuk);
                    break;

                case 2:
                    int dataKeluar = Q.dequeue();
                    System.out.println("Data keluar : " + dataKeluar);
                    break;

                case 3:
                    Q.print();
                    break;

                case 4:
                    Q.peek();
                    break;

                case 5:
                    Q.clear();
                    break;

                case 6:
                    System.out.println("Program selesai");
                    break;
            }
            } while (pilih != 6);
    }
}

