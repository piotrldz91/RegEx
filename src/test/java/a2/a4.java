package a2;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class a4 {

    @Test
    public void test1(){
        // given
        String patternString = "[1-4[8-9]]";
        String matcherString = "3";

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
        String patternString = "[3-7&&[5-9]]";
        String matcherString = "3";

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
        String patternString = "[3-7&&[5-9]]";
        String matcherString = "123456789";
        int expectedMatches = 3;

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

    @Test
    public void test4(){
        // given
        String patternString = "[a-g&&[^d-z]]";
        String matcherString = "abcdefghij";
        int expectedMatches = 3;

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
