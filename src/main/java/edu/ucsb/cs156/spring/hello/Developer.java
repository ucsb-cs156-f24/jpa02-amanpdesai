pckage edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {

        return "Aman D.";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "amanpdesai";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("f24-14");
        team.addMember("Rio P.");
        team.addMember("Oviya S.");
        team.addMember("Aman D.");
        team.addMember("Jennifer Z.");
        team.addMember("Vala B.");
        team.addMember("Kevin Y.");
        return team;
    }
}
