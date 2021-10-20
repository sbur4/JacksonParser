package entity;

import java.util.List;

public class Root {
    private String stringTest;
    private List<Car> arrayTest;

    public Root() {
    }

    public Root(String stringTest, List<Car> arrayTest) {
        this.stringTest = stringTest;
        this.arrayTest = arrayTest;
    }

    public String getStringTest() {
        return stringTest;
    }

    public void setStringTest(String stringTest) {
        this.stringTest = stringTest;
    }

    public List<Car> getArrayTest(List<Car> arrayTest) {
        return arrayTest;
    }

    public void setArrayTest(List<Car> arrayTest) {
        this.arrayTest = arrayTest;
    }

    @Override
    public String toString() {
        return "Root{" +
                "stringTest='" + stringTest + '\'' +
                ", arrayTest=" + arrayTest +
                '}';
    }
}
