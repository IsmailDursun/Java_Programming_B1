package day42_collections;

import java.util.*;

public class AllMapObjects {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("feyruz", "java");
        map.put("hello", "world");
        map.put("james", "bond");
        map.put("tom", "ui testing");
        map.put("nadir", "soft skills");
        map.put("username", "password");
        map.put(null, "nothing");
        System.out.println(map);

        Map<String, String> linked = new LinkedHashMap<>();
        linked.put("feyruz", "java");
        linked.put("hello", "world");
        linked.put("james", "bond");
        linked.put("tom", "ui testing");
        linked.put("nadir", "soft skills");
        linked.put("username", "password");
        linked.put(null, "nothing");
        System.out.println(linked);

        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("feyruz", "java");
        treeMap.put("hello", "world");
        treeMap.put("james", "bond");
        treeMap.put("tom", "ui testing");
        treeMap.put("nadir", "soft skills");
        treeMap.put("username", "password");
        // treeMap.put(null, "nothing"); TreeMap objects cannot have a null key
        System.out.println(treeMap);

        Map<String, String> hashtable = new Hashtable<>();
        hashtable.put("feyruz", "java");
        hashtable.put("hello", "world");
        hashtable.put("james", "bond");
        hashtable.put("tom", "ui testing");
        hashtable.put("nadir", "soft skills");
        hashtable.put("username", "password");
        // hashtable.put(null, null); Hashtable objects cannot have a null key or value
        System.out.println(hashtable);

    }

}

