import java.util.Scanner;

public class examentp2 {
    public static void dimention(int[][] m){
        Scanner sc = new Scanner (System.in);
        m = new int [50][50];
        int nl;
        do { 
            System.out.print("donner Un entier NL positive inferieur a 50 : ");
            nl = sc.nextInt();
        } while (nl>50);
        int nc;
        do { 
            System.out.print("donner in entier NC positive inferieur a 50 : ");
            nc = sc.nextInt();
        } while (nc>50);

        for (int i = 0; i < nl ; i++) {
            for (int j = 0; j < nc ; j++) {
                System.out.print("Entrez l'élément [" + i + "][" + j + "] : ");
                m[i][j]=sc.nextInt();
            }
        }
        for (int i=0 ; i < nl; i++){
            for (int j = 0; j < nc; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] m = new int[50][50];
        dimention(m);

    }
    
}
