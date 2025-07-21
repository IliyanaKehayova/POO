
/*
     * Me créer en POO une classe Voiture :
     * 
     * 
     * Voiture :
     * 
     * Attribut :
     * Marque
     * Modele
     * Puissance (cv, la puissance aura une influence sur l'embrayage, plus la puissance est élevée, plus l'embrayage est sensible)
     * vitesse
     * 
     * Comportement :
     * 
     * Accelerer
     * Decelerer
     * Freiner
     * Marche arrière
     * Arreter
     * Embrayer
     * Débrayer
     * Virer à gauche
     * Virer à droite
     * Changer de voie à gauche
     * Changer de voie à droite
     * Contrôle visibilité (Intérieur, extérieur, angles morts)
     * Clignotant à gauche
     * Clignotant à droite
     * Feu de croisement
     * Essuie-glace
     * Feu warning
     * Klaxonner
     * Marche arrière (On part du principe que le conducteur manipule le volant pendant la marche arrière)
     * 
     * 
     * A l'aide d'un menu d'action, vous allez conduire une voiture, suivre des instructions d'un moniteur pour simuler un test de conduite.
     * Vous roulez sur Paris, vous devez suivre les instructions suivantes, vous devez respecter les limitations de vitesse et le code de la route:
     * 
     * Notification : Vous êtes sur une route limité à 30 km/h
     * 1. Démarrer la voiture
     * 2. Continuer tout droit
     * 3. Ralentir puis tourner à gauche (vous êtes prioritaire)
     * 4. Continuer tout droit (Il y a une voiture sur l'intersection à droite, vous n'êtes pas prioritaire)
     * 5. Attention, il y a un dos d'âne !
     * 6. Continuer tout droit
     * 7. Il y a un feu rouge, quand il passera au vert, tourner à droite sur l'avenue des Champs-Élysées
     * Notification : Vous êtes sur une route limité à 50 km/h
     * 8. Continuer tout droit
     * 9. Au rond point tourner à gauche
     * 10. Continuer tout droit 
     * 11. Attention, des piétons traversent
     * 12. Continuer tout droit
     * 13. Il y a un feu orange, ralentir, attendre que le feu soit rouge et tourner à gauche sur la voie d'insertion du Périphérique
     * Notification : Vous êtes sur le Périphérique, limité à 70 km/h
     * 14. Continuer tout droit
     * 15. Vous êtes sur la voie de droite, une voiture devant vous est trop lente, dépasser la voiture
     * 16. Attention, il y a un bouchon, veuillez ralentir , prévenir les autres conducteurs à l'arrière, puis s'arrêter
     * 17. Insérer vous dans la voie de droite, pour prendre la sortie A6
     * 18. Continuer tout droit, vous rendrez dans un tunnel
     * Notification : Vous êtes sur une route limité à 110 km/h.
     * 19. Continuer tout droit sur 10 km
     * 20. Vous êtes sur la voie de droite, un véhicule de police cherche à vous dépasser, laisser passer le véhicule en vous débordant sur la gauche
     * 21. Continuer tout droit
     * 22. Prenez la sortie en direction de Orly
     * Notification : Vous êtes sur une route limité à 50 km/h
     * 23. Continuer tout droit 
     * 24. Tournez à droite en direction de l'aéroport d'Orly 
     * Notification : Vous êtes sur une route limité à 30 km/h
     * 25. Continuer tout droit après le rond-point
     * 26. Virer à droite pour entrer dans le parking
     * 27. Garez la voiture en marche arrière
     * 28. Couper le moteur
     * Vous êtes arrivé(e) !!!
     * 
     * Si vous ne respectez pas le code de la route & les limitations de vitesse, le test de conduite a échoué et s'arrête, 
     * le moniteur prendra la main.
     * 
     * Bonus : Rajouter un système de points pour évaluer votre conduite, certaines erreurs ne sont pas éliminatoires mais vous feront perdre des points.
     * par exemple :
     * - Faire un excès de vitesse +5 km/h : -2 points
     * - Ne pas céder le passage : -3 points
     * - Brûler un feu orange : -5 points
     * - Ne pas mettre son clignotant : -2 point
     * - Ne pas contrôler les angles morts lors d'un changement de voie : -3 points
     * - Ne pas mettre de feu de croisement dans un tunnel : -2 points
     * - Ne pas activer les essuie-glaces en cas de pluie : -5 points
     * - Ne pas ralentir avant un dos d'âne : -2 points
     * 
     * la pluie doit tomber aléatoirement pendant le test de conduite, si la pluie tombe, 
     * vous devez activer les essuie-glaces, et les limitations de vitesse sont réduites de 10 km/h.
     * 
     * Le test est sur 40 points, il faut au minimum 30 points pour réussir le test de conduite.
     * 
     * 
     *     // Méthodes

    public int ACCELERATE(int speed, boolean accelerate) {
        System.out.println("Souhaitez-vous accélérer (true) ou décélérer (false) ?");
        accelerate = clavier.nextBoolean();
        if (accelerate) {
            System.out.println("De combien de km/h souhaitez-vous accélérer ?");
            int speedChange = clavier.nextInt();
            speed += speedChange;
        } else {
            System.out.println("De combien de km/h souhaitez-vous décélérer ?");
            int speedChange = clavier.nextInt();
            speed -= speedChange;
        }
        return speed;
    }

    public int BREAK(int speed) {
        System.out.println("Vous freinez.");
        speed -= 20;
        return speed;
    }

    public int STOPANDSTART(int speed, boolean stopAndStart) {
        System.out.println("Souhaitez-vous démarrer (true) ou arrêter (false) le véhicule ?");
        stopAndStart = clavier.nextBoolean();
        if (stopAndStart) {
            System.out.println("Le véhicule a démarré.");
            speed = 10;
        } else {
            System.out.println("Le véhicule s'est arrêté.");
            speed = 0;
        }
        return speed;
    }

    public boolean ENGAGE(boolean engage) {
        System.out.println("Souhaitez-vous embrayer (true) ou débrayer (false) ?");
        engage = clavier.nextBoolean();
        if (engage) {
            System.out.println("Vous embrayez.");
        } else {
            System.out.println("Vous débrayez.");
        }
        return engage;
    }

    public String TURN(String direction) {
        System.out.println("Tourner vers (gauche / droit / arrière / continuer) :");
        direction = clavier.next();
        if (direction.equalsIgnoreCase("gauche")) {
            System.out.println("Vous tournez à gauche.");
            return "left";
        } else if (direction.equalsIgnoreCase("droit")) {
            System.out.println("Vous tournez à droite.");
            return "right";}
            else if (direction.equalsIgnoreCase("continuer")) {
            System.out.println("Vous continuez tout droit.");
            return "forward";
        } else if (direction.equalsIgnoreCase("arriere")) {
            System.out.println("Vous faites marche arrière.");
            return "reverse";
        }
        return direction;
    }

    public String CHANGELANE(String changeLane) {
        System.out.println("Vous souhaitez vous rabattre à (gauche/droit) :");
        changeLane = clavier.next();
        if (changeLane.equalsIgnoreCase("gauche")) {
            System.out.println("Vous vous rabattez à gauche.");
            return "left";
        } else if (changeLane.equalsIgnoreCase("droit")) {
            System.out.println("Vous vous rabattez à droite.");
            return "right";
        }
        return changeLane;
    }

    public boolean VISIBILITY(boolean checkVisibility) {
        System.out.println("Vérification de la visibilité effectuée.");
        return true;
    }

    public String TURNSIGNAL(String signal) {
        System.out.println("Activer le clignotant (gauche/droit) :");
        signal = clavier.next();
        if (signal.equalsIgnoreCase("gauche")) {
            System.out.println("Clignotant gauche activé.");
            return "left";
        } else if (signal.equalsIgnoreCase("droit")) {
            System.out.println("Clignotant droit activé.");
            return "right";
        }
        return signal;
    }

    public boolean LOWBEAMHEADLIGHTS(boolean lowBeamHeadlights) {
        System.out.println("Phares de croisement activés.");
        return true;
    }

    public boolean WINDSHIELDWIPER(boolean windShieldWiper) {
        System.out.println("Essuie-glaces activés.");
        return true;
    }

    public boolean HONK(boolean honk) {
        System.out.println("Vous klaxonnez !");
        return true;
    }


    public void closeScanner() {
        clavier.close();
    }
     */

     
