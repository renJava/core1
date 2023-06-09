package academy.kata.educational_process.core1.mod13;

/**
 * Реализуйте метод, позволяющий другим методам узнать, откуда их вызвали.
 * <p>
 * Метод getCallerClassAndMethodName() должен возвращать имя класса и метода, откуда вызван метод, вызвавший данный
 * утилитный метод. Или null (нулевую ссылку, а не строку "null"), если метод, вызвавший getCallerClassAndMethodName()
 * является точкой входа в программу, т.е. его никто не вызывал.
 * При запуске эта программа должна вывести:
 * null
 * org.your.project.Test#main
 */
public class GetCallerClassAndMethodName316 {
    public static String getCallerClassAndMethodName() {
        StackTraceElement[] stackTraceElements = new Exception().getStackTrace();
        return (stackTraceElements.length > 2) ?
                stackTraceElements[0].getClassName() + "#" + stackTraceElements[2].getMethodName() :
                null;
    }


//    private static void anotherMethod() {
//        System.out.println(getCallerClassAndMethodName());
//    }


    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
//        anotherMethod();
    }
}