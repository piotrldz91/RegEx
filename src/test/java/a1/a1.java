package a1;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class a1 {

    @Test
    public void test () {
        Pattern pattern = Pattern.compile("regex");
        Matcher matcher = pattern.matcher("Badany ciag znakow");
        System.out.println(matcher);
    }
}
