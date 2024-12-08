package org.example.analyzer;

import org.example.command.ICommand;
import org.example.configuration.Configuration;
import org.example.configuration.IConfiguration;
import org.example.lexer.ILexer;
import org.example.lexer.Lexer;
import org.example.state.IState;
import org.example.state.State;
import org.example.token.IToken;
import org.example.token.Token;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Analyzer implements IAnalyzer {

    private ILexer lexer;
    private IToken token;
    private List<String> tokens;
    private IState state;
    private IState nextState;
    private List<Object> stack;
    private Map<Integer, Map<String, String>> actionMap;
    private Map<String, ICommand> commandMap;
    private ICommand defaultCommand;
    private String defaultActionName;

    public Analyzer(final String input) {
        IConfiguration configuration = new Configuration();
        this.lexer = new Lexer(input, configuration.getTokensDict());
        this.actionMap = configuration.getActionMap();
        this.token = new Token(lexer.getTokenNames().get(0));
        this.state = new State();
        this.nextState = new State();
        this.stack = new ArrayList<>();
        this.tokens = lexer.getTokenNames();
        stack.add(0);
        this.commandMap = configuration.initCommandMap(nextState, tokens, stack);
        this.defaultCommand = configuration.getDefaultCommand();
        this.defaultActionName = configuration.getDefaultActionName();
    }

    public void analyze() {
        String action = "s";

        while (!Objects.equals(action.substring(0, 1), "a")) {

            state.setStateNumber((Integer) stack.get(stack.size() - 1));
            String currentToken = tokens.get(0);
            action = actionMap.get(state.getStateNumber()).getOrDefault(currentToken, defaultActionName);
            nextState.setStateNumber(Integer.parseInt(action.substring(1)));

            commandMap.getOrDefault(action.substring(0, 1), defaultCommand).execute();
        }

        System.out.println("Success compiled");
    }
}
