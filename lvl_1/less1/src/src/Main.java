public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        float coffee = startCoffeeMachine(1);
        System.out.println(coffee);
        System.out.println(startCoffeeMachine(3));
    }

    /**
     * 1 - Americano
     * 2 - Espresso
     * @param type - type code
     * @return value
     */
    static float startCoffeeMachine(int type) {
        if(type == 1){
            return makeAmericano();
        } else if(type == 2) {
            return makeEspresso();
        } else{
            System.out.println("Unknown type...");
            return 0.0f;
        }
    }

    static float makeEspresso() {
        System.out.println("Making Espresso...");
        return 0.2f;
    }
    static float makeAmericano() {
        System.out.println("Making Americano...");
        return  0.5f;
    }

    static boolean isYear2020or2021(int year){
        if(year == 2020 || year ==2021){
            return true;
        }
        return false;
    }
}
