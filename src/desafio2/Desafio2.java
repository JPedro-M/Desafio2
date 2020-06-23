package desafio2;

import java.util.Scanner;

/**
 *
 * @author João Pedro Marques
 */
public class Desafio2 {
    public static void main(String[] args) {
        int a, b, c, d, e;
        double s, p, m;
        Scanner Ler = new Scanner (System.in);
        
        System.out.println("Qual o valor de a?");
        a = Ler.nextInt();
        System.out.println("Qual o valor de b?");
        b = Ler.nextInt();
        System.out.println("Qual o valor de c?");
        c = Ler.nextInt();
        System.out.println("Qual o valor de d?");
        d = Ler.nextInt();
        System.out.println("Qual o valor de e?");
        e = Ler.nextInt();
        
        s = a+b+c+d+e;
        p = a*b*c*d*e;
        m = s/5;
        
        System.out.println("A soma é:"+s+"\nO produto é:"+p+"\nA media é:"+m);
    }
    
}
