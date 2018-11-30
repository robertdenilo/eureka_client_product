package com.eureka_client.eureka_client.Utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

/*
@Author Ming Zhou
@Date: 2018/11/28 22:33
*/
public class JsonUtil {
    @Autowired
    private static ObjectMapper objectMapper = new ObjectMapper();

    public static String toJson(Object object){
        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static Object fromJson(String string, Class classType){
        try {
            return objectMapper.readValue(string, classType);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
