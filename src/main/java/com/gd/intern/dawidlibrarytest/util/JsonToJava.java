package com.gd.intern.dawidlibrarytest.util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gd.intern.dawidlibrarytest.model.Book;
import com.gd.intern.dawidlibrarytest.model.rest.BookRest;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JsonToJava {

    public static List<BookRest> getListOfBookFromJson(String filePath) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<BookRest> listBook = objectMapper.readValue(new File(filePath), new TypeReference<List<BookRest>>() {
        });
        return listBook;
    }
}
