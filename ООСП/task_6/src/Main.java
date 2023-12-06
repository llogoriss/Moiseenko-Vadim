import TemplateMethod.*;

import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Double> inputData = List.of(1.2, 3.4, 5.6, 7.8);

    DataAnalyzer statisticsAnalyzer = new StatisticsAnalyzer();
    statisticsAnalyzer.analyzeData(inputData);

    System.out.println();

    DataAnalyzer machineLearningAnalyzer = new MachineLearningAnalyzer();
    machineLearningAnalyzer.analyzeData(inputData);

    System.out.println();

    DataAnalyzer geneticAlgorithmAnalyzer = new GeneticAlgorithmAnalyzer();
    geneticAlgorithmAnalyzer.analyzeData(inputData);
  }
}