package worker;

import client.Matrix;

public class Worker {
    public Worker() {}

    /** Returns the result of A x B */
    public Matrix multiplyMatrices(Matrix A, Matrix B) throws Exception {
        if (A.getNumberOfColumns() == B.getNumberOfRows()) {
            //  Solve the matrix.
            Matrix C = new Matrix(A.getNumberOfRows(), B.getNumberOfColumns());
            for (int row_A = 0; row_A < A.getNumberOfRows(); row_A++) {
                double[] row = A.getRow(row_A);                        
                for (int column_B = 0; column_B < B.getNumberOfColumns(); column_B++) {
                    int sum = 0;
                    double[] column = B.getColumn(column_B);
                    for (int i = 0; i < row.length; i++) {
                        sum += row[i] * column[i];
                    }
                    C.setValue(row_A, column_B, sum);
                }
            }

            return C;
        } else {
            throw new Exception("The matrices can not be multiplied.");
        }
    }
}