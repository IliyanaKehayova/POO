import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        PARFUM_OBJET parfum = null;
        
        Boolean continuer = true;

while(continuer){

        System.out.println("Veuillez choisir une action");
        System.out.println("(1) Créer produit dans base de données");
        System.out.println("(2) Afficher les informations du dernier produit créé ");
        System.out.println("(3) Réaliser un achat");
        System.out.println("(4) Vérifier le stock");
        System.out.println("(5) Quitter");

        int choixMenu = clavier.nextInt();
        clavier.nextLine(); // Pour éviter les bugs avec nextLine()

        switch(choixMenu){
            case 1:
                parfum = PARFUM_OBJET.creerParfumDepuisSaisie();
                break;

            case 2:
                if (parfum != null) {
                    System.out.println(parfum.InfoProduit());
                } else {
                    System.out.println("Veuillez d'abord créer un parfum.");
                }
                break;

            case 3:
                if (parfum != null) {
                    parfum.acheter();
                } else {
                    System.out.println("Veuillez d'abord créer un parfum.");
                }
                break;

            case 4:
                if (parfum != null) {
                    System.out.println("Entrez le nom du parfum à rechercher :");
                    String nomRecherche = clavier.nextLine();
                    parfum.verifierStock(nomRecherche);
                } else {
                    System.out.println("Aucun produit en base de données.");
                }
                break;

            case 5 : 
                continuer = false; break;
            default:
                System.out.println("Aucun choix fait");
                break;
        }
    }
        clavier.close();
    }
}
