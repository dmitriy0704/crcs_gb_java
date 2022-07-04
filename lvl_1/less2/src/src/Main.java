public class Main {
    public static void main(String[] args) {
        System.out.println(maceCoffee(4));
    }

    static float startCoffeeMachine(int type) {
        float val = 0;
        while (val == 0) {
            System.out.println("Making coffee...");
            val = maceCoffee(type);
        }
        return val;
    }

    /**
     * 1 - Espresso
     * 2 - Americano
     * 3 - Latte
     * 4 - Mocachino
     *
     * @param type - coffee type
     * @return
     */
    static float maceCoffee(int type) {
        float val;
        switch (type) {
            case 1: {
                return 0.3f;
            }
            case 2: {
                return 0.5f;
            }
            case 3: {
                return 0.7f;
            }
            case 4: {
                return 0.9f;
            }
            default: {
                val = 0.0f;
            }
        }
        return val;
    }
}