import java.util.*;

public class CONDUITE {

    private Scanner clavier = new Scanner(System.in);
    private Map<String, String> shortcuts;

    private String brand;
    private String model;
    private int power;
    private int speed;

    public CONDUITE(String brand, String model, int power, int speed) {
        this.brand = brand;
        this.model = model;
        this.power = power;
        this.speed = speed;

        shortcuts = new HashMap<>();
        shortcuts.put("A", "ACCELERATE");
        shortcuts.put("D", "DECELERATE");
        shortcuts.put("B", "BREAK");
        shortcuts.put("R", "REVERSE");
        shortcuts.put("SO", "STOP");
        shortcuts.put("SA", "START");
        shortcuts.put("TL", "TURNLEFT");
        shortcuts.put("TR", "TURNRIGHT");
        shortcuts.put("C", "CONTINUESTRAIGHT");
        shortcuts.put("CL", "CHANGELANELEFT");
        shortcuts.put("CR", "CHANGELANERIGHT");
        shortcuts.put("V", "CHECKVISIBILITY");
        shortcuts.put("TSL", "TURNSIGNALLEFT");
        shortcuts.put("TSR", "TURNSIGNALRIGHT");
        shortcuts.put("LB", "LOWBEAMHEADLIGHTS");
        shortcuts.put("WS", "WARNINGSIGNAL");
        shortcuts.put("W", "WINDSHIELDWIPER");
        shortcuts.put("H", "HONK");
    }

    public Map<String, String> getShortcuts() {
        return shortcuts;
    }

    public Scanner getScanner() {
        return clavier;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

  
    public void runSimulation(List<String> expected) {
        List<String> responses = new ArrayList<>();

        for (int j = 0; j < expected.size(); j++) {
            System.out.print("Commande " + (j + 1) + " : ");
            String response = clavier.nextLine().toUpperCase().trim();
            responses.add(response);

         
            switch (response) {
                case "A": speed += 20; break;
                case "D": speed = Math.max(0, speed - 20); break;
                case "SA": speed = 10; break;
                case "ST": speed = 0; break;
            }

            System.out.println("Vitesse actuelle : " + speed + " km/h");
        }

        clavier.close();
    }
}

