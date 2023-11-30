package TemplateMethod;

import java.util.List;

public class StatisticsAnalyzer extends DataAnalyzer {

  @Override
  protected void processData(List<Double> data) {
    System.out.println("Шаг 2: Статистический анализ данных");
  }
}
