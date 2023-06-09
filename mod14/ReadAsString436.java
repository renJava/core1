package academy.kata.educational_process.core1.mod14;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/**
 * Реализуйте метод readAsString, который зачитает данные из InputStream и преобразует их в строку с помощью
 * StringBuilder, используя заданную кодировку (в т.ч. ASCII).
 *
 * Пример:
 * InputStream последовательно возвращает четыре байта: 48 49 50 51.
 * Метод, вызванный для такого InputStream и кодировки ASCII, должен вернуть строку: "0123".
 */
public class ReadAsString436 {
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        //Твой код здесь
//        InputStreamReader inReader = new InputStreamReader(inputStream, charset);
        BufferedReader bReader = new BufferedReader(new InputStreamReader(inputStream, charset));
        StringBuilder sb = new StringBuilder();

        int c;
        while ((c = bReader.read()) != -1) {
            sb.append((char) c);
        }

        return sb.toString();
    }
    public static void main(String[] args) throws Exception{
        InputStream inByte = new ByteArrayInputStream(new byte[]{48, 49, 50, 51});
        System.out.println(readAsString(inByte, StandardCharsets.US_ASCII));

    }
}
