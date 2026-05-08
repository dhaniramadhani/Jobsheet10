public class AntrianKRS {

    Mahasiswa[] data;
    int front, rear, size, max;
    int sudahProses = 0;

    public AntrianKRS(int n) {

        max = n;
        data = new Mahasiswa[max];
        front = rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(Mahasiswa mhs) {

        if (isFull()) {
            System.out.println("Antrian penuh");
        } else {

            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear = (rear + 1) % max;
            }

            data[rear] = mhs;
            size++;
        }
    }

    public void dequeue() {

        if (size < 2) {
            System.out.println("Antrian kurang dari 2");
            return;
        }

        System.out.println("Memproses 2 mahasiswa");

        for (int i = 0; i < 2; i++) {

            data[front].tampilData();
            System.out.println();

            front = (front + 1) % max;

            size--;
            sudahProses++;
        }

        if (size == 0) {
            front = rear = -1;
        }
    }

    public void tampilSemua() {

        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {

            int i = front;

            while (true) {

                data[i].tampilData();
                System.out.println();

                if (i == rear) {
                    break;
                }

                i = (i + 1) % max;
            }
        }
    }

    public void tampilDepan() {

        if (!isEmpty()) {

            int i = front;

            for (int j = 0; j < 2 && j < size; j++) {

                data[i].tampilData();
                System.out.println();

                i = (i + 1) % max;
            }
        }
    }

    public void tampilBelakang() {

        if (!isEmpty()) {
            data[rear].tampilData();
        }
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah antrian : " + size);
    }

    public void jumlahSudahProses() {
        System.out.println("Sudah diproses : " + sudahProses);
    }

    public void sisaBelumProses() {
        System.out.println("Belum diproses : " + (30 - sudahProses));
    }

    public void clear() {

        front = rear = -1;
        size = 0;

        System.out.println("Antrian dikosongkan");
    }
}