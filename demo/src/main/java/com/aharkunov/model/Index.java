package com.aharkunov.model;

import java.util.*;

/**
 * Created by AKharkunov on 27.03.2018.
 */
public class Index {


    private static List<String> listFiles = new LinkedList<>();

    private static List<Line> listLines = new LinkedList<>();

    private static Map<String, List<Coordinate>> wordMap = new HashMap<>();

    public static void add(String word, Coordinate pCoordinate) {

        List<Coordinate> listCoordinate = wordMap.get(word);

        if (listCoordinate == null) {
            listCoordinate = new ArrayList<>();
            wordMap.put(word, listCoordinate);
        }

        listCoordinate.add(pCoordinate);
    }

    public static List<String> getListFiles() {
        return listFiles;
    }

    public static List<Line> getListLines() {
        return listLines;
    }

    public static List<Coordinate> searchCoordinateByWord(String word) {
        return wordMap.get(word);
    }

    public static void printIndex() {
        System.out.println(wordMap);
    }


    private Index() {

    }

}
