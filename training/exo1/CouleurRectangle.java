package training.exo1;

public class CouleurRectangle extends Rectangle {
    private final String couleur;

    public CouleurRectangle(double x, double y, double larg, double longueur, String couleur) {
        /* Appel au constructeur de la classe mère Rectangle */
        super(x, y, larg, longueur);
        this.couleur = couleur;
    }

    public void afficher() {
        super.afficher();
        System.out.println("Couleur du rectangle = " + couleur);
    }
}
