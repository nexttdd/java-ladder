package nextstep.main.view;

import nextstep.main.vo.Ladder;
import nextstep.main.vo.Persons;

public class ResultView {
    public static void executeNames(Persons persons){
        System.out.println("사다리 결과");

        persons.getPersons()
                .forEach(System.out::print);


        System.out.println();
    }

    public static void drawLadder(Ladder ladder) {
        ladder.getLines()
                .forEach(System.out::println);
    }

    public static void executeResults(Persons results){
        results.getPersons()
                .forEach(System.out::print);
    }

    public static void textResultPerson(){
        System.out.println("실행 결과");
    }

    public static void textResultAll(){
        System.out.println("실행 결과");

    }
}
