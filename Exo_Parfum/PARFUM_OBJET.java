import java.util.Scanner;

public class PARFUM_OBJET {

    public String nom;
    public String marque;
    public double prix;
    public String notesOlfactives;
    public boolean solde;
    public double noteClients;

    // Constructeur
    public PARFUM_OBJET(String nom, String marque, double prix, String notesOlfactives, boolean solde, double noteClients) {
        this.nom = nom;
        this.marque = marque;
        this.prix = prix;
        this.notesOlfactives = notesOlfactives;
        this.solde = solde;
        this.noteClients = noteClients;
    }

    
//------------------------------------------------------------------------------------------------------------------------------------------------------
//Méthodes

   
    public String InfoProduit() {

        String InfoProduit = "---------- Détails de la commande ----------\n";
        InfoProduit += "Nom du parfum : " + nom + "\n";
        InfoProduit += "Marque : " + marque + "\n";
        InfoProduit += "Prix : " + prix + " €\n";
        InfoProduit += "Notes olfactives : " + notesOlfactives + "\n";
        InfoProduit += "Soldé : " + (solde ? "Oui" : "Non") + "\n";
        InfoProduit += "Note des clients : " + noteClients + " / 5\n";
        return InfoProduit;
    }

    
    public void acheter() {
        System.out.println(InfoProduit());
        if (solde) {
            double prixSolde = prix * 0.8;
            System.out.println("Ce produit est soldé. Prix après réduction : " + prixSolde + " €.");
        } else {
            System.out.println("Ce produit n'est pas soldé. Prix : " + prix + " €.");
        }
    }

    public void verifierStock(String rechercheNom) {
        if (this.nom.equalsIgnoreCase(rechercheNom)) {
            System.out.println("Produit trouvé :");
            System.out.println(InfoProduit());
        } else {
            System.out.println("Ce produit n'existe pas dans la base de données.");
        }
    }

   
    public static PARFUM_OBJET creerParfumDepuisSaisie() {
        Scanner clavier = new Scanner(System.in);

        System.out.println("Nom du parfum :");
        String nom = clavier.nextLine();

        System.out.println("Marque :");
        String marque = clavier.nextLine();

        System.out.println("Prix :");
        double prix = clavier.nextDouble();
        clavier.nextLine(); 

        System.out.println("Notes olfactives :");
        String notes = clavier.nextLine();

        System.out.println("Produit soldé (true/false) :");
        boolean solde = clavier.nextBoolean();

        System.out.println("Note des clients (sur 5) :");
        double note = clavier.nextDouble();



        return new PARFUM_OBJET(nom, marque, prix, notes, solde, note);
    }



}


