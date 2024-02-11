package a1;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class a5 {

    @Test
    public void test1(){
        // given
        String patternString = "sk.s*";
        String matcherString = "sk1ssss";

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
        String patternString = "sk.s*";
        String matcherString = "sks";

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
        String patternString = "sk.s*";
        String matcherString = "sktest123sk1sss";
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

    @Test
    public void test4(){
        // given
        String patternString = "sk.*sk";
        String matcherString = "skasfko4sfsk";

        // when
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(matcherString);
        boolean isMatching = matcher.matches();

        // then
        assertTrue(isMatching);
    }

    @Test
    public void test5(){
        // given
        String patternString = "sk.*sk";
        String matcherString = "sksk";

        // when
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(matcherString);
        boolean isMatching = matcher.matches();

        // then
        assertTrue(isMatching);
    }




}
