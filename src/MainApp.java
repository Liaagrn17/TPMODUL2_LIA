public class MainApp {
    public static void main(String[] args) throws Exception {
        Perangkat perangkat1 = new Perangkat("Notebook", 32,4.00);
        perangkat1.informasi();
        System.out.println("");

        Laptop laptop1 = new Laptop("Acer", 16, 4.00,true);
        laptop1.informasi();
        laptop1.bukaGame("Zuma");
        laptop1.kirimEmail("Lia17@gmail.com");
        laptop1.kirimEmail("Liaajadeh@gmail.com","anggreni@gmail.com");
        System.out.println("");

        Handphone handphone1 = new Handphone("Iphone",256,7.00, true);
        handphone1.informasi();
        handphone1.telfon(628957854);
        handphone1.kirimSMS(662769633);
        handphone1.kirimSMS(628923344,628782344);
        System.out.println("");
    }
}