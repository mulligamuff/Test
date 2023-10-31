package junitTest;

public class Kalky {

    private int first, second;

    public Kalky(int first, int second) {
        this.first = first;
        this.second = second;
    }

    public int add() {
        return first + second;
    }
}
