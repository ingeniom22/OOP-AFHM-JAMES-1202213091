public class Handphone extends Perangkat {
    protected boolean fingerprint;

    public Handphone(String drive, int ram, float processor, boolean fingerprint) {
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }

    @Override
    public String getDrive() {
        return super.getDrive();
    }

    @Override
    public float getProcessor() {
        return super.getProcessor();
    }

    @Override
    public int getRam() {
        return super.getRam();
    }

    public boolean getFingerprint() {
        return this.fingerprint;
    }

    @Override
    public void setDrive(String drive) {
        super.setDrive(drive);
    }

    @Override
    public void setProcessor(float processor) {
        super.setProcessor(processor);
    }

    @Override
    public void setRam(int ram) {
        super.setRam(ram);
    }

    public void setFingerprint(boolean fingerprint) {
        this.fingerprint = fingerprint;
    }

    @Override
    public void informasi() {
        System.out.print("Handphone ini memiliki drive tipe " + getDrive());
        System.out.print(" dengan RAM sebesar " + getRam() + " GB");
        System.out.print(" dan processor dengan kecepatan " + getProcessor() + " GHz. ");

        if (getFingerprint()) {
            System.out.print("Selain itu, handphone ini juga memiliki fingerprint.");
            System.out.println();
        } else {
            System.out.print("Selain itu, handphone ini TIDAK memilki fingerprint.");
            System.out.println();
        }
    }

    public void telfon(int nohp) {
        System.out.println("Handphone berhasil menyambungkan telfon ke nomor " + nohp);
    }

    public void kirimSMS(int nohp) {
        System.out.println("Handphone berhasil mengirim SMS ke nomor " + nohp);
    }

    public void kirimSMS(int nohp1, int nohp2) {
        System.out.println("Handphone berhasil mengirim SMS ke nomor " + nohp1 + " dan ke nomor " + nohp2);
    }

}
