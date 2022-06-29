package com.example.KeywordService.controllers;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.List;
import java.util.Map;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.KeywordService.models.FindResult;

/**
 *
 * @author Admin
 */
@RestController
@RequestMapping("/keyword")
public class KeywordFinder {
    @PostMapping(value = "/finder", produces = MediaType.APPLICATION_JSON_VALUE)
    public FindResult find(@RequestBody(required = true) Map<String, Object> payload) {
        String content = (String) payload.get("text");
        List<String> listKeyword = (List<String>) payload.get("keywords");
       
        return findMatchedCriteria(listKeyword, content);
    }
    
    private FindResult findMatchedCriteria(List<String> criteria, final String content) {
        FindResult res = new FindResult();

        int a;
        for(String s : criteria) {
            if((a = StringUtils.countOccurrencesOf(content, s)) > 0) {
                res.details.put(s, a);
            }
        }
        
        res.listKeyword = res.details.keySet();
        res.numberOfMatchedKeyword = res.listKeyword.size();
        
        return res;
    }  
}
