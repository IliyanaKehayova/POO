/*  Exercice n°2 : 
 * 
 * Me créer en POO une classe Quizz avec les attributs suivants :
 * 
 * Question
 * Reponses (3 réponses dans un tableau)
 * Bonne réponse
 * Terminée (Vrai ou Faux)
 * 
 * Son comportement :
 * 
 * Afficher La Question et les réponses ( Utiliser les index pour afficher la question et les réponses correspondantes)
 * Répondre
 * Verdict (Bonne réponse = 1 point ou mauvaise réponse = 0 point , puis terminé = true)
 * Afficher la Bonne Réponse (Après avoir répondu si on a eu faux)
 * 
 * 
 * Diagramme UML et code Java exigés
 * 
 * 
 * Dans le main le but sera de créer des objets Quizz dynamiquement en fonction du nombres de questions créer dans un tableau ou une list avec leurs 3 réponses.
 * Vous aurez besoin d'une boucle 
 * 
 * 
 * Bonus : Créer la possibilité de mettre un minuteur qui arrête le quizz après la minute de votre choix, il faudra utiliser les localDatetime 
 * Par exemple vous avez défini 10 min de temps limite, si vous commencez le quiz à 10h10 alors à 10h20 le quiz est terminée
 * 
 * 
 */




public class QUIZ {

    
    public static String[] questions = {
        "Quelle est la capitale du Japon ?",
        "Quelle est la capitale de la France ?",
        "Quelle est la capitale de la Bulgarie ?"
    };

    
    public static String[][] responseOptions = {
        {"Osaka", "Kyoto", "Tokyo"},
        {"Lyon", "Paris", "Bordeaux"},
        {"Sofia", "Varna", "Plovdiv"}
    };

    
    public static String[] rightResponses = {
        "Tokyo",
        "Paris",
        "Sofia"
    };

   
    public static void showQuestionAndResponses(int index) {
        System.out.println(questions[index]);
        for (int i = 0; i < responseOptions[index].length; i++) {
            System.out.println((i + 1) + ". " + responseOptions[index][i]);
        }
    }

    
    public static boolean isCorrectResponse(int index, String userResponse) {
        return userResponse.equalsIgnoreCase(rightResponses[index]);
    }

   
    public static String getResponseByNumber(int index, int number) {
        if (number >= 1 && number <= 3) {
            return responseOptions[index][number - 1];
        } else {
            return "";
        }
    }

}
