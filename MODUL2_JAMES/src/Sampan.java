public class Sampan extends TransportasiAir {
    protected int layar;

    public Sampan(int jumlahKursi, int biaya, int layar) {
        super(jumlahKursi, biaya);
        this.layar = layar;
    }

    public int getLayar() {
        return layar;
    }

    @Override
    public void berlabuh() {
        System.out.println("Transportasi air dengan jenis Sampan sedang berlabuh di pantai tanpa jangkar");
    }

    public void berlabuh(int jangkar) {
        System.out
                .println("Transportasi air dengan jenis Sampan sedang berlabuh di pantai dengan " + jangkar
                        + " jangkar");
    }

    @Override
    public void berlayar() {
        // TODO Auto-generated method stub
        System.out.println("Transportasi air dengan jenis Sampan sedang berlayar dengan " + getLayar() + " layar");
    }

    @Override
    public void informasi() {
        // TODO Auto-generated method stub
        System.out.print("Transportasi air jenis Sampan");
        System.out.print(" dengan kursi berjumlah " + getJumlahKursi());
        System.out.println(" ditetapkan dengan biaya sebesar Rp. " + getBiaya());
    }

}
