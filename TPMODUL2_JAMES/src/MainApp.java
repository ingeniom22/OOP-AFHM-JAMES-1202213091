public class MainApp {
    public static void main(String[] args) throws Exception {
        Perangkat perangkat = new Perangkat("Adata", 16, 2.2F);
        perangkat.informasi();
        System.out.println();

        Laptop laptop = new Laptop("Seagate", 32, 4.5F, true);
        laptop.informasi();
        laptop.bukaGame("Valorant");
        laptop.kirimEmail("jamesmichael@gmail.com");
        laptop.kirimEmail("telyu@gmail.com", "dabes@gmail.com");
        System.out.println();

        Handphone handphone = new Handphone("Sandisk", 16, 3.2F, false);
        handphone.informasi();
        handphone.telfon(6234511);
        handphone.kirimSMS(6223122);
        handphone.kirimSMS(6230562, 6245793);
    }
}
