package pe.isil;

public class Gallery {

    SharingApp sharingApp;

    public Gallery() {
    }

    public Gallery(SharingApp sharingApp) {
        this.sharingApp = sharingApp;
    }

    public void setSharingApp(SharingApp sharingApp) {
        this.sharingApp = sharingApp;
    }

    public void shared(){
        sharingApp.send();
    }

}
