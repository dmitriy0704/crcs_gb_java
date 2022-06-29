public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        //initVars();

        // 3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,где a, b, c, d – входные параметры этого метода;
        // System.out.println(mathVars(10, 20,30,40));

        // 4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;
        // System.out.println(checkSum(30,15));

        // 5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
        //System.out.println(checkNumber(5));

        //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
        String name = "Иван";
        System.out.println(String.format("Привет %s", name));



    }

    public static void initVars(){
        byte b = 1;
        short sh = 2;
        int i = 3;
        long l = 4L;
        float f = 4.5F;
        double d = 4.58;
        boolean bl = true;
    }


    public static int mathVars(int a, int b, int c, int d){
        return  a * (b + (c / d));
    }

    public static boolean checkSum(int i, int j){
        int s = i + j;
        int limit1 = 10;
        int limit2 = 20;
        if(s > limit1 && s < limit2){
            return true;
        }
        return false;
    }

    public static String checkNumber(int n){
        if(n >= 0) {
            return "Число положительное";
        }
        return "Число отрицательное";
    }

}
