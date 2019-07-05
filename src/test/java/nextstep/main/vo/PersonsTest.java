package nextstep.main.vo;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonsTest {
    @Test
    public void 문자열을_쉽표로_구분할때_사람_명수() {
        //given
        String names = "문혜영, 문혜영2";

        //when
        Persons result = Persons.generate(names);

        //then
        assertThat(result.getPersons()).isEqualTo(2);
    }
}