package com.bear.javanewtest2;

import com.bear.javanewtest2.entity.Article;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created with IntelliJ IDEA.
 * User: bear
 * Date: 2020/12/8 上午8:51
 * Description:
 */

public class JsonIgnoreDemo {

    private static ObjectMapper objectMapper = new ObjectMapper();

    public static void main(String[] args) throws JsonProcessingException {
        Article article = new Article();

        System.out.println(objectMapper.writeValueAsString(article));

    }
}
