package org.example.sm;

import java.util.Objects;

public final class State implements IState {

    private String name;

    public State(final String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(final Object o) {
        return this == o
                || (o instanceof State state && Objects.equals(name, state.name));
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "State{" +
                "name='" + name + '\'' +
                '}';
    }
}
