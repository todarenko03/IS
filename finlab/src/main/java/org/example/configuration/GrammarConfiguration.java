package org.example.configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GrammarConfiguration {

    private List<List<List<String>>> grammar = new ArrayList<>();

    public GrammarConfiguration() {
        initGrammar();
    }

    public void initGrammar() {
        grammar.add(Arrays.asList(Arrays.asList("S"), Arrays.asList("E")));
        grammar.add(Arrays.asList(Arrays.asList("E"), Arrays.asList("E", "+", "T")));
        grammar.add(Arrays.asList(Arrays.asList("E"), Arrays.asList("E", "-", "T")));
        grammar.add(Arrays.asList(Arrays.asList("E"), Arrays.asList("E", "||", "T")));
        grammar.add(Arrays.asList(Arrays.asList("E"), Arrays.asList("E", "&&", "T")));
        grammar.add(Arrays.asList(Arrays.asList("E"), Arrays.asList("T")));
        grammar.add(Arrays.asList(Arrays.asList("T"), Arrays.asList("T", "*", "F")));
        grammar.add(Arrays.asList(Arrays.asList("T"), Arrays.asList("T", "/", "F")));
        grammar.add(Arrays.asList(Arrays.asList("T"), Arrays.asList("T", "==", "F")));
        grammar.add(Arrays.asList(Arrays.asList("T"), Arrays.asList("T", "!=", "F")));
        grammar.add(Arrays.asList(Arrays.asList("T"), Arrays.asList("T", ">", "F")));
        grammar.add(Arrays.asList(Arrays.asList("T"), Arrays.asList("T", "<", "F")));
        grammar.add(Arrays.asList(Arrays.asList("T"), Arrays.asList("F")));
        grammar.add(Arrays.asList(Arrays.asList("F"), Arrays.asList("true")));
        grammar.add(Arrays.asList(Arrays.asList("F"), Arrays.asList("false")));
        grammar.add(Arrays.asList(Arrays.asList("F"), Arrays.asList("(", "E", ")")));
        grammar.add(Arrays.asList(Arrays.asList("F"), Arrays.asList("int")));
        grammar.add(Arrays.asList(Arrays.asList("F"), Arrays.asList("func", "(", "E_list", ")")));
        grammar.add(Arrays.asList(Arrays.asList("E_list"), Arrays.asList("E", ",", "E_list")));
        grammar.add(Arrays.asList(Arrays.asList("E_list"), Arrays.asList("E")));
    }

    public List<List<List<String>>> getGrammar() {
        return grammar;
    }
}
