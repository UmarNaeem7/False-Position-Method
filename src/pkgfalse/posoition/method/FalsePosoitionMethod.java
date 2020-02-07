/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfalse.posoition.method;

/**
 *
 * @author mumar
 */
public class FalsePosoitionMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculator c = new Calculator(1, 2, 0.01, 0, 4, 1, -10);
        double a = c.calculate();
        System.out.println(a);
        
        Calculator b = new Calculator(-3, -2, 0.0625, 0, 1, 0, -7);
        a = b.calculate();
        System.out.println(a);
    }
    
}
