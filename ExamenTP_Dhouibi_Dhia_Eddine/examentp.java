import java.util.Scanner;

public class examentp {

    public static void matrice() {
        String[][] m = {
            {"NumVol", "VDep", "VDest", "CodeAv", "ClassAv", "PrixVol"},
            {"1", "Tozeur", "Djreba", "ab01", "A1", "156"},
            {"2", "Tozeur", "Tunis", "ab02", "A2", "250"},
            {"3", "Tunis", "Djreba", "ab03", "A1", "140"},
            {"4", "Djreba", "Sfax", "ab01", "A2", "120"}
        };

        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez la premiere lettre de la ville de destination : ");
        char c = sc.next().toLowerCase().charAt(0);

        System.out.println("\nVols correspendant :\n");

        for (int i = 1; i < m.length; i++) {
            String vDest = m[i][2];
            if (vDest.toLowerCase().startsWith(String.valueOf(c))) {
                for (String val : m[i]) {
                    System.out.print(val + "\t");
                }
                System.out.println();
            }
        }

        for (int i = 1; i < m.length; i++) {
            double prixOriginal = Double.parseDouble(m[i][5]);
            double prixRemise = prixOriginal * 0.8;
            m[i][5] = String.format("%.2f", prixRemise);
        }
        System.out.println("\nApplication d'une remise de 20% sur tous les vols... : \n");
        System.out.println("\nTableau apres remise  : \n");

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }

    public static void main(String[] args) {
        matrice();
    }
}
