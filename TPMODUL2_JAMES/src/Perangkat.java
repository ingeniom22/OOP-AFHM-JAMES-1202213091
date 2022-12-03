public class Perangkat {
    protected String drive;
    protected int ram;
    protected float processor;

    public Perangkat(String drive, int ram, float processor) {
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
    }

    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public float getProcessor() {
        return processor;
    }

    public void setProcessor(float processor) {
        this.processor = processor;
    }

    public void informasi() {
        System.out.print("Perangkat tidak diketahui memiliki drive tipe " + getDrive());
        System.out.print(" dan RAM sebesar " + getRam() + " GB");
        System.out.print(" dan processor dengan kecepatan " + getProcessor() + " GHz.");
        System.out.println();
    }
}
