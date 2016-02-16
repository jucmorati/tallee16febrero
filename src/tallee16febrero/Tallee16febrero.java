/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallee16febrero;

/**
 *
 * @author Usuario4
 */
public class Tallee16febrero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.util.Scanner lectura=new java.util.Scanner(System.in);
        double a,b,c,d,e,f,g,h,j,perimetro,semiperimetro,area,altura;
        System.out.println ("ingrese la coordenada x del punto 1");
        a=lectura.nextDouble();
        System.out.println ("ingrese la coordenada y del punto 1");
        b=lectura.nextDouble();
        System.out.println ("ingrese la coordenada x del punto 2");
        c=lectura.nextDouble();
        System.out.println ("ingrese la coordenada y del punto 2");
        d=lectura.nextDouble();
        System.out.println ("ingrese la coordenada x del punto 3");
        e=lectura.nextDouble();
        System.out.println ("ingrese la coordenada y del punto 3");
        f=lectura.nextDouble();
        g=Math.sqrt((Math.pow(c-a,2))+Math.pow(d-b,2));
        h=Math.sqrt((Math.pow(e-c,2))+Math.pow(f-d,2));
        j=Math.sqrt((Math.pow(e-a,2))+Math.pow(f-b,2));
        perimetro=g+h+j;
        semiperimetro=perimetro/2;
        area=Math.sqrt(semiperimetro*(semiperimetro-g)*(semiperimetro-h)*(semiperimetro-j));
        altura=((area*2)/a);
        System.out.println("el perimetro es : "+perimetro);
        System.out.println("el semiperimetro es : "+semiperimetro);
        System.out.println("el area es : "+area);
        System.out.println("la altura es : "+altura);
    }
    public static double lado(double numero1, double numero2){
        java.util.Scanner lectura=new java.util.Scanner(System.in);
        for(int i=0;i<3;i++){
            int a =0;
         System.out.println ("ingrese la coordenada x del punto " +(i+1));
       // a =lectura.nextDouble();
        return 0;
    }}
}
