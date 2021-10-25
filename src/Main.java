import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
    }

    //n! with stream api
    static int factorialStreams(int startValue) {
        return IntStream.rangeClosed(2, startValue).reduce(1, (x, y) -> x * y);
    }

    //n! without stream api
    static int factorial(int startValue) {
        if (startValue <= 1) {
            return 1;
        } else {
            return startValue * factorial(startValue - 1);
        }
    }

    //reverse massive [1..n] with stream api
    static int[] reverse(int initMass[]) {
        return IntStream.range(0, initMass.length)
                .map(i -> initMass[initMass.length - 1 - i])
                .toArray();
    }

    //reverse massice [1..n] without stream api :(
    static Object[] reverseInCycle(Object initMass[]) {
        for (int i = 0; i < initMass.length / 2; i++) {
            Object temp = initMass[i];
            initMass[i] = initMass[initMass.length - 1 - i];
            initMass[initMass.length - 1 - i] = temp;
        }
        return initMass;
    }
}