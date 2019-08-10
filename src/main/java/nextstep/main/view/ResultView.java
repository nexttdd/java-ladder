package nextstep.main.view;

import nextstep.main.vo.Ladder;
import nextstep.main.vo.Persons;

import java.util.List;

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

    public static void executeResults(List<String> results){
        results.forEach(System.out::print);
    }

    public static void textResultPerson(String result){
        System.out.println("실행 결과");
        System.out.println(result);
    }

    public static void textResultAll(){
        System.out.println("실행 결과");

    }
}
