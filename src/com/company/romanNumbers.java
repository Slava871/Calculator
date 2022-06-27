package com.company;

import javafx.util.Pair;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

 class romanNumbers {
// создадим картотеку римских чисел от 1 до 100

  //скопируем римские цифры из интернета и запишем в строку
   static String s= "I\n" +
            "II\n" +
            "III\n" +
            "IV\n" +
            "V\n" +
            "VI\n" +
            "VII\n" +
            "VIII\n" +
            "IX\n" +
            "X\n" +
            "XI\n" +
            "XII\n" +
            "XIII\n" +
            "XIV\n" +
            "XV\n" +
            "XVI\n" +
            "XVII\n" +
            "XVIII\n" +
            "XIX\n" +
            "XX\n" +
            "XXI\n" +
            "XXII\n" +
            "XXIII\n" +
            "XXIV\n" +
            "XXV\n" +
            "XXVI\n" +
            "XXVII\n" +
            "XXVIII\n" +
            "XXIX\n" +
            "XXX\n" +
            "XXXI\n" +
            "XXXII\n" +
            "XXXIII\n" +
            "XXXIV\n" +
            "XXXV\n" +
            "XXXVI\n" +
            "XXXVII\n" +
            "XXXVIII\n" +
            "XXXIX\n" +
            "XL\n" +
            "XLI\n" +
            "XLII\n" +
            "XLIII\n" +
            "XLIV\n" +
            "XLV\n" +
            "XLVI\n" +
            "XLVII\n" +
            "XLVIII\n" +
            "XLIX\n" +
            "L\n" +
            "LI\n" +
            "LII\n" +
            "LIII\n" +
            "LIV\n" +
            "LV\n" +
            "LVI\n" +
            "LVII\n" +
            "LVIII\n" +
            "LIX\n" +
            "LX\n" +
            "LXI\n" +
            "LXII\n" +
            "LXIII\n" +
            "LXIV\n" +
            "LXV\n" +
            "LXVI\n" +
            "LXVII\n" +
            "LXVIII\n" +
            "LXIX\n" +
            "LXX\n" +
            "LXXI\n" +
            "LXXII\n" +
            "LXXIII\n" +
            "LXXIV\n" +
            "LXXV\n" +
            "LXXVI\n" +
            "LXXVII\n" +
            "LXXVIII\n" +
            "LXXIX\n" +
            "LXXX\n" +
            "LXXXI\n" +
            "LXXXII\n" +
            "LXXXIII\n" +
            "LXXXIV\n" +
            "LXXXV\n" +
            "LXXXVI\n" +
            "LXXXVII\n" +
            "LXXXVIII\n" +
            "LXXXIX\n" +
            "XC\n" +
            "XCI\n" +
            "XCII\n" +
            "XCIII\n" +
            "XCIV\n" +
            "XCV\n" +
            "XCVI\n" +
            "XCVII\n" +
            "XCVIII\n" +
            "XCIX\n" +
            "C\n";

//теперь запишем римские числа в Map (ключ - арабское число, значение - римское)
   static Map<Integer, String> mapCreator(){
       Map<Integer, String> map = new LinkedHashMap<>();
       String[] ar = s.split("\n"); // разбили стрку на массив строк по переносу
      for(int j=0; j<ar.length; j++ ){  //записали в словарь
          map.put(j+1, ar[j]);
      }

             return map;
    }



}