package ir.mehrshad;

public class Matrix {

    private int A[][];
    private int B[][];
    private int C[][];
    private int r1, c1;
    private int r2, c2;

    public Matrix(int[][] a, int[][] b, int[][] c, int r1, int c1, int r2, int c2) {
        A = a;
        B = b;
        C = c;
        this.r1 = r1;
        this.c1 = c1;
        this.r2 = r2;
        this.c2 = c2;
    }

    public Matrix() {
    }

    public int[][] getA() {
        return A;
    }

    public void setA(int[][] a) {
        A = a;
    }

    public int[][] getB() {
        return B;
    }

    public void setB(int[][] b) {
        B = b;
    }

    public int[][] getC() {
        return C;
    }

    public void setC(int[][] c) {
        C = c;
    }

    public int getR1() {
        return r1;
    }

    public void setR1(int r1) {
        this.r1 = r1;
    }

    public int getC1() {
        return c1;
    }

    public void setC1(int c1) {
        this.c1 = c1;
    }

    public int getR2() {
        return r2;
    }

    public void setR2(int r2) {
        this.r2 = r2;
    }

    public int getC2() {
        return c2;
    }

    public void setC2(int c2) {
        this.c2 = c2;
    }
    synchronized void mul(int r, int c) {
        int sum = 0;
        for (int i = 0; i < c1; i++)
            sum = sum + A[r][i] * B[i][c];
        C[r][c]=sum;

    }
}
