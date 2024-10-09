package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;
    Team team2;

    @BeforeEach
    public void setup() {
        team = new Team("f24-14");    
        team2 = new Team("not f24-14");
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("f24-14"));
    }

    @Test
    public void getTeamStr_returns_correct_str() {
        assert(team.toString().equals("Team(name=" + team.getName() + ", members=" + team.getMembers() + ")"));
    }

    @Test
    public void hashCode_returns_correct_code() {
        assertEquals(team.hashCode(), -1327023895);
    }

    @Test
    public void teamEquals_returns_correct_bool() {
        assert(team.equals(team) == true);
        assert(team.equals(null) == false);
        assert(team.equals(team2) == false);
        team.addMember("Temp");
        assert(team.equals(team2) == false);
        team2.setName("f24-14");
        assert(team.equals(team2) == false);
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

}
