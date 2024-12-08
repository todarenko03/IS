package org.example.command;


import org.example.error.SyntaxError;

public class ThrowExceptionCommand implements ICommand {
    @Override
    public void execute() {
        throw new SyntaxError("Compilation error was occurred");
    }
}
