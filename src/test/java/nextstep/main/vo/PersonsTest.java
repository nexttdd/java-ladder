package nextstep.main.vo;

import org.junit.Test;

public class PersonsTest {
    @Test(expected = IllegalArgumentException.class)
    public void 플레이어_이름이_5글자_넘는_경우() {
        //given
        new Persons("moon, moonhye");
    }
}