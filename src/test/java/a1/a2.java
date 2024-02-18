package a1;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class a2 {

    @Test
    public void test1(){
        // given
        String patternString = "sk";
        String matcherString = "sk test123 sk sk test123";

        // when
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(matcherString);
        boolean hasFound = matcher.find();

        // then
        assertTrue(hasFound);
    }

    @Test
    public void test2(){
        // given
        String patternString = "sk";
        String matcherString = "sk test123 sk sk test123";

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
        String patternString = "sk";
        String matcherString = "sk";

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
        String patternString = "sk";
        String matcherString = "sk test123 sk sk test123";
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
