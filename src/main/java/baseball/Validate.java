package baseball;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Validate {
    public List<Integer> answer(String input) {
        try {
            if (input.trim().length() != 3) {
                throw new NumberFormatException();
            }
            return Arrays.stream(input.split(""))
                    .mapToInt(Integer::parseInt)
                    .boxed().collect(Collectors.toList());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR] 잘못된 값 입력");
        }
    }

    public int restartOrFinish(String input) {
        try {
            int value = Integer.parseInt(input);
            if ((value != 1) && (value != 2)) {
                throw new NumberFormatException();
            }
            return value;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR] 잘못된 값 입력");
        }
    }
}
