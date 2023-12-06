import Matrix.Factory.OperationFactory;
import Matrix.Factory.OperationSwitchFactory;
import Matrix.Operation;
import Matrix.Operations.DeterminantCalculation;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static int[][] inputMatrix(Scanner scanner, int rows, int columns) {
    int[][] matrix = new int[rows][columns];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        System.out.print("Введите элемент матрицы [" + (i + 1) + "][" + (j + 1) + "]: ");
        matrix[i][j] = scanner.nextInt();
      }
    }
    return matrix;
  }

  public static void printMatrix(int[][] matrix) {
    for (int[] row : matrix) {
      System.out.println(Arrays.toString(row));
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Выберите операцию:");
    System.out.println("1 - Сложение");
    System.out.println("2 - Умножение");
    System.out.println("3 - Определитель");

    int operationType = scanner.nextInt();
    OperationFactory operationFactory = new OperationSwitchFactory(operationType);

    System.out.print("Введите количество строк матрицы A: ");
    int rowsA = scanner.nextInt();
    System.out.print("Введите количество столбцов матрицы A: ");
    int columnsA = scanner.nextInt();

    System.out.print("Введите количество строк матрицы B: ");
    int rowsB = scanner.nextInt();
    System.out.print("Введите количество столбцов матрицы B: ");
    int columnsB = scanner.nextInt();

    if (operationType != 3 && columnsA != rowsB) {
      System.out.println("Умножение матриц невозможно. Количество столбцов матрицы A должно быть равно количеству строк матрицы B.");
      return;
    }

    System.out.println("Введите матрицу A:");
    int[][] matrixA = inputMatrix(scanner, rowsA, columnsA);
    System.out.println("Матрица A:");
    printMatrix(matrixA);

    System.out.println("Введите матрицу B:");
    int[][] matrixB = inputMatrix(scanner, rowsB, columnsB);
    System.out.println("Матрица B:");
    printMatrix(matrixB);

    Operation operation = operationFactory.createMatrixOperation();

    if (operationType == 3) {
      DeterminantCalculation determinantOperation = (DeterminantCalculation) operation;
      int determinant = determinantOperation.calculateDeterminant(matrixA);
      System.out.println("Определитель матрицы A: " + determinant);
    } else {
      int[][] result = operation.operate(matrixA, matrixB);

      System.out.println("Результат операции:");
      for (int[] row : result) {
        System.out.println(Arrays.toString(row));
      }
    }
  }
}