package ru.geekbrains.lesson2;

public class DataStorage{

    private String buffer = "";
    private Integer numberOne;
    private Integer numberTwo;
    private String operator;


    public void setBuffer(String buffer) {
        this.buffer = this.getBuffer() + buffer;
    }

    public void setNumberOne(Integer numberOne) {
        this.numberOne = numberOne;
    }

    public void setNumberTwo(Integer numberTwo) {
        this.numberTwo = numberTwo;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getBuffer() {
        return buffer;
    }
}
