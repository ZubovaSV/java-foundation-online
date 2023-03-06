package ru.itsjava.strings;

import lombok.Data;

@Data
public class StringPractice {
    public static void main(String[] args) {
        String str = "My name is Svetlana";
        String copyStr = "My name is Svetlana";
        String newStr = new String ("My name is Svetlana");
        String newStrCase = "my name is svetlana";
        //проверим, что два объекта ссылаются на одно место в пуле строк
        System.out.println("(str==copyStr) = " + (str == copyStr));
        //проверим, что два строковых объекта равны по содержанию (по последовательности символов)
        System.out.println("str.equals(newStr) = " + str.equals(newStr));
        //проверим, одна ли ссылка у двух срок, равных по содержанию
        System.out.println("(str == newStr) = " + (str == newStr));
        //проверим объект на наличие в пуле срок и затем сравним внутри пула строк
        System.out.println("(str==newStr.intern()) = " + (str == newStr.intern()));
        //проверим, что два строковых объекта равны по содержанию без учета регистра
        System.out.println("str.equalsIgnoreCase(newStrCase) = " + str.equalsIgnoreCase(newStrCase));

        //разделим текст на слова в массив strs[]
        String[] strs = str.split(" ");
        System.out.println("strs[0] = " + strs[0]);
        System.out.println("strs[0] = " + strs[1]);
        System.out.println("strs[0] = " + strs[2]);
        System.out.println("strs[0] = " + strs[3]);
        //изменим строку класса StringBuider в цикле добавляя каждый раз значение i
        StringBuilder strBuild = new StringBuilder("0");
        for (int i = 1; i < 1000; i++) {
            strBuild = strBuild.append(" " + i);
        }
        System.out.println(strBuild);



    }
}
