import java.util.*;

public class Personnage {


    static String nomPerso = "Player 1"; // Nom du personnage par défaut
    static String job = ""; // Classe de départ du personnage
    static int niveau = 1; // Niveau de départ du personnage

    static int force = 0; // Force du personnage
    static int magie = 0; // Niveau de magie du personnage
    static int agilite = 0; // Agilité du personnage

    static int minStat = 1; // Nombre minimal pour une stat de départ
    static int maxStat = 16;  // Nombre maximal pour une stat de départ

    static Scanner in = new Scanner(System.in); // lecture de l'entrée clavier

    //Constructeur de la creation du personnage
    public static void Personnage() {

        System.out.println("Entrez le nom du personnage");
        String nomPerso = in.next(); // Nom du perso
        if (nomPerso.equals("")) {
            Personnage.nomPerso = "Player 1";
        }

        System.out.println("Choisissez le job du personnage, tapez :");
        System.out.println("1. Guerrier");
        System.out.println("2. Mage");
        System.out.println("3. Voleur");

        while (true) {
            String job = in.next(); // Lecture de l'entrée clavier

            switch (job) {
                case "1":   // Si choix 1 donne Guerrier
                    job = "Guerrier";
                    System.out.println(job);
                    break;
                case "2":   // Si choix 2 donne Mage
                    job = "Mage";
                    System.out.println(job);
                    break;
                case "3":   // Si choix 3 donne Voleur
                    job = "Voleur";
                    System.out.println(job);
                    break;
            }
            int niveau = 1; // Niveau du personnage
            if (job.equals("Guerrier") || job.equals("Mage") || job.equals("Voleur")) {
                break;
            }
        }
        while (true) {
            String rep = "";
            stats(); // Appelle la méthode pour les stats

            System.out.println("Valider ?");
            System.out.println("Y pour valider, n'importe quelle touche pour reroll");

            rep = in.next(); // Reponse clavier
            if (rep.equals("Y")) break;
        }
    }

    static int nombreRandom() {  // Crée un nombre aléatoire en 1 et 15
        Random random = new Random();
        int nombre = minStat + random.nextInt(maxStat - minStat);

        return nombre;
    }

    static void stats() {  // Crée le triple pour les stats de départ

        int force = nombreRandom();
        int magie = nombreRandom();
        int agilite = nombreRandom();

        System.out.println("Force : " + force);
        System.out.println("Magie : " + magie);
        System.out.println("agilite : " + agilite);

    }

    public static void main(String[] args) {
        Personnage();
    }
}

