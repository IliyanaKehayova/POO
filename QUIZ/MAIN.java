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


import java.util.Scanner;

public class MAIN {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        int score = 0;
        int totalQuestions = QUIZ.questions.length;

        for (int i = 0; i < totalQuestions; i++) {
            QUIZ.showQuestionAndResponses(i);
            System.out.print("Votre réponse (1-3 ou nom de la ville) : ");
            String userInput = clavier.nextLine().trim();
            new TIMER(120);

            String chosenAnswer;

           
            if (userInput.matches("[1-3]")) {
                int number = Integer.parseInt(userInput);
                chosenAnswer = QUIZ.getResponseByNumber(i, number);
            } else {
                chosenAnswer = userInput;
            }

            if (QUIZ.isCorrectResponse(i, chosenAnswer)) {
                System.out.println("Bonne réponse !");
                score++;
            } else {
                System.out.println("Mauvaise réponse. La bonne réponse était : " + QUIZ.rightResponses[i]);
            }

            System.out.println(); 
        }

        System.out.println(" Quiz terminé ! Score : " + score + " / " + totalQuestions);
        clavier.close();
    }
}
