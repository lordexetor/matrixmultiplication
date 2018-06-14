package client;

/**
 * A matrix of double values.
 */
public class Matrix {
    /** The amount of rows the matrix has */
    private final int rows;
    /** The amount of columns the matrix has */
    private final int columns;
    /** The values of the matrix */
    private final double[][] values;
    
    /**
     * Matrix Constructor using given values.
     */
    public Matrix(double[][] values) {
        rows = values.length;
        columns = values[0].length;
        this.values = values;
    }

    /**
     * Matrix Constructor initializing a new matrix with the given dimensions.
     */
    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.values = new double[rows][columns];
    }

    public int getNumberOfRows() { return rows; }
    public int getNumberOfColumns() { return columns; }

    public double[][] getValues() { return values; }

    public double[] getRow(int row) {
        return values[row];
    }

    public double[] getColumn(int column) {
        double[] columnValues = new double[rows];
        for (int i = 0; i < rows; i++) {
            columnValues[i] = values[i][column];
        }
        return columnValues;
    }

    public double getValue(int row, int column) { return values[row][column]; }

    /** Set the value at the given point in the matrix */
    public void setValue(int row, int column, double value) {
        values[row][column] = value;
    }

    public void print() {
        String outString = "";
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                outString += values[i][j] + " ";
            }
            outString += "\n";
        }
        System.out.println(outString);
    }
}