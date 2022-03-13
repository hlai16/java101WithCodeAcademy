/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.classes.objects;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author glori
 */
public class StateCapitals {
    public static void main(String[] args) {
        Map<String, String> states = new HashMap<>();
        
        states.put("Alabama", "Montgomery");
        states.put("Alaska", "Juneau");
        states.put("Arizona", "Phoenix");
        states.put("Arkansas", "Little Rock");
        
        //key set
        Set<String> keys = states.keySet();
        
        System.out.println("STATES: ");
        System.out.println("========");
        for (String k: keys) {
            System.out.println(k);
        }
        
        // value collection
        Collection<String> capitals = states.values();
        
        System.out.println("CAPITALS: ");
        System.out.println("=========");
        for (String c : capitals) {
            System.out.println(c);
        }
        
        // printing both keys and values:
        System.out.println("STATE/CAPITAL PAIRS: ");
        System.out.println("=====================");
        for (String k : keys) {
            System.out.println(k + " - " + states.get(k));
        }
    }
}
