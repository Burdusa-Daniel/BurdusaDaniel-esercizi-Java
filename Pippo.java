import java.util.*;

public class Pippo {
    public static void main(String[] args) {
        // importo lo scanner
        Scanner input = new Scanner(System.in);
        int contatoreCicli = 0;// variabile con la quale conto i cicli

        for (int i = 1; i > 0;) {
            // chiedo all'utente se vuole fare un'operazione
            System.out.println("vuoi fare un'operazione? ");
            String a = input.nextLine();
            // se l'utente vuole fare un'operazione
            if (a.equalsIgnoreCase("si")) {
                contatoreCicli++;
                // faccio scegliere che operazione vuole
                System.out.println(
                        "che operazione vuoi fare, premi: 1 per la somma , 2 per la sottrazione , 3 per la moltiplicazione , 4 per la divisione.");
                int x = input.nextInt();
                switch (x) {
                    // addizione
                    case 1:
                        System.out.println("dammi il primo numero");
                        int primoNumero = input.nextInt();
                        System.out.println("dammi il secondo numero");
                        int secondoNumero = input.nextInt();
                        int somma = primoNumero + secondoNumero;
                        System.out.println("il risulato è: " + somma);
                        break;
                    // sottrazione
                    case 2:
                        System.out.println("dammi il primo numero");
                        int terzoNumero = input.nextInt();
                        System.out.println("dammi il secondo numero");
                        int quartoNumero = input.nextInt();
                        int sottrazione = terzoNumero - quartoNumero;
                        System.out.println("il risultato è: " + sottrazione);
                        break;
                    // moltiplicazione
                    case 3:
                        System.out.println("dammi il primo numero");
                        int quintoNumero = input.nextInt();
                        System.out.println("dammi il secondo numero");
                        int sestoNumero = input.nextInt();
                        int moltiplicazione = quintoNumero * sestoNumero;
                        System.out.println("il risultato è: " + moltiplicazione);
                        break;
                    // divisione
                    case 4:
                        System.out.println("dammi il primo numero");
                        int settimoNumero = input.nextInt();
                        System.out.println("dammi il secondo numero");
                        int ottavoNumero = input.nextInt();
                        int divisione = settimoNumero / ottavoNumero;
                        System.out.println("il risultato è: " + divisione);
                        break;
                    default:
                        System.out.println("errore");
                        break;
                }
                // stampo il numero di volte che ha fatto operazioni
                System.out.println("hai fatto " + contatoreCicli + " operazione/i");
                // caso dove l'utente non vuole più fare operazioni
            } else if (a.equalsIgnoreCase("no")) {
                i--;// fa smettere il ciclo
                System.out.println("hai fatto " + contatoreCicli + " operazione/i");
            }
        }
    }
}
