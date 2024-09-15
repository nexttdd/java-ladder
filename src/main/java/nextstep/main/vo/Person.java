package nextstep.main.vo;

import nextstep.main.utils.CommonUtils;
import nextstep.main.utils.Consts;

public class Person {
    private String name;

    public Person(String name) {
        if (name.length() > Consts.MAX_NAME_COUNT)
            throw new IllegalArgumentException();

        this.name = name;
    }

    @Override
    public String toString() {
        return CommonUtils.arrangeName(this.name);
    }

    public boolean isMatch(String personName) {
        return name.equals(personName);
    }
}
