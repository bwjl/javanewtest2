package com.bear.javanewtest2;

import com.bear.javanewtest2.entity.Article;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/12/7 下午7:42
 * Description:
 */

public class JsonPropertyDemo {

    private static ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String[] args) throws JsonProcessingException {
        Article article = new Article();

        System.out.println(objectMapper.writeValueAsString(article));
    }
}
