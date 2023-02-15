package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

////проверка гита через ком строку

 class Main {

    public static void main(String[] args) throws IOException, myException {

        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String s = bfr.readLine();
            System.out.println(calc(s));
        }




    }

     public static String calc(String input) throws myException{
         List<String> romelist= new ArrayList<>();
         romelist.add("I");
         romelist.add("II");
         romelist.add("III");
         romelist.add("IV");
         romelist.add("V");
         romelist.add("VI");
         romelist.add("VII");
         romelist.add("VIII");
         romelist.add("IX");
         romelist.add("X");
         List<Integer> arablist= new ArrayList<>();
         for(int j=1; j<11; j++){
             arablist.add(j);
         }//

//проверка на правильный ввод строки (если в строке ввели лишний пробел)
         char[] ch = input.toCharArray();
         if(ch[ch.length-1] == ' ') { throw new myException("лишний пробел"); }

         String[] symbols = input.split(" ");// разделили по пробелу, получили массив из трех строк


         //проверка на правильный ввод строки
         if (symbols.length > 3){ throw new myException("операция оформлена некорректно"); }

         //Проверка на одновременное использ  римских и арабских чисел
         List<String> stringArabList = new ArrayList<>(); // здесь арабские числа записаны как строки
         for( Integer x: arablist){ stringArabList.add(x+""); }
            /*проверять арабское число будем по листу stringArabList
         (чтобы работало, когда оба числа римские, и не было NumberFormatException */
         try {
             if (romelist.contains(symbols[0]) & stringArabList.contains(symbols[2])) {
                 throw new myException("нельзя в одной строке вводить и римские, и арабские числа");
             } else if (stringArabList.contains(symbols[0]) & romelist.contains(symbols[2])) {
                 throw new myException("нельзя в одной строке вводить и римские, и арабские числа");
             }
         }catch (ArrayIndexOutOfBoundsException e){
             throw new myException("операция оформлена некорректно");
         }



         //находим первую цифру
         int a = 0;
         try {
             if (romelist.contains(symbols[0])) {
                 a = arablist.get(romelist.indexOf(symbols[0]));
             } else if (arablist.contains(Integer.parseInt(symbols[0]))) {
                 a = Integer.parseInt(symbols[0]);
             } else {
                 throw new myException("операция оформлена некорректно");
             }
         }catch (NumberFormatException e){
             throw new myException("операция оформлена некорректно");
         }

         //находим вторую цифру
         int b = 0;
         try {
             if (romelist.contains(symbols[2])) {
                 b = arablist.get(romelist.indexOf(symbols[2]));
             } else if (arablist.contains(Integer.parseInt(symbols[2]))) {
                 b = Integer.parseInt(symbols[2]);
             } else {
                 throw new myException("операция оформлена некорректно");
             }
         }catch (NumberFormatException e){
             throw new myException("операция оформлена некорректно");
         }


         //определяем операцию и считаем
         int total = 0;
         switch (symbols[1]) {
             case "+":
                 total = a + b;
                 break;
             case "-":
                 total = a - b;
                 break;
             case "*":
                 total = a * b;
                 break;
             case "/":
                 total = a / b;
                 break;
         }


         //при вводе римскими цифрами - ответ выводится римскими
         String totalString= null;
         if (romelist.contains(symbols[0])){ // если римские цифры
             Map<Integer, String> m = romanNumbers.mapCreator();
             totalString = m.get(total);
             if(total < 0){
                 throw new myException("при работе с римскими цифрами результат не может быть отрицательным");
             }else if(total == 0){
                 throw new myException("при работе с римскими цифрами результат не может быть ноль");
             }
             return totalString;
         }

         return total + "";
     }


 }
