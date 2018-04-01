package com.aharkunov;

import com.aharkunov.model.Line;
import com.aharkunov.util.Parser;
import com.aharkunov.util.Search;

import java.util.List;

/**
 * Created by AKharkunov on 27.03.2018.
 */
public class Test {

    public static void main(String[] args) {

        String filePath = "d://validate_err.txt";

        Parser.parseFile(filePath);

       // List<Line>  documentList = Search.searchText("1");

    }
}
