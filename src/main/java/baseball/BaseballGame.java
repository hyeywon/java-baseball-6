package baseball;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;

public class BaseballGame {
    private final Validate validate = new Validate();
    private final Computer computer = new Computer();

    public int play() {
        String result;
        do {
            result = attempt();
        } while (!result.equals("3스트라이크"));

        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

        computer.clear();
        return validate.restartOrFinish(Console.readLine());
    }

    private String attempt() {
        System.out.println("숫자를 입력해주세요 : ");
        List<Integer> answer = validate.answer(Console.readLine());
        return computer.check(answer);
    }
}
