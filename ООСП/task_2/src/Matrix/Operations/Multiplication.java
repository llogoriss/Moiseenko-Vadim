package Matrix.Operations;

import Matrix.Operation;

public class Multiplication extends Operation {
  @Override
  public int[][] operate(int[][] matrixA, int[][] matrixB) {
    int rowsA = matrixA.length;
    int columnsA = matrixA[0].length;
    int columnsB = matrixB[0].length;
    int[][] result = new int[rowsA][columnsB];

    for (int i = 0; i < rowsA; i++) {
      for (int j = 0; j < columnsB; j++) {
        for (int k = 0; k < columnsA; k++) {
          result[i][j] += matrixA[i][k] * matrixB[k][j];
        }
      }
    }

    return result;
  }
}
