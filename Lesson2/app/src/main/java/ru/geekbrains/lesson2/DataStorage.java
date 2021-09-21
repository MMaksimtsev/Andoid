package ru.geekbrains.lesson2;

public class DataStorage{

    private String buffer = "";
    private Float numberOne;
    private Float numberTwo;
    private String operator;


    public void setBuffer(String buffer) {
        if (buffer == null) {
            this.buffer = "";
        } else {
            this.buffer = this.getBuffer() + buffer;
        }
    }

    public void setNumberOne(Float numberOne) {
        this.numberOne = numberOne;
    }

    public void setNumberTwo(Float numberTwo) {
        this.numberTwo = numberTwo;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getBuffer() {
        return buffer;
    }

    public Float getNumberOne() {
        return numberOne;
    }

    public Float getNumberTwo() {
        return numberTwo;
    }
}
