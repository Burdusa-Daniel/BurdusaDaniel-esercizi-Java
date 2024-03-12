public class PiattoSpeciale {
    //variabili
    private String ingredienteSpeciale;
    public String ingredienteNormale;
    public int prezzoSpeciale;
    public int prezzoNormale;
//costruttore
    public PiattoSpeciale(String ingredienteSpeciale, String ingredienteNormale, int prezzoSpeciale,
            int prezzoNormale) {
        this.ingredienteSpeciale = ingredienteSpeciale;
        this.ingredienteNormale = ingredienteNormale;
        this.prezzoSpeciale = prezzoSpeciale;
        this.prezzoNormale = prezzoNormale;
    }
//Getters e Setters
    public String getIngredienteSpeciale() {
        return ingredienteSpeciale;
    }

    public void setIngredienteSpeciale(String ingredienteSpeciale) {
        this.ingredienteSpeciale = ingredienteSpeciale;
    }

    public String getIngredienteNormale() {
        return ingredienteNormale;
    }

    public void setIngredienteNormale(String ingredienteNormale) {
        this.ingredienteNormale = ingredienteNormale;
    }

    public int getPrezzoSpeciale() {
        return prezzoSpeciale;
    }

    public void setPrezzoSpeciale(int prezzoSpeciale) {
        this.prezzoSpeciale = prezzoSpeciale;
    }

    public int getPrezzoNormale() {
        return prezzoNormale;
    }

    public void setPrezzoNormale(int prezzoNormale) {
        this.prezzoNormale = prezzoNormale;
    }

}
