package TemplateMethod;

import java.util.List;

public abstract class DataAnalyzer {
  public final void analyzeData(List<Double> data) {
    preProcessData(data);
    processData(data);
    postProcessData(data);
  }

  protected void preProcessData(List<Double> data) {
    System.out.println("Шаг 1: Предварительная обработка данных");
  }

  protected abstract void processData(List<Double> data);

  protected void postProcessData(List<Double> data) {
    System.out.println("Шаг 3: Постобработка данных");
  }
}
