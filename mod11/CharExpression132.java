package academy.kata.educational_process.core1.mod11;

/**
 * Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после символа "\" (обратный слэш) на расстоянии a.
 * В качестве примера написано заведомо неправильное выражение. Исправьте его.
 */
public class CharExpression132 {
    public static char charExpression(int a) {
        //Твой код здесь
        return (char) ('\\' + a);
    }

    public static void main(String[] args) {
        char a = 'a';
        System.out.println("Буква: " + charExpression(a));
    }
}
