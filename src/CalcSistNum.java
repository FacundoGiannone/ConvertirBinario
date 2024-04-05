import javax.swing.*;
import java.sql.DataTruncation;
import java.util.Scanner;

public class CalcSistNum {
    public static void main(String[] args) {
        long binarioog;
        double binario;
        int cantidad;
        int decimalog=0;
        int i=0;
        double numcant;
        double numval;
        boolean val=true;
        double coomp=0;
        int contval=1;


        System.out.println("ingrese un número binario (hasta 16 dígitos) para conocer su equivalente en el sistema octal, decimal y exadecimal");
        Scanner b=new Scanner(System.in);
        binarioog=b.nextLong();

        

        binario=binarioog;
        numcant=binarioog;
        numval=binarioog;
        cantidad=0;

        while(numcant !=0)
        {
            numcant = Math.floor(numcant/10);
            cantidad++;
        }

        if (cantidad>16){
            System.out.println("El número ingresado supera los 16 dígitos");
        }
        else {
            while(val==true && contval<=cantidad){
                coomp=numval%10;
                numval=Math.floor(numval/10);
                contval++;
                if (coomp<=1){
                    val=true;
                }
                else{
                    val=false;
                }
            }
            if (val==false){
                System.out.println("El número ingresado no es binario");
            }
            else {
                while (binario>0){
                    decimalog += Math.pow (2, i++) * (binario % 10);
                    binario=Math.floor(binario/10);
                }


                System.out.println("el número binario "+binarioog+", equivale a: ");
                System.out.println(decimalog+ " decimal");

                double binario8=binarioog;
                int restobin8;
                double modbin8;
                double r;



                int octal=0;
                int decimal8=decimalog;
                i=0;
                int r2=0;

                while (binario8>0){
                    r2=0;
                    r= binario8%1000;
                    for (int j=0;j<=2;j++){
                        r2 += Math.pow (2, j) * (r % 10);
                        r= Math.floor(r/10);

                    }

                    binario8= Math.floor(binario8/1000);
                    octal+=r2*Math.pow(10,i);
                    i++;

                }
                System.out.println(octal+ " octal");


                String hexadecimal = "";
                String caracteresHexadecimales = "0123456789ABCDEF";
                binario8=binarioog;
                i=0;

                while (binario8>0){
                    r2=0;
                    r= binario8%10000;
                    for (int j=0;j<=3;j++){
                        r2 += Math.pow (2, j) * (r % 10);
                        r= Math.floor(r/10);

                    }

                    binario8= Math.floor(binario8/10000);
                    hexadecimal = caracteresHexadecimales.charAt(r2) + hexadecimal;
                    i++;

                }
                System.out.println(hexadecimal+ " hexadecimal");



            }
        }
    }
}








