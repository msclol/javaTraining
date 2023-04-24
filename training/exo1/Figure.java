package training.exo1;

public class Figure {
    /* abscisse du centre */
    private double x;
    /* ordonnee du centre */
    private double y;

    /* Contructeur d'objet de la classe Figure */
    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    /* Methode get() ==> Encapsulation */
    public double getX() {
        return x;
    }

    /* Methode get() ==> Encapsulation */
    public double getY() {
        return y;
    }

    public void setCentre(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void afficher() {
        System.out.println("centre = (" + x + ", " + y + ")");
    }
}