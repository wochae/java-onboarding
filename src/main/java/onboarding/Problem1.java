package onboarding;

import java.util.List;
class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;

        if(validation(pobi) || validation(crong)) {
            return -1;
        }
        return answer;
    }
    public static boolean validation(List<Integer> pages) {
        if (pages.get(0) + 1 != pages.get(1)) {
            return false;
        }
        if (pages.get(0) % 2 == 0 && pages.get(1) % 2 == 1) {
            return false;
        }
        return true;
    }


}
