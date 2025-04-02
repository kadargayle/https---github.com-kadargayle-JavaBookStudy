package ChapterOne;

public class PopulationProjection {
    public static void main(String[] args) {
        // Given data
        int currentPopulation = 312_032_486; // Current population
        int secondsPerYear = 365 * 24 * 60 * 60; // Total seconds in a year

        // Birth, death, and immigration rates
        int birthsPerYear = secondsPerYear / 7;
        int deathsPerYear = secondsPerYear / 13;
        int immigrantsPerYear = secondsPerYear / 45;

        // Population change per year
        int netIncreasePerYear = birthsPerYear + immigrantsPerYear - deathsPerYear;

        // Display population projection for the next 5 years
        System.out.println("Projected population for the next 5 years:");
        for (int year = 1; year <= 5; year++) {
            currentPopulation += netIncreasePerYear;
            System.out.println("Year " + year + ": " + currentPopulation);
        }
    }
}
