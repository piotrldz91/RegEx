package a2;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class a3 {

    @Test
    public void test1(){
        // given
        String patternString = "[A-Z]";
        String matcherString = "B";

        // when
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(matcherString);
        boolean isMatching = matcher.matches();

        // then
        assertTrue(isMatching);
    }

    @Test
    public void test2(){
        // given
        String patternString = "[A-Z]";
        String matcherString = "b";

        // when
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(matcherString);
        boolean isMatching = matcher.matches();

        // then
        assertFalse(isMatching);
    }

    @Test
    public void test3(){
        // given
        String patternString = "[a-z]";
        String matcherString = "g";

        // when
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(matcherString);
        boolean isMatching = matcher.matches();

        // then
        assertTrue(isMatching);
    }

    @Test
    public void test4(){
        // given
        String patternString = "[a-z]";
        String matcherString = "G";

        // when
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(matcherString);
        boolean isMatching = matcher.matches();

        // then
        assertFalse(isMatching);
    }

    @Test
    public void test5(){
        // given
        String patternString = "[1-9]";
        String matcherString = "4";

        // when
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(matcherString);
        boolean isMatching = matcher.matches();

        // then
        assertTrue(isMatching);
    }

    @Test
    public void test6(){
        // given
        String patternString = "[1-9]";
        String matcherString = "0";

        // when
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(matcherString);
        boolean isMatching = matcher.matches();

        // then
        assertFalse(isMatching);
    }

    @Test
    public void test7(){
        // given
        String patternString = "[0-3]";
        String matcherString = "0";

        // when
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(matcherString);
        boolean isMatching = matcher.matches();

        // then
        assertTrue(isMatching);
    }

    @Test
    public void test8(){
        // given
        String patternString = "[0-3]";
        String matcherString = "4";

        // when
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(matcherString);
        boolean isMatching = matcher.matches();

        // then
        assertFalse(isMatching);
    }

    @Test
    public void test9(){
        // given
        String patternString = "[C-G]";
        String matcherString = "D";

        // when
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(matcherString);
        boolean isMatching = matcher.matches();

        // then
        assertTrue(isMatching);
    }

    @Test
    public void test10(){
        // given
        String patternString = "[C-G]";
        String matcherString = "Z";

        // when
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(matcherString);
        boolean isMatching = matcher.matches();

        // then
        assertFalse(isMatching);
    }

    @Test
    public void test11(){
        // given
        String patternString = "[a-cG-Z]";
        String matcherString = "b";

        // when
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(matcherString);
        boolean isMatching = matcher.matches();

        // then
        assertTrue(isMatching);
    }

    @Test
    public void test12(){
        // given
        String patternString = "[a-cG-Z]";
        String matcherString = "H";

        // when
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(matcherString);
        boolean isMatching = matcher.matches();

        // then
        assertTrue(isMatching);
    }

    @Test
    public void test13(){
        // given
        String patternString = "[a-cG-Z]";
        String matcherString = "z";

        // when
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(matcherString);
        boolean isMatching = matcher.matches();

        // then
        assertFalse(isMatching);
    }

    @Test
    public void test14(){
        // given
        String patternString = "[a-cG-Z5-7]";
        String matcherString = "6";

        // when
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(matcherString);
        boolean isMatching = matcher.matches();

        // then
        assertTrue(isMatching);
    }

    @Test
    public void test15(){
        // given
        String patternString = "[a-cG-Z5-7]";
        String matcherString = "3";

        // when
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(matcherString);
        boolean isMatching = matcher.matches();

        // then
        assertFalse(isMatching);
    }

    @Test
    public void test16(){
        // given
        String patternString = "\\s..[0-3]*\\s";
        String matcherString = " bg3 cc0b1 sd ddd3 re4 ";
        int expectedMatches = 2;

        // when
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(matcherString);
        int amountOfMatches = 0;
        while(matcher.find()){
            amountOfMatches++;
        }

        // then
        assertEquals(expectedMatches, amountOfMatches);
    }



}
