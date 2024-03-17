package a202312;

import java.util.*;
// https://leetcode.com/problems/find-duplicate-file-in-system/
public class Ps231216_1 {
    public static void main(String[] args) {
        // String[] str = {"root/a 1.txt(abcd) 2.txt(efsfgh)","root/c 3.txt(abdfcd)","root/c/속성.d 4.txt(efggdfh)"};
        //String[] str = {"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/속성.d 4.txt(efgh)", "root 4.txt(efgh)"};
        String[] str = {"root/a 1.txt(abcd) 2.txt(efsfgh) 3.txt(efsfgh)","root/c 3.txt(abdfcd)","root/c/속성.d 4.txt(efggdfh)"};
        // map 써야한다.

        Map<String, List<String>> map = new HashMap<>();

        // rootName = arr[0];

        for(String s : str) {
            String[] arr = s.split(" ");


            for(int i = 1; i < arr.length; i++) {
                int divisionIdx = arr[i].indexOf("(");
                //map.put(arr[0]+"/"+arr[i].substring(0, divisionIdx), arr[i].substring(divisionIdx));
                String temp = arr[0]+"/"+arr[i].substring(0, divisionIdx);

                //map.computeIfAbsent(arr[i].substring(divisionIdx), value -> new ArrayList<>() ).add(temp);
                map.computeIfAbsent(arr[i].substring(divisionIdx), k -> new ArrayList<>()).add(temp);
            }
        }
        System.out.println(map.entrySet());

        List<List<String>> answer = new ArrayList<>();
        for(Map.Entry<String, List<String>> entry : map.entrySet()) {
            List<String> values = entry.getValue();
            if(values.size() > 1) answer.add(values);
        }


        answer.addAll(map.values());


 /*       int divisionIdx = arr[i].indexOf("(");
        String fileNumber = arr[i].substring(0, divisionIdx);
        String fileName = arr[i].substring(divisionIdx);*/
    }

    class Solution {
        public List<List<String>> findDuplicate(String[] paths) {
            Map<String, List<String>> map = new HashMap<>();


            for(String s : paths) {
                String[] arr = s.split(" ");

                for(int i = 1; i < arr.length; i++) {
                    int divisionIdx = arr[i].indexOf("(");
                    map.computeIfAbsent(arr[i].substring(divisionIdx),
                            k -> new ArrayList<>()).add(arr[0]+"/"+arr[i].substring(0, divisionIdx));
                }
            }

            List<List<String>> answer = new ArrayList<>();
            for(Map.Entry<String, List<String>> entry : map.entrySet()) {
                List<String> values = entry.getValue();
                if(values.size() > 1) answer.add(values);
            }

            return answer;
        }
    }


}
