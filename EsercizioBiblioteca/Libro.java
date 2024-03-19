import java.util.Scanner;

public class Libro extends Biblioteca {
    // attributi
    private String nome;
    private int numeroSerie;
    private int annoPublicazione;
    int numeroDiCopieDisponibii = 10;
    int numeroDiCopieInPrestito = 5;

    // costruttore vuoto
    public Libro() {

    }

    // costruttore pieno
    public Libro(String nome, int numeroSerie, int annoPublicazione, int numeroDiCopieDisponibii) {
        this.nome = nome;
        this.numeroSerie = numeroSerie;
        this.annoPublicazione = annoPublicazione;
        this.numeroDiCopieDisponibii = numeroDiCopieDisponibii;
    }

    // Getters&Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public int getAnnoPublicazione() {
        return annoPublicazione;
    }

    public void setAnnoPublicazione(int annoPublicazione) {
        this.annoPublicazione = annoPublicazione;
    }

    Scanner input = new Scanner(System.in);

    // metodo prestaLibro
    public void prestaLibro() {
        // chiedo all'utente il libro che vuole prendere in prestito, e gli faccio
        // inserire i dati
        System.out.println("che libro vuoi prendere in prestito?");
        String nomeLibro = input.nextLine();
        System.out.println("indicami il numero di serie");
        int numeroSerie = input.nextInt();
        System.out.println("indicami l'anno di pubblicazione");
        int annoPublicazione = input.nextInt();
        // aumento e diminuisco il numero di copie disponibili e in prestito
        numeroDiCopieDisponibii--;
        numeroDiCopieInPrestito++;
        System.out.println("il numero di copie disponibili è: " + numeroDiCopieDisponibii);
        System.out.println("il numero di copie in prestito è: " + numeroDiCopieInPrestito);
    }

    // metodo per restituire un libro
    public void restituisciLibro() {
        // chiedo all'utente che libro vuole restituire, e gli faccio inserire i dati
        System.out.println("che libro vuoi restituire?");
        String nomeLibro = input.nextLine();
        System.out.println("indicami il numero di serie");
        int numeroSerie = input.nextInt();
        System.out.println("indicami l'anno di pubblicazione");
        int annoPublicazione = input.nextInt();
        // aumento e diminuisco il numero di copie in prestito e disponibili
        numeroDiCopieDisponibii++;
        numeroDiCopieInPrestito--;
        System.out.println("il numero di copie disponibili è: " + numeroDiCopieDisponibii);
        System.out.println("il numero di copie in prestito è: " + numeroDiCopieInPrestito);
    }

    @Override
    public String toString() {
        return "Libro : nome = " + nome + ", numeroSerie = " + numeroSerie + ", annoPublicazione = " + annoPublicazione
                + ", copie dispinibili = " + numeroDiCopieDisponibii;
    }

}
