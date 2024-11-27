package org.example.sm;

import org.example.commands.ICommand;

import java.util.List;

public interface ICommandRepository {

    ICommand getCommand(IState state, int token);

    void insert(String currentStateName, int token, ICommand command);

    void setDefaultCommand(String currentStateName, ICommand command);
}
