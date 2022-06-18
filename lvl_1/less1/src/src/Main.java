public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        float coffee = startCoffeeMachine(1);
        System.out.println(coffee);
    }

    /**
     * 1 - Americano;
     * 2 - Espresso;
     *
     * @return liters;
     */
    static float startCoffeeMachine(int type) {
        return makeAmericano();
    }

    static float makeEspresso() {
        System.out.println("Making Espresso...");
        return 0.2f;
    }

    static float makeAmericano() {
        System.out.println("Making Americano...");
        return 0.5f;
    }
}
