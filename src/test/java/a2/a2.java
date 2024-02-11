package a2;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class a2 {

    // nie szukamy:
    // tama

    // szukamy:
    // pozostałe litery + ama

    @Test
    public void test1(){
        // given
        String patternString = "[^s]";
        String matcherString = "b";

        // when
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(matcherString);
        boolean hasFound = matcher.matches();

        // then
        assertTrue(hasFound);
    }

    @Test
    public void test2(){
        // given
        String patternString = "[^s]";
        String matcherString = "s";

        // when
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(matcherString);
        boolean hasFound = matcher.matches();

        // then
        assertFalse(hasFound);
    }

    @Test
    public void test3(){
        // given
        String patternString = "[^012]";
        String matcherString = "12353464574442323321";
        int expectedMatches = 14;

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
        String patternString = "\\s[^s].\\s";
        String matcherString = " sk cb se vk sk sk cd ";
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
    public void test5(){
        // given
        String patternString = "[^t]ama";
        String matcherString = "tama rama kama bama zama tama";
        int expectedMatches = 4;

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
