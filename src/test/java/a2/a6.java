package a2;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class a6 {

    //szukamy:
    // abCD#12
    // EFgz!34
    // ...

    //nie szukamy:
    // stQR@89
    // OPuw%79
    // OPuw%89

    private final static String patternString1 = "[a-zA-Z&&[^s-wO-R]]*[\\W&&[^@%]][0-6]*";

    @Test
    public void test1(){
        // given
        String matcherString = "abCD#12";

        // when
        Pattern pattern = Pattern.compile(patternString1);
        Matcher matcher = pattern.matcher(matcherString);
        boolean isMatching = matcher.matches();

        // then
        assertTrue(isMatching);
    }

    @Test
    public void test2(){
        // given
        String matcherString = "EFgz!34";

        // when
        Pattern pattern = Pattern.compile(patternString1);
        Matcher matcher = pattern.matcher(matcherString);
        boolean isMatching = matcher.matches();

        // then
        assertTrue(isMatching);
    }

    @Test
    public void test3(){
        // given
        String matcherString = "stQR@89";

        // when
        Pattern pattern = Pattern.compile(patternString1);
        Matcher matcher = pattern.matcher(matcherString);
        boolean isMatching = matcher.matches();

        // then
        assertFalse(isMatching);
    }

    @Test
    public void test4(){
        // given
        String matcherString = "OPuw%79";

        // when
        Pattern pattern = Pattern.compile(patternString1);
        Matcher matcher = pattern.matcher(matcherString);
        boolean isMatching = matcher.matches();

        // then
        assertFalse(isMatching);
    }

    @Test
    public void test5(){
        // given
        String matcherString = "OPuw%89";

        // when
        Pattern pattern = Pattern.compile(patternString1);
        Matcher matcher = pattern.matcher(matcherString);
        boolean isMatching = matcher.matches();

        // then
        assertFalse(isMatching);
    }

}
