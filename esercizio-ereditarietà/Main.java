public class Main {
    public static void main(String[] args) {

        // creazione dell'oggetto ResocontoDigitale per richiamare il metodo resoconto
        ResocontoDigitale r = new ResocontoDigitale();

        // creazione degli oggetti per inserirli come parametri per il resoconto
        DispositivoElettronico d = new DispositivoElettronico();
        Smartphone s = new Smartphone();
        Tablet t = new Tablet();

        // richiamo del metodo per il resoconto digitale
        r.resoconto(d, s, t);

    }
}