package Matrix.Factory;

import Matrix.Operation;
import Matrix.Operations.Addition;
import Matrix.Operations.DeterminantCalculation;
import Matrix.Operations.Multiplication;

public class OperationSwitchFactory extends OperationFactory {
  private final int operationType;

  public OperationSwitchFactory(int operationType) {
    this.operationType = operationType;
  }

  @Override
  public Operation createMatrixOperation() {
    return switch (operationType) {
      case 1 -> new Addition();
      case 2 -> new Multiplication();
      case 3 -> new DeterminantCalculation();
      default -> throw new UnsupportedOperationException("Неизвестная операция");
    };
  }
}
