package org.example.Pacadge;

public class Task_Try_catch_ArithmeticException_ {
    public void division(int a) {
        int b = 10 / a;
    }



   /* public int a = 0;
    public int b = 10/a;
    public void pound (a,b);
    try{
        System.out.println("Этосообщениенебудетвыведено в консоль");
    }catch(ArithmeticExceptione) {
        System.out.println("Деление на ноль");
    } System.out.println("Завершение работы");


    //метод считывает строку с клавиатуры
    public String input() throws MyException {//предупреждаем с помощью throws,
// что метод может выбросить исключение MyException
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
//в блок try заключаем код, в котором может произойти исключение, в данном
// случае компилятор нам подсказывает, что метод readLine() класса
// BufferedReader может выбросить исключение ввода/вывода
        try {
            s = reader.readLine();
// в блок  catch заключаем код по обработке исключения IOException
        } catch (IOException e) {
            System.out.println(e.getMessage());
// в блоке finally закрываем поток чтения
        } finally {
// при закрытии потока тоже возможно исключение, например, если он не был открыт, поэтому “оборачиваем” код в блок try
            try {
                reader.close();
// пишем обработку исключения при закрытии потока чтения
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        if (s.equals("")) {
// мы решили, что пустая строка может нарушить в дальнейшем работу нашей программы, например, на результате этого метода нам надо вызывать метод substring(1,2), поэтому мы вынуждены прервать выполнение программы с генерацией своего типа исключения MyException с помощью throw
            throw new MyException("String can not be empty!");
        }
        return s;
    }

    */

}
