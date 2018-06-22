package server;


import java.util.List;
import java.util.Queue;


public class Server {
    /** The row and column count at which the matrices will be split. */
    private final int splitpoint;
    /** A list of available workers that are not already in use. */
    private List idleWorkers = new Queue<Worker>();

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

        
    
    private Matrix splitMatrix(){

    }

    private

    /**
    Server logic is implemented here
     */
    public void run(){

    }

}