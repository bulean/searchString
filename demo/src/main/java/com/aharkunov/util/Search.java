package com.aharkunov.util;

import com.aharkunov.model.*;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * Created by AKharkunov on 27.03.2018.
 */
public class Search {

    /**
     * Поск строки в файлах
     *
     * @param searchText строка поиска
     * @return список строк где эта строка встречалась
     */
    public static List<Line> searchText(String searchText) {

        List<Line> resultLines = new ArrayList<>();

        boolean wordNotExists = false;

        if (searchText.trim().isEmpty()) {
            return resultLines;
        }

        // разобьем строку на уникальные слова
        List<String> searchWordsList = Arrays.asList(searchText.split(" ")).stream()
                                                                              .distinct()
                                                                              .collect(Collectors.toList());

        Map<String, List<Coordinate>> mapWordCoordinate = new ConcurrentHashMap<>();

        // найдем все вхождения слов и поместим их в мапу
        searchWordsList.stream()
                       .parallel()
                       .forEach(s -> {
                           if (Index.searchCoordinateByWord(s) != null)
                           {
                             mapWordCoordinate.put(s, Index.searchCoordinateByWord(s));
                           }
                       });

        // найдем пересечения найденных строк
        Map<Line, Integer> intersectLinesMap = new ConcurrentHashMap<>();

        for (Map.Entry<String, List<Coordinate>> entry : mapWordCoordinate.entrySet()) {

            // увеличиваем счетчик количества нахождения строки по слову
            entry.getValue().stream()
                            .parallel()
                            .forEach(coordinate -> intersectLinesMap.merge(coordinate.getLine(), 1, Integer::sum));

        }

        // найдем строки, в которых есть наши слова
        for (Map.Entry<Line, Integer> entry : intersectLinesMap.entrySet()) {

            if (entry.getValue() >= searchWordsList.size()) {
                resultLines.add(entry.getKey());
            }
        }

        // отфильтруем результирующие строки на вхождение строки
        return resultLines.stream()
                          .parallel()
                          .filter(line -> line.getLine().contains(searchText))
                          .collect(Collectors.toList());

    }


}
