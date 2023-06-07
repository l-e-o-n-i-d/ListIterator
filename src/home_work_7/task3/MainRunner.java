package home_work_7.task3;

/**
 * Використовуючи Intelij IDEA, створити проект, пакет. Створити клас home_work_pidruchnyk.Main, створити список цілих чисел і за допомогою
 * ListIterator пройтись по списку і збільшити значення на 1.
 */

public class MainRunner {
    public static void main(String[] args) {
        Main list = new Main(1, 2, 3, 4, 5);
        System.out.println(list.getList());
        list.iterate();
        for (Integer num : list.getList()) {
            System.out.println(num);
        }
    }
}
