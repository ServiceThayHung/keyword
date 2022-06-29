package com.example.KeywordService.models;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class FindResult {
    public int numberOfMatchedKeyword;
    public Collection<String> listKeyword;
    public Map<String, Integer> details;
    
    public FindResult() {
        this.details = new HashMap<>();
    }
}
