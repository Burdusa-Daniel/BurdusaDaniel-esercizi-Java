import java.util.*;

public class Smartphone extends ResocontoDigitale {

    String nome;
    String password;

    public Smartphone(String nome, String password) {
        this.nome = nome;
        this.password = password;
    }

    Scanner input = new Scanner(System.in);

    @Override
    public void avviaApplicazione() {
        loggIn();
    }

    private void loggIn() {
        System.out.println("inserisci il nome utente");
        String nome = input.nextLine();
        System.out.println("inserisci la password");
        String password = input.nextLine();
        System.out.println("stai accedendo con le seguenti credenziali:");
        System.out.println("nome: " + nome);
        System.out.println("password: " + password);
    }

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
