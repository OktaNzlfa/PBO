class Hewan {
    private String nama;
    private int umur;

    // Constructor Overloading
    public Hewan(String nama) {
        this.nama = nama;
        this.umur = 0;
    }

    public Hewan(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Getter
    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    // Method Polimorfisme
    public void suara() {
        System.out.println("Hewan bersuara");
    }

}
