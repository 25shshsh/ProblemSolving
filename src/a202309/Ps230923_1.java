package a202309;


import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Ps230923_1 {

    public static void main(String[] args) {

        String[] words = {"xbc","pcxbcf","xb","cxbc","pcxbc"};

        // Step 1: 배열을 구성요소 길이를 기준으로 오름차순으로 정렬한다.
        Arrays.sort(words, Comparator.comparingInt(String::length));

        printArr(words);

        // Step 2: 각 word의 길이를 저장하기 위한 해시맵 생성.
        Map<String, Integer> dp = new HashMap<>();

        // 최대경로길이를 1로 초기화
        int maxPath = 1;

        // words 반복
        for (String word : words) {
            int currLength = 1; // current word를 1로
            StringBuilder sb = new StringBuilder(word);

            // 현재 단어의 각 문자를 반복합니다.
            for (int i = 0; i < word.length(); i++) {
                sb.deleteCharAt(i); // word의 i번째 문자열 제거
                String prevWord = sb.toString(); // predecessor에 해당되는 문자를 얻는다.

                // 동적 프로그래밍을 사용하여 currLength를 업데이트 한다.
                currLength = Math.max(currLength, dp.getOrDefault(prevWord, 0) + 1);
                System.out.println(currLength+" "+prevWord);


                // 기존 단어로 복구 (다음 반복을 위함)
                sb.insert(i, word.charAt(i));
            }
            System.out.println(currLength);
            // 현재 word의 길이를 HashMap 저장
            dp.put(word, currLength);

            // 필요하다면, maxPath를 업데이트
            maxPath = Math.max(maxPath, currLength);
        }
        System.out.println(dp.entrySet());
        System.out.println(maxPath);
        //return maxPath
    }




    static void printArr(String[] arr) {
        IntStream.rangeClosed(1, arr.length).forEach(i -> {
            System.out.print(arr[i - 1] + " ");
        });
        System.out.println();
    }

}


