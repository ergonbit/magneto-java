/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magnetojava;
import java.util.Arrays;

/**
 *
 * @author prodriguez
 */
public class MagnetoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] dnaTest = {"ATGCGA","CAGTGC","TTATGT", "AGAAGG","CCCCTA","TCACTG"};
        
        if (esMutante(dnaTest)) 
            System.out.println("Es mutante");
        else
            System.out.println("No es Mutante");
    }
    
    private static boolean esMutante(String[] dna) {
        String dnaMutant[] = {"ATGCGA","CAGTGC","TTATGT", "AGAAGG","CCCCTA","TCACTG"}; 	
        Object[] arrTest = {dna};
        Object[] arrMutant = {dnaMutant};
        return Arrays.deepEquals(arrTest, arrMutant);
    }
}
