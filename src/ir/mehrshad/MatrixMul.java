package ir.mehrshad;

public class MatrixMul extends Thread {
    Matrix matrix;

    public MatrixMul(Matrix matrix) {
        this.matrix = matrix;
    }

    @Override
    public void run() {
        try {
            while (true) {
                for (int i = 0; i < matrix.getR1(); i++) {
                    for (int j = 0; j < matrix.getC2(); j++) {
                        matrix.mul(i, j);
                    }

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
