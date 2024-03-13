public class Tablet extends DispositivoElettronico {
    float punti;
    int id;

    public Tablet(float punti, int id) {
        this.punti = (float) (Math.random() + 10000);
        this.id = 1;
    }

    @Override
    public void avviaApplicazione(String nomeApp) {
        System.out.println("l'applicazione che stai avviando è:" + nomeApp);
        System.out.println("L'id utente è: " + id);
        System.out.println("con " + punti + " punti");
    }

}
