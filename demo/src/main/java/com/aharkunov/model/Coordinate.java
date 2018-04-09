package com.aharkunov.model;

/**
 * Created by AKharkunov on 28.03.2018.
 * координата нахождения слова
 */

public class Coordinate {

    int positionInLine;
    Line line;


    public Line getLine() {
        return line;
    }

    public Coordinate(int positionInLine, Line line) {
        this.positionInLine = positionInLine;
        this.line = line;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "positionInLine=" + positionInLine +
                ", line=" + line +
                '}';
    }
}
