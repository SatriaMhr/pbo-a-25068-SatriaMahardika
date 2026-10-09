public abstract class BangunDatar {

    private final String nama;

    protected BangunDatar(String nama) {
        this.nama = nama;
    }

    public abstract double luas();

    public abstract double keliling();

    public String getNama() {
        return nama;
    }

    @Override
    public String toString() {
        return String.format("%-12s luas=%10.2f  keliling=%10.2f", nama, luas(), keliling());
    }
}
