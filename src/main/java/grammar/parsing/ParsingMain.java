package grammar.parsing;

import java.util.Arrays;

import static common.CommonHelperKt.blankSpace;

/**
 * Created by Qoo
 * Date : 2018. 3. 16..
 */
public class ParsingMain {
    public static void main(String[] args) {
        String str = "12.323.4343.232.123.2323-2323-4323";
        String[] strList = str.split(".");
        Arrays.stream(strList)
                .forEach(s -> {
                    System.out.println();
                    System.out.print(s);
                });
        blankSpace();

        strList = str.split("\\.");
        Arrays.stream(strList)
                .forEach(s -> {
                    System.out.println();
                    System.out.print(s);
                });
        blankSpace();

        strList = str.split("\\.|-");
        Arrays.stream(strList)
                .forEach(s -> {
                    System.out.println();
                    System.out.print(s);
                });
    }
}
