public class TransportasiAir {
    protected int jumlahKursi;
    protected int biaya;

    public TransportasiAir(int jumlahKursi, int biaya) {
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public int getBiaya() {
        return biaya;
    }

    public void informasi() {
        System.out.print("Transportasi air jenis tidak diketahui");
        System.out.print(" dengan kursi berjumlah " + getJumlahKursi());
        System.out.println(" ditetapkan dengan biaya sebesar Rp. " + getBiaya());

    }

    public void berlayar() {
        System.out.println("Transportasi air dengan jenis tidak diketahui sedang berlayar");
    }

    public void berlabuh() {
        System.out.println("Transportasi air dengan jenis tidak diketahui sedang berlabuh di pantai");
    }

}
