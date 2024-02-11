package a1;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class a4 {

    @Test
    public void test1(){
        // given
        String patternString = "sk*";
        String matcherString = "skkkk";

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
        String patternString = "sk*";
        String matcherString = "sk";

        // when
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(matcherString);
        boolean isMatching = matcher.matches();

        // then
        assertTrue(isMatching);
    }

    @Test
    public void test3(){
        // given
        String patternString = "sk*";
        String matcherString = "s";

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
        String patternString = "sk*";
        String matcherString = "sqwerty";

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
        String patternString = "sk*";
        String matcherString = "sqwerty";

        // when
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(matcherString);
        boolean isMatching = matcher.find();

        // then
        assertTrue(isMatching);
    }

    @Test
    public void test6(){
        // given
        String patternString = "sk*";
        String matcherString = "sqqskk";
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
