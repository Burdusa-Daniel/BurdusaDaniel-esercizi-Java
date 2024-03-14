public class Tablet extends DispositivoElettronico {

    float punti;
    int id;

    // costruttore vuoto
    public Tablet() {
    }

    // override del metodo per avviare l'app id e punti random
    @Override
    public void avviaApplicazione(String nomeApp) {
        int id = (int) (Math.random() * 10000);
        float punti = (float) (Math.random() * 10000);
        System.out.println("L'id utente è: " + id);
        System.out.println("con " + punti + " punti");
    }

    // Getters & Setters
    public float getPunti() {
        return punti;
    }

    public void setPunti(float punti) {
        this.punti = punti;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
