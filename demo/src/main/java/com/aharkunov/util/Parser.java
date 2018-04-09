package com.aharkunov.util;


import com.aharkunov.model.Coordinate;
import com.aharkunov.model.Line;
import com.aharkunov.model.Index;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by AKharkunov on 27.03.2018.
 */
public class Parser {

    /**
     * разбираем файл построчно, строки разбираем на слова и складываем координаты слов в свой индекс
     * @param pFilePath путь к файлу
     */
    public static void parseFile(String pFilePath) {

        try {

            int seqLineNumber = 1;

            List<String> listLines = Files.readAllLines(Paths.get(pFilePath));

            for (String line : listLines) {


                // пустные строки игнорируем
                if (line.trim().isEmpty())
                {
                    seqLineNumber++;
                    continue;
                }

                // добавим строку в индекс
                Index.getListLines().add(new Line(seqLineNumber, line, pFilePath));

                int wordPos = 1;

                for (String word : line.split(" ")) {

                    if (!word.trim().equals("")) {

                        //свяжем слово с координатой где оно встречается
                        Index.add(word, new Coordinate(wordPos, Index.getListLines().get(Index.getListLines().size() - 1)));
                        wordPos++;
                    }
                }

                seqLineNumber++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
