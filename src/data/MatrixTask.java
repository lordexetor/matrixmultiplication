public class MatrixTask {
	public int indexRow;
	public int indexColumn;
	public double[] valuesRow;
	public double[] valuesColumn;

	/**
    Default Constructor
     */
	public MatrixTask() {
	}

    /**
    Constructor for a MatrixTask to be solved
     */
	public MatrixTask(int _indexRow,int _indexColumn,double[] _valuesRow,double _valuesColumn) {
		this.indexRow = _indexRow;
        this.indexColumn = _indexColumn;
        this.valuesRow = Arrays.copyOf(     _valuesRow,     _valuesRow.length)
		this.valuesMatrix1 = Arrays.copyOf( _valuesColumn,  _valuesColumn.length);
	}

	@Override
	public String toString() {
		return getClass().getName() + ": "
				+ " | indexRow=" + indexRow
				+ " | indexColumn=" + indexColumn
				+ " | valuesRow=" + Arrays.toString(valuesRow)
				+ " | valuesColumn=" + Arrays.toString(valuesColumn);
	}
}