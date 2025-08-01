package excercises.chapter_09;

public class Location {
    private int row;
    private int column;
    private double maxValue;
    private double[][] matrix;

    public Location(double[][] matrix) {
        this.matrix = matrix;

        locateMaxValue();
    }

    private void locateMaxValue() {
        // initialise values
        maxValue = matrix[0][0];
        row = 0;
        column = 0;

        for(int row = 0; row < matrix.length; row++) {
            for(int column = 0; column < matrix[row].length; column++) {
                double num = matrix[row][column];
                if(num > maxValue) {
                    maxValue = num;
                    this.row = row;
                    this.column = column;
                }
            }
        }
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public double getMaxValue() {
        return maxValue;
    }
}
