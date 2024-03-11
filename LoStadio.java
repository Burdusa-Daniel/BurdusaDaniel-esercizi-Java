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

            // randomizzo il numero di spettatori il sabato e la domenica da 1 a 90000
            int spettatoriSabato = random.nextInt(90000) + 1;
            int spettatoriDomenica = random.nextInt(90000) + 1;

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

    }
}
