package client;

import worker.Worker;

public class ClientMain {
    public static void main(String[] args) {
        Matrix A = new Matrix(new double[][] {{1,2,3}, {2,3,4}});
        Matrix B = new Matrix(new double[][] {{4,5}, {2,1}, {3,4}});
        Worker worker = new Worker();
        try {
            Matrix C = worker.multiplyMatrices(A, B);
            C.print();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }   
}