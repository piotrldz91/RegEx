package a1;

import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class a3 {

    @Test
    public void test1(){
        // given
        String patternString = "sk.sk";
        String matcherString = "sk1sk";

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
        String patternString = "sk.sk";
        String matcherString = "skqsk";

        // when
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(matcherString);
        boolean hasFound = matcher.find();

        // then
        assertTrue(hasFound);
    }

    @Test
    public void test3(){
        // given
        String patternString = "sk.sk";
        String matcherString = "skgqsk";

        // when
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(matcherString);
        boolean hasFound = matcher.find();

        // then
        assertFalse(hasFound);
    }

    @Test
    public void test4(){
        // given
        String patternString = "sk..sk";
        String matcherString = "skgqsk";

        // when
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(matcherString);
        boolean hasFound = matcher.find();

        // then
        assertTrue(hasFound);
    }

    @Test
    public void test5(){
        // given
        String patternString = "sk..sk";
        String matcherString = "sk12sk";

        // when
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(matcherString);
        boolean hasFound = matcher.find();

        // then
        assertTrue(hasFound);
    }

    @Test
    public void test6(){
        // given
        String patternString = "sk.";
        String matcherString = "sk test123 sk12";
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
    public void test7(){
        // given
        String patternString = "sk.";
        String matcherString = "sk test123 sk12 sk\n";
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
    public void test8(){
        // given
        String patternString = "sk.";
        String matcherString = "sk1";

        // when
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(matcherString);
        boolean matches = matcher.matches();

        // then
        assertTrue(matches);
    }

    @Test
    public void test9(){
        // given
        String patternString = "sk.";
        String matcherString = "sk12";

        // when
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(matcherString);
        boolean matches = matcher.matches();

        // then
        assertFalse(matches);
    }

    @Test
    public void test10(){
        // given
        String patternString = "strefakursow\\.pl";
        String matcherString = "strefakursow.pl test123";

        // when
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(matcherString);
        boolean hasFound = matcher.find();

        // then
        assertTrue(hasFound);
    }

    @Test
    public void test11(){
        // given
        String patternString = "strefakursow\\.pl";
        String matcherString = "strefakursowdpl test123";

        // when
        Pattern pattern = Pattern.compile(patternString);
        Matcher matcher = pattern.matcher(matcherString);
        boolean hasFound = matcher.find();

        // then
        assertFalse(hasFound);
    }
}
