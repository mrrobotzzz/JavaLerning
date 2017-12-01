package ru.mrrobot.basics;

/**
 * Чтобы начать программировать в Java нужно создать класс и в нем создать метод main (psvm)
 * Чтобы напечатать что то в консоль нужно вызвать метод System.out.println() или sout
 *
 */
public class lesson1 {
    public static void main(String[] args) {
        // Создали ячейку памяти с типом int именем a и присвоили 5
        hello();

    }

    private static void hello() {
        System.out.println("Hello world!");
    }
}
