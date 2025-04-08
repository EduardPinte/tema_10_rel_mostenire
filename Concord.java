public class Concord extends AvionComercial {
    public Concord(String avionID, int putereTotala, long maxPasageri) {
        super(avionID, putereTotala, maxPasageri);
    }

    public void goSuperSonic() {
        System.out.println("AvionID " + getAvionID() + " - Mod Supersonic activat!");
    }

    public void goSubSonic() {
        System.out.println("AvionID " + getAvionID() + " - Mod Supersonic dezactivat!");
    }
}