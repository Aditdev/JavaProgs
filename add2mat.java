import java.util.Scanner;

class MatAMatB {
    // int a,b;
    int a[][] = new int[3][3];
    int b[][] = new int[3][3];
    int c[][] = new int[3][3];
    Scanner sc = new Scanner(System.in);

    void RA() {
        System.out.println("Elements of Matrix A");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                a[i][j] = sc.nextInt();
    }

    void RB() {
        System.out.println("Elements of Matrix B");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                b[i][j] = sc.nextInt();
    }

    void addABDisplay() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println("");
        }
    }
}

public class add2mat {
    public static void main(String args[]) {
        MatAMatB m = new MatAMatB();
        m.RA();
        m.RB();
        m.addABDisplay();

    }
}
