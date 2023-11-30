package Matrix.Operations;

import Matrix.Operation;

public class Addition extends Operation {
  @Override
  public int[][] operate(int[][] matrixA, int[][] matrixB) {
    int rows = matrixA.length;
    int columns = matrixA[0].length;
    int[][] result = new int[rows][columns];

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        result[i][j] = matrixA[i][j] + matrixB[i][j];
      }
    }

    return result;
  }
}
