import java.util.*;

public class Personnage {

    private String nom;
    private String job;
    private int niveau;
    private int force;
    private int magie;
    private int agilite;

    Personnage() {  // Constructeur par défaut du personnage
        this.nom = "Player 1";
        this.job = "";
        this.niveau = 1;
        this.force = 1;
        this.magie = 1;
        this.agilite = 1;
    }


    public static void main(String[] args) {
        //Personnage();
    }
}

