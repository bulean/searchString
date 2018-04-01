package com.aharkunov.model;

/**
 * Created by AKharkunov on 27.03.2018.
 */
public class Line {

    int lineNumber;
    String line;

    public int getLineNumber() {
        return lineNumber;
    }

    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public Line(int id, String line, String fileName) {
        this.lineNumber = id;
        this.line = line;
    }

    @Override
    public String toString() {
        return "Line{" +
                "lineNumber=" + lineNumber +
                ", line='" + line + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Line line1 = (Line) o;

        if (lineNumber != line1.lineNumber) return false;
        return line.equals(line1.line);
    }

    @Override
    public int hashCode() {
        int result = lineNumber;
        result = 31 * result + line.hashCode();
        return result;
    }
}
