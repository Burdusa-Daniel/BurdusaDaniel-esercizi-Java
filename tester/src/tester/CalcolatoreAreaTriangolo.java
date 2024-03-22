package tester;

/**
 * Classe che calcola l'area di un triangolo.
 */
public class CalcolatoreAreaTriangolo {
    
    private double base;
    private double altezza;

    /**
     * Costruttore della classe.
     * @param base Lunghezza della base del triangolo.
     * @param altezza Altezza del triangolo.
     */
    public CalcolatoreAreaTriangolo(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }
    

    public CalcolatoreAreaTriangolo() {
	}


	/**
     * Calcola l'area del triangolo utilizzando la base e l'altezza fornite come parametri.
     * @return L'area del triangolo.
     */
    public double calcolaAreaConParametri() {
        return (base * altezza) / 2;
    }

    /**
     * Calcola l'area del triangolo utilizzando un array di dimensione 2 contenente base e altezza.
     * @param dimensioni Array contenente la base all'indice 0 e l'altezza all'indice 1.
     * @return L'area del triangolo.
     */
    public double calcolaAreaConArray(double[] dimensioni) {
        double base = dimensioni[0];
        double altezza = dimensioni[1];
        return (base * altezza) / 2;
    }

    public static void main(String[] args) {
        // Utilizzo del costruttore per iniettare base e altezza
        CalcolatoreAreaTriangolo calcolatore1 = new CalcolatoreAreaTriangolo(5, 3);
        double area1 = calcolatore1.calcolaAreaConParametri();
        System.out.println("Area del triangolo calcolata con i parametri: " + area1);

        // Utilizzo del metodo con array per iniettare base e altezza
        double[] dimensioni = {5, 3};
        CalcolatoreAreaTriangolo calcolatore2 = new CalcolatoreAreaTriangolo();
        double area2 = calcolatore2.calcolaAreaConArray(dimensioni);
        System.out.println("Area del triangolo calcolata con l'array: " + area2);
    }
}

