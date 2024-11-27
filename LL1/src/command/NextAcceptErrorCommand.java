package command;

import error.SyntaxError;
import index.IIndex;
import index.Index;
import state.IState;
import token.IToken;
import token.Token;

import java.util.List;
import java.util.Optional;

public class NextAcceptErrorCommand implements ICommand {

    private IToken token;
    private IState state;
    private List<Integer> stack;
    private List<String> tokenNames;
    private List<List<String>> guidingSymbols;
    private List<Integer> transitions;
    private IIndex index;

    public NextAcceptErrorCommand(
            IToken token,
            IState state,
            List<Integer> stack,
            List<String> tokenNames,
            List<List<String>> guidingSymbols,
            List<Integer> transitions,
            IIndex index
    ) {
        this.token = token;
        this.state = state;
        this.stack = stack;
        this.tokenNames = tokenNames;
        this.guidingSymbols = guidingSymbols;
        this.transitions = transitions;
        this.index = index;
    }

    @Override
    public void execute() {
        Optional.ofNullable(guidingSymbols.get(state.getStateNumber()).contains(token.getName()) ? token.getName() : null)
                .orElseThrow(() -> new SyntaxError("Compilation error was occurred"));
        index.upIndex();
        token.setName(tokenNames.get(index.getIndex()));
        state.setStateNumber(transitions.get(state.getStateNumber()));
    }
}
