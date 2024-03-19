public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Libro libro = new Libro();
        biblioteca.aggiungiLibro();
        biblioteca.aggiungiLibro();
        biblioteca.stampaLibriDisponibili();
        biblioteca.rimuoviLibro();
        biblioteca.rimuoviLibro();
        biblioteca.stampaLibriDisponibili();
    }
}
