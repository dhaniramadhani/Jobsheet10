public class AntrianLayanan24 {

    Mahasiswa24[] data;
    int front;
    int rear;
    int size;
    int max;

    public AntrianLayanan24(int n) {

        max = n;
        data = new Mahasiswa24[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(Mahasiswa24 dt) {

        if (isFull()) {

            System.out.println("Antrian penuh");

        } else {

            if (isEmpty()) {
                front = rear = 0;
            } else {

                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }

            data[rear] = dt;
            size++;
        }
    }

    public Mahasiswa24 dequeue() {

        Mahasiswa24 dt = null;

        if (isEmpty()) {

            System.out.println("Antrian kosong");

        } else {

            dt = data[front];
            size--;

            if (size == 0) {
                front = rear = -1;
            } else {

                if (front == max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }

        return dt;
    }

    public void peek() {

        if (!isEmpty()) {

            System.out.println("Antrian terdepan:");

            data[front].tampilkanData();

        } else {

            System.out.println("Antrian kosong");
        }
    }

    public void print() {

        if (isEmpty()) {

            System.out.println("Antrian kosong");

        } else {

            int i = front;

            while (i != rear) {

                data[i].tampilkanData();
                System.out.println();

                i = (i + 1) % max;
            }

            data[i].tampilkanData();

            System.out.println("Jumlah antrian = " + size);
        }
    }

    public void clear() {

        if (!isEmpty()) {

            front = rear = -1;
            size = 0;

            System.out.println("Antrian berhasil dikosongkan");

        } else {

            System.out.println("Antrian masih kosong");
        }
    }

    public void getJumlahAntrian() {

        System.out.println("Jumlah antrian : " + size);
    }

    public void lihatAkhir() {

        if (!isEmpty()) {

            System.out.println("Antrian paling belakang:");

            data[rear].tampilkanData();

        } else {

            System.out.println("Antrian kosong");
        }
    }
    
}