public class Tablet extends ResocontoDigitale {
    float punti;
    int id;

    public Tablet(){
        
    }

    public Tablet(float punti, int id) {
        this.punti = (float) (Math.random() + 10000);
        this.id = 1;
    }

    @Override
    public void avviaApplicazione(String nomeApp) {
        System.out.println("L'id utente è: " + id);
        System.out.println("con " + punti + " punti");
    }

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
