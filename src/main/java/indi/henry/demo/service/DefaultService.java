package indi.henry.demo.service;

import org.springframework.stereotype.Service;

import indi.henry.demo.constant.DefaultConstant;
import lombok.SneakyThrows;

@Service
public class DefaultService {

    @SneakyThrows
    public String getStr() {
        String str = "test";
        return returnString(str + DefaultConstant.DEFAULT_STRING);
    }

    private String returnString(String str) {
        return str;
    }
}