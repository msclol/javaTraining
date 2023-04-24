package training;

public class Voiture extends Automobile {
    private String couleur;

    public String getCouleur() {
        return this.couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    

    void freiner(){
        System.out.println("Je freine la voiture");
    }
    
    
    
}
