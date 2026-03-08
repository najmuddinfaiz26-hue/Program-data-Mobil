//Muhammad Faiz Najmuddin
//255150707111013

    import java.util.Scanner;

    public class MainMobil {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Mobil m1 = new Mobil();

        System.out.print("Masukan Kecepatan : ");
        int kecepatan = input.nextInt();
        m1.setKecepatan(kecepatan);

        System.out.print("Masukkan waktu tempuh (jam): ");
        double waktu = input.nextDouble();
        m1.setWaktu(waktu);
        input.nextLine();

        System.out.print("Masukan manufaktur : ");
        String manufaktur = input.nextLine();
        m1.setManufaktur(manufaktur);

        System.out.print("Masukkan no plat : ");
        String noplat = input.nextLine();
        m1.setNoPlat(noplat);

        System.out.print("Masukkan warna : ");
        String warna = input.nextLine();
        m1.setWarna(warna);

        m1.displayMessage();

        System.out.println("================");

        Mobil m2 = new Mobil();

        System.out.print("Masukkan Kecepatan : ");
        int kecepatan2 = input.nextInt();
        m2.setKecepatan(kecepatan2);

        System.out.print("Masukkan waktu tempuh (jam) : ");
        double waktu2 = input.nextDouble();
        m2.setWaktu(waktu2);
        input.nextLine();

        System.out.print("Masukkan Manufaktur : ");
        String manufaktur2 = input.nextLine();
        m2.setManufaktur(manufaktur2);

        System.out.print("Masukkan no Plat : ");
        String noPlat2 = input.nextLine();
        m2.setNoPlat(noPlat2);

        System.out.print("Masukkan warna : ");
        String warna2 = input.nextLine();
        m2.setWarna(warna2);

        m2.displayMessage();

        System.out.println("================");

        // merubah warna dari objek m1
        System.out.println("Mobil pada objek m1 diubah menjadi warna baru");

        System.out.print("Masukkan warna baru : ");
        String warnabaru = input.nextLine();
        m1.setWarna(warnabaru);

        // menampilkan hasil perubahan
        m1.displayMessage();
    }
}
