package a202312;

import java.util.Arrays;

public class Ps231229_1 {
    public static void main(String[] args) {

    }

    class Solution {
        public long dividePlayers(int[] skill) {
            Arrays.sort(skill);
            int ptr1 = 1;
            int ptr2 = skill.length-2;
            int teamSkill = skill[ptr1-1] + skill[ptr2+1];
            long answer = ((long) skill[ptr1 - 1] * skill[ptr2+1]);

            if(skill.length == 2) return answer;

            while(ptr1 < ptr2) {
                if(teamSkill == skill[ptr1] + skill[ptr2]) {
                    answer += ((long) skill[ptr1] * skill[ptr2]);
                }
                else return -1;

                ptr1++;
                ptr2--;
            }

            return answer;
        }
    }
}
