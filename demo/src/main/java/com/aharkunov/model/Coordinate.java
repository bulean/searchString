package com.aharkunov.model;

/**
 * Created by AKharkunov on 28.03.2018.
 */
public class Coordinate {

    int positionInLine;
    Line line;
    String fileName;

    public int getPositionInLine() {
        return positionInLine;
    }

    public void setPositionInLine(int positionInLine) {
        this.positionInLine = positionInLine;
    }

    public Line getLine() {
        return line;
    }

    public void setLine(Line line) {
        this.line = line;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Coordinate(int positionInLine, Line line, String fileName) {
        this.positionInLine = positionInLine;
        this.line = line;
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "positionInLine=" + positionInLine +
                ", line=" + line +
                ", fileName='" + fileName + '\'' +
                '}';
    }
}
