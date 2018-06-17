package server;

import java.util.ArrayList;
import java.util.List;


public class Server {
    /** The row and column count at which the matrices will be split. */
    private final int splitpoint;
    /** A list of available workers that are not already in use. */
    private List idleWorkers = new ArrayList<Worker>();

    public Server(int splitpoint) {
        this.splitpoint = splitpoint;
    }

    public void addWorker(Worker w) {
        idleWorkers.add(w);
    }

    /** Get a worker from the idle workers. This worker is then no longer idle. */
    public Worker getWorker() throws Exception {
        if (!idleWorkers.isEmpty()) {
            return idleWorkers.remove(0);
        } else {
            throw new Exception("No idle workers available");
        }
    }
    
    public Matrix multiplyMatrices(Matrix A, Matrix B) {
        // TODO: Split matrices, distribute to availabe workers.
        // TODO: reunite solution fragemnts, return solution.
    }

}