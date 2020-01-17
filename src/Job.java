import java.util.*;

public class Job {

    private String intitule;
    private int id;

    Scanner in = new Scanner(System.in);  // Lecture de l'entrée clavier

    Job(String pIntitule, int pId){
       this.intitule = pIntitule;
       this.id = pId;
    }

     void saisie() {
         String rep;
         while (true) {
             rep = in.next();
             id = Integer.parseInt(rep);

             switch (id) {
                 case 1:
                     this.intitule = "Guerrier";
                     break;
                 case 2:
                     this.intitule = "Mage";
                     break;
                 case 3:
                     this.intitule = "Voleur";
                     break;
             }
             if (rep.equals("1") || rep.equals("2") || rep.equals("3"))
                 break;
         }

     }
}
