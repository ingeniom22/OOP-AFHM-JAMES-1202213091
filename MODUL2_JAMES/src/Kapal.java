public class Kapal extends TransportasiAir {
    protected String mesin;

    public Kapal(int jumlahKursi, int biaya, String mesin) {
        super(jumlahKursi, biaya);
        this.mesin = mesin;
    }

    public String getMesin() {
        return mesin;
    }

    @Override
    public void berlabuh() {
        System.out.println("Transportasi air dengan jenis Kapal sedang berlabuh di pantai");
    }

    @Override
    public void berlayar() {
        System.out.print("Transportasi air dengan jenis Kapal sedang berlayar");
        System.out.print(" menggunakan mesin " + getMesin());
        System.out.println(" dengan kecepatan yang tidak stabil");
    }

    public void berlayar(int kecepatan) {
        System.out.print("Transportasi air dengan jenis Kapal sedang berlayar");
        System.out.print(" menggunakan mesin " + getMesin());
        System.out.println(" dengan kecepatan stabil di kisaran " + kecepatan + " knot");

    }

    @Override
    public void informasi() {
        System.out.print("Transportasi air jenis Kapal");
        System.out.print(" dengan kursi berjumlah " + getJumlahKursi());
        System.out.println(" ditetapkan dengan biaya sebesar Rp. " + getBiaya());
    }

}
