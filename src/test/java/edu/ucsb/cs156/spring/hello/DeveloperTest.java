package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Test;

public class DeveloperTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        // this hack is from https://www.timomeinen.de/2013/10/test-for-private-constructor-to-get-full-code-coverage/
        Constructor<Developer> constructor = Developer.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()),"Constructor is not private");

        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @Test
    public void getName_returns_correct_name() {
        assertEquals("Aman D.", Developer.getName());
    }

    @Test
    public void getGithubId_returns_correct_id() {
        assertEquals("amanpdesai", Developer.getGithubId());
    }

    @Test
    public void getTeam_returns_correct_team() {
        Team test_team = new Team("f24-14");
        test_team.addMember("Rio P.");
        test_team.addMember("Oviya S.");
        test_team.addMember("Aman D.");
        test_team.addMember("Jennifer Z.");
        test_team.addMember("Vala B.");
        test_team.addMember("Kevin Y.");
        assert(test_team.equals(Developer.getTeam()));
    }

    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

}
