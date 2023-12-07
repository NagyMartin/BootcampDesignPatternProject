package org.example;
/**
 * Pizza size Enum Class, containing weigh and time to cook properties.
 * Properties are of int type and used as such in the application.
 */
import lombok.Getter;

@Getter
public enum PizzaSize {
    EXTRA_LARGE(1000, 20),
    LARGE(750, 15),
    MEDIUM(500, 10),
    SMALL(350, 5),
;
    private final int grams;
    private final int cookDurationInSeconds;

    PizzaSize(int grams, int cookDurationInSeconds) {
        this.grams = grams;
        this.cookDurationInSeconds = cookDurationInSeconds;
    }
}
