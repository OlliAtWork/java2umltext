package com.java2umltext.model;

public enum Visibility {
    PUBLIC('+'),
    PRIVATE('-'),
    PROTECTED('#'),
    DEFAULT('~');

    private final char symbol;

    Visibility(char symbol) {
        this.symbol = symbol;
    }

    public char symbol() {
        return symbol;
    }
}
