/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lecture.CollectionAndGenerics.Map;

import java.util.HashMap;
import java.util.Map;

public class TestingMaps {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Syed", 1);
        map.put("Muhammad", 2);
        map.put("Suhaib", 3);
        map.put("Hasan", 4);
        System.out.println(map.size());
        System.out.println(map.get("Suhaib"));
        System.out.println(map.containsKey("Rizvi"));
        System.out.println(map.remove("Suhaib"));
        
        for (String key: map.keySet()) {
            System.out.printf("%s : %s\n", key, map.get(key));
        }
    }
    
}
