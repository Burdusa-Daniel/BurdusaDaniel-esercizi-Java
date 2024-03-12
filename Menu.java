import java.util.*;

public class Menu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // prezzi degli ingredienti
        int prezzoNormale = 2;
        int prezzoSpeciale = 3;

        System.out.println("vuoi ordinare?");
        String inputUtente = input.nextLine();

        if (inputUtente.equalsIgnoreCase("si")) {
            String riordine;
            do {
                // gli chiedo che ingrediente speciale vuole
                System.out.println("che ingrediente speciale vuoi? il prosciutto, la bresaola o la mortadella");
                String ingredienteSpeciale = input.nextLine();

                // controlli per capire cosa vuole
                switch (ingredienteSpeciale) {
                    case "prosciutto":
                        System.out.println("come ingrediente speciale hai scelto il prosciutto ");

                        break;
                    case "bresaola":
                        System.out.println("come ingrediente speciale hai scelto la bresaola");

                        break;
                    case "mortadella":
                        System.out.println("come ingrediente speciale hai scelto la mortadella");

                        break;
                    default:
                        System.out.println("ops");
                        break;
                }

                // gli chiedo che ingrediente speciale vuole
                System.out.println("che ingrediente vuoi ? pane integarale, pane ai cereali o pane normale");
                String ingredienteNormale = input.nextLine();

                // controlli per capire cosa vuole
                switch (ingredienteNormale) {
                    case "pane integrale":
                        System.out.println("come ingrediente speciale hai scelto il pane integrale ");
                        break;
                    case "pane normale":
                        System.out.println("come ingrediente speciale hai scelto il pane normale");

                        break;
                    case "pane ai cereali":
                        System.out.println("come ingrediente speciale hai scelto il pane ai cereali");

                        break;

                    default:
                        System.out.println("ops");
                        break;
                }
                
                // creo l'oggetto PiattoSpeciale
                PiattoSpeciale piattoSpeciale = new PiattoSpeciale(ingredienteSpeciale, ingredienteNormale,
                        prezzoSpeciale, prezzoNormale);
                System.out.println("hai scelto un panino con: " + piattoSpeciale.getIngredienteSpeciale() + " "
                        + piattoSpeciale.getIngredienteNormale());

                // calcolo il prezzo del panino e lo stampo
                int prezzoPiatto = prezzoNormale + prezzoSpeciale;
                System.out.println("il costo del piatto è: " + prezzoPiatto);

                // chiedo all'utente se vuole riodinare
                System.out.println("vuoi riordinare?");
                riordine = input.nextLine();

            } while (riordine.equalsIgnoreCase("si"));

            // se l'utente non vuole ordinare
        } else {
            System.out.println("ciao");
        }

    }
}
