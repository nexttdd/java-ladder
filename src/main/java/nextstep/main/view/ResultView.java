package nextstep.main.view;

import nextstep.main.vo.Ladder;
import nextstep.main.vo.Persons;

public class ResultView {
    public static void executeNames(Persons persons){
        System.out.println("실행결과");

        persons.getPersons()
                .forEach(System.out::print);

        System.out.println();
    }

    public static void drawLadder(Ladder ladder) {
        ladder.getLines()
                .forEach(System.out::println);
    }
}
