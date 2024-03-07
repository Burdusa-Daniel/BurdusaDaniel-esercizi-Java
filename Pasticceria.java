import java.util.Scanner;

public class Pasticceria {
    public static void main(String[] args) {
        // importo lo scanner
        Scanner input = new Scanner(System.in);
        // creo gli array degli ingredienti
        String[] basi = { "pan di Spagna", "biscotto" };
        String[] ripieni = { "crema pasticciera", "marmellata", "cioccolataa" };
        String[] frutta = { "banane", "fragole", "mix di frutta" };
        String[] decorazioni = { "glassa al cioccolato", "zucchero a velo" };

        // mostro all'utente gli ingredienti
        System.out.println("Le basi sono:");
        for (int i = 0; i < basi.length; i++) {
            System.out.println(basi[i]);
        }
        System.out.println("I ripieni sono:");
        for (int i = 0; i < ripieni.length; i++) {
            System.out.println(ripieni[i]);
        }
        System.out.println("I frutti sono:");
        for (int i = 0; i < frutta.length; i++) {
            System.out.println(frutta[i]);
        }
        System.out.println("Le decorazioni sono:");
        for (int i = 0; i < decorazioni.length; i++) {
            System.out.println(decorazioni[i]);
        }
        // chiedo all'utente se vuole fare manuale o random
        System.out.println("premi 1 se vuoi comporre la tua torta , premi 2 se la vuoi random");
        int rispostaUtente = input.nextInt();
        // caso in cui vuole fare manualmente
        switch (rispostaUtente) {
            case 1:
                System.out.println("che basi desideri?");
                String base = input.nextLine();
                base = input.nextLine(); // chiama l'imput obbligatoriamente quando viene saltato!

                for (int i = 0; i < basi.length; i++) {
                    if (base.equalsIgnoreCase(basi[i])) {
                        System.out.println("hai scelto: " + basi[i]);
                    }
                }

                System.out.println("che ripieni desideri?");
                String ripieno = input.nextLine();
                for (int i = 0; i < ripieni.length; i++) {
                    if (ripieno.equalsIgnoreCase(ripieni[i])) {
                        System.out.println("hai scelto: " + ripieni[i]);
                    }
                }

                System.out.println("che frutta desideri?");
                String frutto = input.nextLine();
                for (int i = 0; i < frutta.length; i++) {
                    if (frutto.equalsIgnoreCase(frutta[i])) {
                        System.out.println("hai scelto: " + frutta[i]);
                    }
                }

                System.out.println("che decorazioni desideri?");
                String decorazione = input.nextLine();
                for (int i = 0; i < decorazioni.length; i++) {
                    if (decorazione.equalsIgnoreCase(decorazioni[i])) {
                        System.out.println("hai scelto: " + decorazioni[i]);
                    }
                }
                // stampo la torta dell'utente
                System.out.println("la tua torta è :");
                System.out.println("base: " + base);
                System.out.println("ripieno: " + ripieno);
                System.out.println("frutta: " + frutto);
                System.out.println("decorazione: " + decorazione);

                break;
            // caso random
            case 2:
                System.out.println("la tua torta random è");
                System.out.println("base: " + basi[1]);
                System.out.println("ripieno: " + ripieni[1]);
                System.out.println("frutta: " + frutta[1]);
                System.out.println("decorazione: " + decorazioni[1]);

                break;
            default:
                break;
        }

    }
}
