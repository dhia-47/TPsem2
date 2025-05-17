import java.util.Scanner;

public class examentpex1 {
    public static double convert(String ch) {
        ch = ch.replace(",", ".");         
        double nombre = Double.parseDouble(ch); 
        System.out.println("Le nombre est : " + nombre);
        return nombre;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Donner la chaîne à convertir : ");
        String ch = sc.next();
        convert(ch);
        
    }
}
