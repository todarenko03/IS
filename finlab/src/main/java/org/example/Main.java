package org.example;


import org.example.analyzer.Analyzer;
import org.example.analyzer.IAnalyzer;

public class Main {
    public static void main(String[] args) {
        String s = """
                func(
                    (2 + 14) / 8 == 20 / 10
                )
                """;
        IAnalyzer analyzer = new Analyzer(s);
        analyzer.analyze();
    }
}
