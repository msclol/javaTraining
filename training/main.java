package training;

public class main {
    public static void main(String[] args) {
        Voiture maVoiture = new Voiture();
        maVoiture.setCouleur("Bleue");
        System.out.println("Attribut dela classe mère ==>" + maVoiture.marque);
        System.out.println("Attribut de la classe fille ==>" + maVoiture.getCouleur());
        maVoiture.freiner();
        maVoiture.klaxonner();

        Chien milou = new Chien();
        Chat neko   = new Chat();

        milou.criAnimal();
        neko.criAnimal();

    
}
}
