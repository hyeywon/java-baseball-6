package baseball;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class Computer {
    private static List<Integer> answer = new ArrayList<>();

    public Computer() {
        while (answer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!answer.contains(randomNumber)) {
                answer.add(randomNumber);
            }
        }
    }

    public String check(List<Integer> input) {
        int ball = 0, strike = 0;

        for (int i = 0; i < input.size(); i++) {
            if (input.get(i).equals(answer.get(i))) {
                strike++;
            } else if (answer.contains(input.get(i))) {
                ball++;
            }
        }
        return result(ball, strike);
    }

    private String result(int ball, int strike) {
        String result = "";

        if (strike == 0 && ball == 0) {
            return "낫싱";
        }
        if (ball != 0) {
            result += ball + "볼 ";
        }
        if (strike != 0) {
            result += strike + "스트라이크";
        }
        return result.trim();
    }

    public void clear() {
        answer.clear();
    }
}
