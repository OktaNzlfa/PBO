public class Main {
    // Kelas Main
    public static void main(String[] args) {
        // Instansiasi Objek
        Kucing kucing = new Kucing("Garong", 2);
        Anjing anjing = new Anjing("Doggy", 3);
        Burung burung = new Burung("Lovely", 1);

        // Menampilkan suara hewan
        kucing.suara();
        anjing.suara();
        burung.suara();

        // Mengubah nama dan umur hewan
        anjing.setNama("Rex");
        anjing.setUmur(4);

        // Menampilkan suara dan informasi hewan
        System.out.println("Nama Anjing: " + anjing.getNama());
        System.out.println("Umur Anjing: " + anjing.getUmur());
        anjing.suara();
        System.out.println("Nama Kucing: " + kucing.getNama());
        System.out.println("Umur Kucing: " + kucing.getUmur());
        kucing.suara();
        System.out.println("Nama Burung: " + burung.getNama());
        System.out.println("Umur Burung: " + burung.getUmur());
        burung.suara();
    }
}
