import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    // attributi
    ArrayList<Libro> libri = new ArrayList<>();

    Scanner input = new Scanner(System.in);

    // metodo per aggiungere un libro
    public void aggiungiLibro() {
        // chiedo che libro vuole aggiungere, gli faccio inserire i dati
        System.out.println("che libro vuoi aggiungere?");
        String nomeLibro = input.nextLine();
        nomeLibro = input.nextLine();
        System.out.println("inserisci il numero di serie:");
        int numeroSerie = input.nextInt();
        System.out.println("inserisci l'anno di publicazione:");
        int annoPublicazione = input.nextInt();
        // gli chiedo quante copie vuole aggiungere
        System.out.println("inserisci il  numero di copie che vuoi aggiungere:");
        int numeroCopie = input.nextInt();
        // creo l'oggetto libro
        Libro libro = new Libro(nomeLibro, numeroSerie, annoPublicazione, numeroCopie);
        // lo aggiungo all'ArrayList
        libri.add(libro);
    }

    // metodo per rimuovere un libro
    public void rimuoviLibro() {
        // chiedo che libro vuole rimuovere, gli faccio inserire i dati
        System.out.println("che libro vuoi rimuovere?");
        String nomeLibro = input.nextLine();
        nomeLibro = input.nextLine();
        System.out.println("inserisci il numero di serie:");
        int numeroSerie = input.nextInt();
        System.out.println("inserisci l'anno di publicazione:");
        int annoPublicazione = input.nextInt();
        System.out.println("inserisci il  numero di copie dispibili:");
        int numeroCopie = input.nextInt();
        // creo l'oggetto
        Libro libro = findByName(nomeLibro);
        if (libro != null) {
            libri.remove(libro);
            System.out.println("libro rimosso");
        } else {
            System.out.println("il libro che vuoi rimuovere non è disponibile");
        }
    }

    // metodo per stampare i libri nell'elenco
    public void stampaLibriDisponibili() {
        if (libri.isEmpty()) {
            System.out.println("non ci sono libri disponibili nell'elenco");
        } else {
            System.out.println("elenco di libri disponibili:");
            for (Libro libro : libri) {
                System.out.println(libro);
            }
        }
    }

    public Libro findByName(String nome) {
        for (Libro libro : libri) {
            if (libro.getNome().equals(nome)) {
                return libro;
            }
        }
        return null;
    }
}