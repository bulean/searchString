package com.aharkunov.util;

import com.aharkunov.model.*;

import java.util.*;

/**
 * Created by AKharkunov on 27.03.2018.
 */
public class Search {

    public static List<Line> searchText(String searchText)
    {
        // тут будем хранить слово и строки где оно есть
        Map<String, List<Coordinate>> mapWordLines = new HashMap<>();

        String[] s = searchText.split(" ");

        List<String> searchWordsList = Arrays.asList(s);

        for (String searchWord : searchWordsList)
        {
            mapWordLines.put(searchWord, Index.searchCoordinateByWord(searchWord));
        }

        return null;
    }

}
