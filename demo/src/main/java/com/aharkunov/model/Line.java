package com.aharkunov.model;

/**
 * Created by AKharkunov on 27.03.2018.
 */
public class Line {

    private int lineNumber;
    private String line;
    private String fileName;

    public String getLine() {
        return line;
    }

    public Line(int id, String line, String fileName) {
        this.lineNumber = id;
        this.line = line;
        this.fileName = fileName;

        System.out.println("fileName =" + fileName);
    }


    public int getLineNumber() {
        return lineNumber;
    }

    public String getFileName() {
        return fileName;
    }

    @Override
    public String toString() {
        return "Line{" +
                "lineNumber=" + lineNumber +
                ", line='" + line + '\'' +
                ", fileName='" + fileName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Line line = (Line) o;

        if (lineNumber != line.lineNumber) return false;
        return fileName != null ? fileName.equals(line.fileName) : line.fileName == null;
    }

    @Override
    public int hashCode() {
        int result = lineNumber;
        result = 31 * result + (fileName != null ? fileName.hashCode() : 0);
        return result;
    }
}
