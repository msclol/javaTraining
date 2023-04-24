package les_methodes;

public class Main {
    public static void main(String[] args) {
        Math.sqrt(9); // Méthode Statique
        Integer nombre = 2;
        System.out.println(nombre.intValue());

        Boolean var = false;
        Boolean var2 = false;
        System.out.println("La valeur de l'égalité est: " + var.equals(var2));
        System.out.println(var.compareTo(var2));
    }
    
}
