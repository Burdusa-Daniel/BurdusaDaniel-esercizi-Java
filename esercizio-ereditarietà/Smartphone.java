import java.util.*;

public class Smartphone extends DispositivoElettronico {

    String nome;
    String password;

    public Smartphone(String nome, String password) {
        this.nome = nome;
        this.password = password;
    }

    Scanner input = new Scanner(System.in);

    @Override
    public String avviaApplicazione(String nomeApp) {
        return super.avviaApplicazione(nomeApp);

    }

    public void loggIn() {
        System.out.println("inserisci il nome utente");
        String nome = input.nextLine();
        System.out.println("inserisci la password");
        String password = input.nextLine();
    }

}
