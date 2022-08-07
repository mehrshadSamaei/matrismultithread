package ir.mehrshad;

public class MatrixMulDemo {
    public static void main(String[] args) {
        Matrix m = new Matrix();
        // Initialize matrices
        int A[][] = { { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 },
                { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 } };
        int B[][] = { { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 },
                { 1, 2, 3, 4, 5 }, { 1, 2, 3, 4, 5 } };
        int C[][] = { { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 } };
        m.setR1(5);
        m.setC1(5);
        m.setR2(5);
        m.setC2(5);
        m.setA(A);
        m.setB(B);
        m.setC(C);

        MatrixMul m2[][] = new MatrixMul[5][5];
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++) {
                m.setR1(i);
                m.setC1(j);
                m2[i][j] = new MatrixMul(m);
                m2[i][j].start();
            }
        // Wait for threads to complete
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 5; j++)
                try {
                    m2[i][j].join();
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

        for (int i = 0; i < 5; i++) {
            System.out.println("\n");
            for (int j = 0; j < 5; j++)
                System.out.println(m.getC()[i][j] + " ");
        }
    }

}