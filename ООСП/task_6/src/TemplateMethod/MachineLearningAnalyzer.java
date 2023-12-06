package TemplateMethod;

import java.util.List;

public class MachineLearningAnalyzer extends DataAnalyzer{

  @Override
  protected void processData(List<Double> data) {
    System.out.println("Шаг 2: Машинное обучение");
  }
}
