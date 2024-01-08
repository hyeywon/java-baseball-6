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

    public String check(List<Integer> ans) {
        String result = "";
        // TODO
        return result;
    }

    public void clear() {
        answer.clear();
    }
}
