import java.util.*;

public class LoStadio {

    public static void main(String[] args) {
        // inzializzo i varii oggetti
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // creo le ArrayList
        ArrayList<Integer> idSpettatori = new ArrayList<>();
        ArrayList<Integer> guadagniTotali = new ArrayList<>();

        // chiedo quanti week-end vuole sapere le informazioni
        System.out.println("quanti week-end vuoi? ");
        int weekEnd = input.nextInt();

        // creo delle variabili di supporto che userò dopo
        int contatore = 0;
        int totaleSpettatori = 0;
        int totaleGuadagni = 0;

        while (contatore < weekEnd) {// utilizzo la variabile contatore di prima

            // randomizzo il numero di spettatori il sabato e la domenica da 1 a 99000
            int spettatoriSabato = random.nextInt(99000) + 1;
            int spettatoriDomenica = random.nextInt(99000) + 1;

            // li stampo
            System.out.println("gli spettatori il sabato sono: " + spettatoriSabato);
            System.out.println("gli spettatori la domanica sono: " + spettatoriDomenica);

            // calcolo il guadagno totale il sabato e la domenica
            int guadagnoSabato = spettatoriSabato * 20;
            int guadagnoDomenica = spettatoriDomenica * 15;

            // li stampo
            System.out.println("il totale dei dei guadagni il sabato sono: " + guadagnoSabato);
            System.out.println("il totale dei guadagni la domenica sono: " + guadagnoDomenica);

            // calcolo guadagni e numero di spettatori generale
            totaleSpettatori += spettatoriDomenica + spettatoriSabato;
            totaleGuadagni += guadagnoDomenica + guadagnoSabato;

            // li stampo
            System.out.println("spettatori totali: " + totaleSpettatori);
            System.out.println("guadagni totali: " + totaleGuadagni);

            // aggiungo i dati che ho calcolato nelle liste
            idSpettatori.add(totaleSpettatori);
            guadagniTotali.add(totaleGuadagni);

            contatore++;// contatore che aumento per il ciclo while
        }

        // faccio scegliere all'utente cosa vuole sapere
        System.out.println("che cosa vuoi sapere?");
        System.out.println("premi 1 per la media massima di spettatori");
        System.out.println("premi 2 per la media minima di spettatori");
        System.out.println("premi 3 per la media massima di guadagni");
        System.out.println("premi 4 per la media minima di guadagni");
        int x = input.nextInt();

        if (x >= 1 && x <= 4) {
            switch (x) {

                // massimo di spettatori
                case 1:
                    int massimoSpettatori = idSpettatori.get(0);
                    for (int i = 0; i < idSpettatori.size(); i++) {
                        if (idSpettatori.get(i) < massimoSpettatori) {
                            massimoSpettatori = massimoSpettatori;
                        } else {
                            massimoSpettatori = idSpettatori.get(i);
                        }
                    }
                    System.out.println("il massimo numero di spettatori è: " + massimoSpettatori);
                    break;

                // minimo spettatori
                case 2:
                    int minimoSpettatori = idSpettatori.get(0);
                    for (int i = 0; i < idSpettatori.size(); i++) {
                        if (idSpettatori.get(i) > minimoSpettatori) {
                            minimoSpettatori = minimoSpettatori;
                        } else {
                            minimoSpettatori = idSpettatori.get(i);
                        }
                    }
                    System.out.println("il minimo numero di spettatori è:" + minimoSpettatori);
                    break;

                // massimo guadagno
                case 3:
                    int massimoGuadagni = guadagniTotali.get(0);
                    for (int i = 0; i < guadagniTotali.size(); i++) {
                        if (guadagniTotali.get(i) < massimoGuadagni) {
                            massimoGuadagni = massimoGuadagni;
                        } else {
                            massimoGuadagni = guadagniTotali.get(i);
                        }
                    }
                    System.out.println("il massimo guadagno  è: " + massimoGuadagni);
                    break;

                // minimo guadagno
                case 4:
                    int minimoGuadagni = guadagniTotali.get(0);
                    for (int i = 0; i < guadagniTotali.size(); i++) {
                        if (guadagniTotali.get(i) > minimoGuadagni) {
                            minimoGuadagni = minimoGuadagni;
                        } else {
                            minimoGuadagni = guadagniTotali.get(i);
                        }
                    }
                    System.out.println("il guadagno minimo  è: " + minimoGuadagni);
                    break;
                default:
                    System.out.println("ops");
                    
                    break;

            }

        }

    }
}
