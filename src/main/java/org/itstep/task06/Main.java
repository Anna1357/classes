package org.itstep.task06;

/**
 * Задание
 * Описать  базовый  класс  MainString  (Строка).
 * <p>
 * Обязательные поля класса:
 * - массив символов (chars);
 * - значение типа int хранит длину строки в символах (len).
 * <p>
 * Реализовать  обязательные  методы  следующего  назначения:
 * - конструктор без параметров;
 * - конструктор, принимающий в качестве параметра строковый литерал;
 * - конструктор, принимающий в качестве параметра символ и длину строки;
 * - метод получения длины строки (length());
 * - метод очистки строки (делает строку пустой) (clear());
 * - метод конкатенации (соединяет две строки типа MainString) (concat);
 * - метод поиска символа в строке (indexOf()).
 * - метод toString(), который возвращает строковое представление объекта
 * <p>
 * Класс должен находиться в отдельном файле в этом же пакете
 */
public class Main {
    public static void main(String[] args) {
MainString s1=new MainString();
        System.out.println( "s1 = " + s1 );
        MainString s2=new MainString("Hello");
        System.out.println( "s2 = " + s2 );
        MainString s3=new MainString('*',10);
        System.out.println( "s3 = " + s3 );
    }
}
