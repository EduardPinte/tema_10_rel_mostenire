public class Avioane {
    private final String tipavion;
    private String avionID;
    private int putereTotala;

    public Avioane(String avionID, String tipavion, int putereTotala) {
        this.avionID = avionID;
        this.tipavion = tipavion;
        this.putereTotala = putereTotala;
    }

    public String getAvionID() {
        return avionID;
    }

    public void setAvionID(String avionID) {
        this.avionID = avionID;
    }

    public int getPutereTotala() {
        return putereTotala;
    }

    public void setPutereTotala(int putereTotala) {
        this.putereTotala = putereTotala;
    }

    public String getTipavion() {
        return tipavion;
    }
}