package pe.isil;

public class App {

    public static void main(String[] args) {
        System.out.println("Running ...");

        // inyeccion de dependencia por constructor
        Gallery gallery = new Gallery(new Facebook());
        gallery.shared();

        // inyeccion de dependencia por setter
        gallery.setSharingApp(new Whatsapp());
        gallery.shared();

        gallery= new Gallery(new Pinterest());
        gallery.shared();

    }

}
