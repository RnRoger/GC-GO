/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gc.go;

/**
 *
 * @author rogie
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
        System.out.println(gcpercentage);
    }
    
    static String LeesBestand(){
        System.out.println("stuff");
        return "stuff";
    }
    
    static double bepaalGCpercentage(String sequentie){
       int g = 0;
       int c = 0;
       for(int i = 0; i < sequentie.length(); i++){
           if("G".equals(sequentie.charAt(i))){
               g++;
           }
           if("C".equals(sequentie.charAt(i))){
               c++;
           }   
       }
        return (g+c)/sequentie.length()*100;
    }
}
