package baseball;

public class Application {

    public static void main(String[] args) {
        final int RESTART = 1;
        BaseballGame baseballGame = new BaseballGame();

        System.out.println("숫자 야구 게임을 시작합니다.");

        while (baseballGame.play() == RESTART) {}
    }
}
