import java.util.*;

public class Smartphone extends DispositivoElettronico {

    String nome;
    String password;

    // costruttore vuoto
    public Smartphone() {
    }

    // importo lo Scanner
    Scanner input = new Scanner(System.in);

    // override del metodo per avviare l'app con il loggin
    @Override
    public void avviaApplicazione(String nomeApp) {
        loggIn();
    }

    // metodo loggin da smartphone
    private void loggIn() {
        System.out.println("inserisci il nome utente");
        String nome = input.nextLine();
        System.out.println("inserisci la password");
        String password = input.nextLine();
        System.out.println("stai accedendo con le seguenti credenziali:");
        System.out.println("nome: " + nome);
        System.out.println("password: " + password);
    }

    // Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Scanner getInput() {
        return input;
    }

    public void setInput(Scanner input) {
        this.input = input;
    }

}
