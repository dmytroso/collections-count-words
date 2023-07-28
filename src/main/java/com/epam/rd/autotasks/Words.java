package com.epam.rd.autotasks;

import java.util.*;

public class Words {

    public String countWords(List<String> lines) {
        StringTokenizer tokenizer = new StringTokenizer(lines.toString(), "[] .,‘’(“—/:?!”;*)'\\\"-");

        Map<String, Integer> hm = new HashMap<String, Integer>();

        while(tokenizer.hasMoreTokens()) {
            String str = tokenizer.nextToken().toLowerCase();
            if(str.length() > 3) {
                Integer value = hm.getOrDefault(str, 0);
                hm.put(str, ++value);
            }
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(hm.entrySet());

        list.sort(Map.Entry.<String, Integer>comparingByValue().reversed()
                .thenComparing(Map.Entry.comparingByKey()));

        StringJoiner joiner = new StringJoiner("\n");
        for (Map.Entry<String, Integer> entry : list) {
            if(entry.getValue() > 9) {
                joiner.add(entry.getKey()+" - "+entry.getValue());
            }
        }

        return joiner.toString();
    }
}
