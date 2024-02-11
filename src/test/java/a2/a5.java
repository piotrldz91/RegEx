package a2;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class a5 {

    @Test
    public void test1(){
        // given
        String patternString = "\\d";
        String matcherString = "sk test123 sk sk test123";
        int expectedMatches = 6;

        // when
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(matcherString);
        int amountOfMatches = 0;
        while(matcher.find()){
            amountOfMatches++;
        }

        // then
        assertEquals(expectedMatches,amountOfMatches);
    }

    @Test
    public void test2(){
        // given
        String patternString = "\\D";
        String matcherString = "sk test123 sk sk test123";
        int expectedMatches = 18;

        // when
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(matcherString);
        int amountOfMatches = 0;
        while(matcher.find()){
            amountOfMatches++;
        }

        // then
        assertEquals(expectedMatches,amountOfMatches);
    }

    @Test
    public void test3(){
        // given
        String patternString = "\\s";
        String matcherString = "sk test123 sk sk test123";
        int expectedMatches = 4;

        // when
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(matcherString);
        int amountOfMatches = 0;
        while(matcher.find()){
            amountOfMatches++;
        }

        // then
        assertEquals(expectedMatches,amountOfMatches);
    }

    @Test
    public void test4(){
        // given
        String patternString = "\\S";
        String matcherString = "sk test123 sk sk test123";
        int expectedMatches = 20;

        // when
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(matcherString);
        int amountOfMatches = 0;
        while(matcher.find()){
            amountOfMatches++;
        }

        // then
        assertEquals(expectedMatches,amountOfMatches);
    }

    @Test
    public void test5(){
        // given
        String patternString = "\\w"; // [a-zA-Z0-9_]
        String matcherString = "!@#aB1 ";
        int expectedMatches = 3;

        // when
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(matcherString);
        int amountOfMatches = 0;
        while(matcher.find()){
            amountOfMatches++;
        }

        // then
        assertEquals(expectedMatches,amountOfMatches);
    }

    @Test
    public void test6(){
        // given
        String patternString = "\\W"; // [^a-zA-Z0-9_]
        String matcherString = "!@#aB1 ";
        int expectedMatches = 4;

        // when
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(matcherString);
        int amountOfMatches = 0;
        while(matcher.find()){
            amountOfMatches++;
        }

        // then
        assertEquals(expectedMatches,amountOfMatches);
    }



}
