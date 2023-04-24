package training.exo1;

class Rectangle extends Figure {
    private double largeur;
    private double longueur;

    public Rectangle(double x, double y, double larg, double longueur) {
        super(x, y);
        this.largeur = larg;
        this.longueur = longueur;
    }

    public double surface() {
        return largeur * longueur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double l) {
        longueur = l;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double l) {
        largeur = l;
    }

    public void afficher() {
        /* Appel à la méthode getCentre() de la classe mère Figure */
        super.afficher();
        System.out.println("Largeur = " + largeur);
        System.out.println("Longeur = " + longueur);
    }
}