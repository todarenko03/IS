package org.example.sm;

import java.util.Objects;

public class Pair<T, U> {

    private T first;
    private U second;

    public Pair(final T first, final U second) {
        this.setFirst(first);
        this.setSecond(second);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Pair<?, ?> pair = (Pair<?, ?>) o;

        if (!Objects.equals(getFirst(), pair.getFirst())) {
            return false;
        }
        return Objects.equals(getSecond(), pair.getSecond());
    }

    @Override
    public int hashCode() {
        int result = getFirst() != null ? getFirst().hashCode() : 0;
        result = 31 * result + (getSecond() != null ? getSecond().hashCode() : 0);
        return result;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(U second) {
        this.second = second;
    }
}