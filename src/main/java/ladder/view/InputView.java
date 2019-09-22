package ladder.view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private static Scanner scanner = new Scanner(System.in);

    public static String[] inputNames() {
//        Scanner scanner = new Scanner(System.in);
        System.out.println("참여할 사람 이름을 입력하세요. (이름은 쉼표(,)로 구분하세요)");
        return scanner.nextLine().split(",");
    }

    public static List<String> inputResult() {
//        Scanner scanner = new Scanner(System.in);
        System.out.println("\n실행 결과를 입력하세요. (결과는 쉼표(,)로 구분하세요)");
        return Arrays.asList(scanner.nextLine().split(","));
    }

    public static int inputLadderHeight() {
//        Scanner scanner = new Scanner(System.in);
        System.out.println("\n최대 사다리 높이는 몇 개인가요?");
        return Integer.parseInt(scanner.nextLine());
    }

    public static String inputLadderGameLevel() {
        System.out.println("\n 실행할 사다리의 난이도는?");
        return scanner.nextLine();
    }

    public static String inputCheckResult() {
//        Scanner scanner = new Scanner(System.in);
        System.out.println("\n결과를 보고 싶은 사람은?");
        return scanner.nextLine();
    }
}
