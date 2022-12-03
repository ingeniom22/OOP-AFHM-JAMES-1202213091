public class Laptop extends Perangkat {
    protected boolean webcam;

    public Laptop(String drive, int ram, float processor, boolean webcam) {
        super(drive, ram, processor);
        this.webcam = webcam;
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

    public boolean getWebcam() {
        return this.webcam;
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

    public void setWebcam(boolean webcam) {
        this.webcam = webcam;
    }

    @Override
    public void informasi() {
        System.out.print("Laptop ini memiliki drive tipe " + getDrive());
        System.out.print(" dengan RAM sebesar " + getRam() + " GB");
        System.out.print(" dan processor dengan kecepatan " + getProcessor() + " GHz. ");

        if (getWebcam()) {
            System.out.print("Selain itu, laptop ini juga memiliki webcam.");
            System.out.println();
        } else {
            System.out.print("Selain itu, laptop ini TIDAK memilki webcam.");
            System.out.println();
        }
    }

    public void bukaGame(String namaGame) {
        System.out.println("Laptop berhasil membuka " + namaGame);
    }

    public void kirimEmail(String email1) {
        System.out.println("Laptop berhasil mengirim email ke " + email1);
    }

    public void kirimEmail(String email1, String email2) {
        System.out.println("Laptop berhasil mengirim email ke " + email1 + " dan ke " + email2);
    }

}
