package a2;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class a1 {

    // szukamy:
    //tama
    //jama
    //gama

    // nie szukamy:
    //dama
    //.ama
    @Test
    public void test1(){
        // given
        String patternString = "[tjg]ama";
        String matcherString = "tama";

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
        String patternString = "[tjg]ama";
        String matcherString = "jama";

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
        String patternString = "[tjg]ama";
        String matcherString = "dama";

        // when
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(matcherString);
        boolean isMatching = matcher.matches();

        // then
        assertFalse(isMatching);
    }

    @Test
    public void test4(){
        // given
        String patternString = "[tjg]ama";
        String matcherString = "tama sk jama test123gama sk sk damatest123";
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
        String patternString = "[tjg]*ama";
        String matcherString = "ama";

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
        String patternString = "[tjg]*ama";
        String matcherString = "zama";

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
        String patternString = "[tjg]*ama";
        String matcherString = "zama";

        // when
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(matcherString);
        boolean hasFound = matcher.find();

        // then
        assertTrue(hasFound);
    }
}
