package ladder.view;

import java.util.Scanner;

public class InputView {
    public static String[] inputNames() {
        Scanner sc = new Scanner(System.in);
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
        return sc.nextLine().split(",");
    }

    public static String inputResult() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요)");
        return sc.nextLine();
    }

    public static int inputLadderHeight() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n최대 사다리 높이는 몇 개인가요?");
        return Integer.parseInt(sc.nextLine());
    }

    public static String inputCheckResult() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n결과를 보고 싶은 사람은?");
        return sc.nextLine();
    }
}
