/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gc.go;

/**
 *
 * @author rogie en bram (yay)
 */
public class GCGO {
    
    static String sequentie;
    static double gcpercentage;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        sequentie = LeesBestand();
        gcpercentage = bepaalGCpercentage(sequentie);
    }
    
    static String LeesBestand(){
        System.out.println("stuff");
        return "stuff";
    }
    
    static double bepaalGCpercentage(String sequentie){
       return 10;
    }
}
