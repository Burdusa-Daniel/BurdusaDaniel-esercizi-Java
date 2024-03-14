public class ResocontoDigitale {

    // metodo per dare il resoconto digitale con tutte le informazioni

    public void resoconto(DispositivoElettronico dispositivoElettronico, Smartphone smartphone, Tablet tablet) {
        String nomeApp = "instagram";
        System.out.println("il tuo resoconto digitale è: ");
        dispositivoElettronico.avviaApplicazione(nomeApp);
        smartphone.avviaApplicazione(nomeApp);
        tablet.avviaApplicazione(nomeApp);
    }
}
