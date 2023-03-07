public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    private static void task1() {
        System.out.println("Задача 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника " + fullName);
    }

    private static void task2() {
        System.out.println("Задача 2");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        String fullNameTrue = fullName.replace("Ivanov Ivan Ivanovich", " IVANOV IVAN IVANOVICH");
        System.out.println(" Первый вариант");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameTrue);
        System.out.println();
        String fullNameSmall="ivanov ivan ivanovich";
        System.out.println(" Второй вариант");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameSmall.toUpperCase());
        System.out.println();
    }

    private static void task3() {
        System.out.println("Задача 3");
        String fullName = "Иванов Семён Семёнович";
        String fullNameTrue = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника —" + fullNameTrue);
    }
}