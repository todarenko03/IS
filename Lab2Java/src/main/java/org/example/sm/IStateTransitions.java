package org.example.sm;

import org.example.commands.ICommand;

import java.util.List;

public interface IStateTransitions {
    IState nextState(IState state, int token);

    void insert(String currentStateName, int token, String state);

    void setDefaultState(String currentStateName, String defaultStateName);
}
