// Реализовать простой калькулятор (+ - / *)
// Ввод числа ->
// Ввод знака ->
// Ввод числа ->

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите число : ");
        Scanner sc = new Scanner(System.in);
        int first_num = sc.nextInt();
        System.out.println("Введите знак +,-,/,*3: ");
        char sign = sc.next().charAt(0);
        System.out.println("Введите второе число : ");
        int second_num = sc.nextInt();
        sc.close();
        var result = 0;
        if(sign == '+'){
            result = first_num + second_num;
            System.out.println("ответ =  " + result);
        }
        else if(sign == '-'){
            result = first_num - second_num;
            System.out.println("ответ =  " + result);
        }
        else if(sign == '*'){
            result = first_num * second_num;
            System.out.println("ответ = " + result);
        }
        else if(sign == '/'){
            if(first_num % second_num != 0){
                double first_num1 = first_num;
                double second_num1 = second_num;
                double result1 = first_num1 / second_num1;
                System.out.println("ответ =  " + result1);
            }
            else{
                result = first_num / second_num;
                System.out.println("ответ =  " + result);
            
            }
        }
    }
}
