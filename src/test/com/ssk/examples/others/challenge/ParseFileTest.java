package com.ssk.examples.others.challenge;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ParseFileTest {
    ParseFile parseFile = new ParseFile();

    @Before
    public void setup() throws Exception {
        createFunctionStack();
    }


    @Test
    public void getExeclusiveTimes() throws Exception {

    }


    List<Function> createFunctionStack() throws Exception {
        List<Function> fList = new ArrayList<>();
        Function f1 = new Function();

        f1.name = "F1";

        Files.lines(Paths.get("stuff.txt"))
                .map(line -> line.split("\\s+")) // Stream<String[]>
                .map(Arrays::stream) // Stream<Stream<String>>
                .distinct() // Stream<Stream<String>>
                .forEach(s->{
                    System.out.println(s);
                });
        return fList;
    }


}