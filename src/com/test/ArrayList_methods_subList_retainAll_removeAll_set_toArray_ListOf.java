package com.test;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_methods_subList_retainAll_removeAll_set_toArray_ListOf {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();
        s.add("A");
        s.add("B");
        s.add("C");
        s.add("D");

        String[] stringsArrays = s.toArray(new String[s.size()]);

        List<Integer> list = List.of(1, 3, 6, 9);
        list.set(2, 2);
        System.out.println(list);

    }
}
/*

ArrayList методы:

subList() - создает новый массив List от  индекса до индекса, не включая последний элемент (то есть, последний элемент -1). Если после создания subList добавить новый элемент на родительский массив, выбросится exception
retainAll() - оставляет только указанные элементы в
removeAll() - удаляет перечисленные элементы
set() - заменяет указанный элемент на другой
toArray() - конвертация ArrayList на обычный массив Object. Можно сделать на String вот так:  String[] stringsArrays = arrayList.toArray(new String[0]); - если поставить 0, то можно не указать размер массива
List.of() - можно создать массив List сразу с элементами, пример: List<Integer> list = List.of(1, 3, 6, 9); После этого нельзя добавлять (add), удалять(remove), изменять(set) другие элементы



*/
