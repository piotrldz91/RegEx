package a1;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class a6 {

    @Test
    public void test1(){
        // given
        String patternString = "\\s";
        String matcherString = "sk sk";

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
        String patternString = "\\s";
        String matcherString = "sksk";

        // when
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(matcherString);
        boolean hasFound = matcher.find();

        // then
        assertFalse(hasFound);
    }

    @Test
    public void test3(){
        // given
        String patternString = "sk\\s*sk";
        String matcherString = "sk       sk";

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
        String patternString = "sk\\s*sk";
        String matcherString = "sk\t\tsk";

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
        String patternString = "\\s";
        String matcherString = "sk\t\tsk";
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
    public void test6(){
        // given
        String patternString = "\\s";
        String matcherString = "sk      sk";
        int expectedMatches = 6;

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
    public void test7(){
        // given
        String patternString = "\\s";
        String matcherString = " 5123 6463 1231 6431 ";
        String expectedString = "5123646312316431";

        // when
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(matcherString);
        String resultString = matcher.replaceAll("");

        // then
        assertEquals(expectedString, resultString);
    }

    @Test
    public void test8(){
        // given
        String patternString = "\\s";
        String matcherString = "sk\nsk";

        // when
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(matcherString);
        boolean hasFound = matcher.find();

        // then
        System.out.println(matcherString);
        assertTrue(hasFound);
    }

    @Test
    public void test9(){
        // given
        String patternString = "\\s";
        String matcherString = "sksk";

        // when
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(matcherString);
        boolean hasFound = matcher.find();

        // then
        System.out.println(matcherString);
        assertFalse(hasFound);
    }

}
