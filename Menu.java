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

            do {
                // gli chiedo che ingrediente speciale vuole
                System.out.println("che ingrediente speciale vuoi? il prosciutto, la bresaola o la mortadella");
                String ingredienteSpeciale = input.nextLine();

                // controlli per capire cosa vuole
                if (ingredienteSpeciale.equalsIgnoreCase("prosciutto")) {
                    System.out.println("come ingrediente speciale hai scelto il prosciutto ");

                } else if (ingredienteSpeciale.equalsIgnoreCase("bresaola")) {
                    System.out.println("come ingrediente speciale hai scelto la bresaola");

                } else if (ingredienteSpeciale.equalsIgnoreCase("mortadella")) {
                    System.out.println("come ingrediente speciale hai scelto la mortadella");

                } else {
                    System.out.println("ops");
                }

                // gli chiedo che ingrediente speciale vuole
                System.out.println("che ingrediente vuoi ? pane integarale, pane ai cereali o pane normale");
                String ingredienteNormale = input.nextLine();

                // controlli per capire cosa vuole
                if (ingredienteNormale.equalsIgnoreCase("pane integrale")) {
                    System.out.println("come ingrediente speciale hai scelto il pane integrale ");

                } else if (ingredienteNormale.equalsIgnoreCase("pane ai cereali")) {
                    System.out.println("come ingrediente speciale hai scelto il pane ai cereali");

                } else if (ingredienteNormale.equalsIgnoreCase("pane normale")) {
                    System.out.println("come ingrediente speciale hai scelto il pane normale");

                } else {
                    System.out.println("ops");
                }
                System.out.println("hai scelto: " + ingredienteSpeciale + " con " + ingredienteNormale);
                int prezzoPiatto = prezzoNormale + prezzoSpeciale;
                System.out.println("il costo è di: " + prezzoPiatto);
                PiattoSpeciale piattoSpeciale = new PiattoSpeciale(ingredienteSpeciale, ingredienteNormale,
                        prezzoSpeciale, prezzoNormale);
            } while (inputUtente.equalsIgnoreCase("si"));
        } else {
            System.out.println("ciao");
        }

    }
}
