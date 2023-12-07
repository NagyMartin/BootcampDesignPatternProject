package org.example;
/**
 * Pizza Object Class, using the creational builder design pattern.
 * Wanted to manually write the code, instead of using annotations, for practice and better understanding
 * of class creation.
 */

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Pizza {

    private final PizzaSize size;
    private final boolean hasPizzaSauce;
    private final boolean hasBBQSauce;
    private final boolean hasPestoSauce;
    private final boolean hasTomatoSauce;

    private final boolean hasChickenMeat;
    private final boolean hasBacon;
    private final boolean hasHam;

    private final boolean hasSalami;

    private final boolean hasPepperoni;

    private final boolean hasChorizo;

    private final boolean hasSausage;

    private final boolean hasTomatoes;
    private final boolean hasOlives;

    private final boolean hasRedOnion;

    private final boolean hasMushrooms;

    private final boolean hasBabySpinach;

    private final boolean hasCorn;

    private final boolean hasMozzarellaCheese;
    private final boolean hasBocconciniCheese;
    private final boolean hasFetaCheese;
    private final boolean hasBrieCheese;
    private final boolean hasGarlicSeasoning;
    private final boolean hasOreganoSeasoning;
    private final boolean hasChilliFlakesSeasoning;
    private final boolean hasBasilSeasoning;

    private Pizza(PizzaSize size, boolean hasPizzaSauce, boolean hasBBQSauce, boolean hasPestoSauce,
                 boolean hasTomatoSauce, boolean hasChickenMeat, boolean hasBacon, boolean hasHam,
                 boolean hasSalami, boolean hasPepperoni, boolean hasChorizo, boolean hasSausage,
                 boolean hasTomatoes, boolean hasOlives, boolean hasRedOnion, boolean hasMushrooms,
                 boolean hasBabySpinach, boolean hasCorn, boolean hasMozzarellaCheese,
                 boolean hasBocconciniCheese, boolean hasFetaCheese, boolean hasBrieCheese,
                 boolean hasGarlicSeasoning, boolean hasOreganoSeasoning,
                 boolean hasChilliFlakesSeasoning, boolean hasBasilSeasoning) {
        this.size = size;
        this.hasPizzaSauce = hasPizzaSauce;
        this.hasBBQSauce = hasBBQSauce;
        this.hasPestoSauce = hasPestoSauce;
        this.hasTomatoSauce = hasTomatoSauce;
        this.hasChickenMeat = hasChickenMeat;
        this.hasBacon = hasBacon;
        this.hasHam = hasHam;
        this.hasSalami = hasSalami;
        this.hasPepperoni = hasPepperoni;
        this.hasChorizo = hasChorizo;
        this.hasSausage = hasSausage;
        this.hasTomatoes = hasTomatoes;
        this.hasOlives = hasOlives;
        this.hasRedOnion = hasRedOnion;
        this.hasMushrooms = hasMushrooms;
        this.hasBabySpinach = hasBabySpinach;
        this.hasCorn = hasCorn;
        this.hasMozzarellaCheese = hasMozzarellaCheese;
        this.hasBocconciniCheese = hasBocconciniCheese;
        this.hasFetaCheese = hasFetaCheese;
        this.hasBrieCheese = hasBrieCheese;
        this.hasGarlicSeasoning = hasGarlicSeasoning;
        this.hasOreganoSeasoning = hasOreganoSeasoning;
        this.hasChilliFlakesSeasoning = hasChilliFlakesSeasoning;
        this.hasBasilSeasoning = hasBasilSeasoning;
    }


    public static class PizzaBuilder {
        private PizzaSize size;
        private boolean hasPizzaSauce;
        private boolean hasBBQSauce;
        private boolean hasPestoSauce;
        private boolean hasTomatoSauce;

        private boolean hasChickenMeat;
        private boolean hasBacon;
        private boolean hasHam;

        private boolean hasSalami;

        private boolean hasPepperoni;

        private boolean hasChorizo;

        private boolean hasSausage;

        private boolean hasTomatoes;
        private boolean hasOlives;

        private boolean hasRedOnion;

        private boolean hasMushrooms;

        private boolean hasBabySpinach;

        private boolean hasCorn;

        private boolean hasMozzarellaCheese;
        private boolean hasBocconciniCheese;
        private boolean hasFetaCheese;
        private boolean hasBrieCheese;
        private boolean hasGarlicSeasoning;
        private boolean hasOreganoSeasoning;
        private boolean hasChilliFlakesSeasoning;
        private boolean hasBasilSeasoning;

        public PizzaBuilder(PizzaSize size){
            this.size = size;
        }
        public PizzaBuilder withPizzaSauce(boolean hasPizzaSauce){
            this.hasPizzaSauce = hasPizzaSauce;
            return this;
        }
        public PizzaBuilder withBBQSauce(boolean hasBBQSauce){
            this.hasBBQSauce = hasBBQSauce;
            return this;
        }
        public PizzaBuilder withPestoSauce(boolean hasPestoSauce){
            this.hasPestoSauce = hasPestoSauce;
            return this;
        }
        public PizzaBuilder withTomatoSauce(boolean hasTomatoSauce){
            this.hasTomatoSauce = hasTomatoSauce;
            return this;
        }
        public PizzaBuilder withChickenMeat(boolean hasChickenMeat){
            this.hasChickenMeat = hasChickenMeat;
            return this;
        }
        public PizzaBuilder withBacon(boolean hasBacon){
            this.hasBacon = hasBacon;
            return this;
        }
        public PizzaBuilder withHam(boolean hasHam){
            this.hasHam = hasHam;
            return this;
        }
        public PizzaBuilder withSalami(boolean hasSalami){
            this.hasSalami = hasSalami;
            return this;
        }
        public PizzaBuilder withPepperoni(boolean hasPepperoni){
            this.hasPepperoni = hasPepperoni;
            return this;
        }
        public PizzaBuilder withChorizo(boolean hasChorizo){
            this.hasChorizo = hasChorizo;
            return this;
        }
        public PizzaBuilder withSausage(boolean hasSausage){
            this.hasSausage = hasSausage;
            return this;
        }
        public PizzaBuilder withTomatoes(boolean hasTomatoes){
            this.hasTomatoes = hasTomatoes;
            return this;
        }
        public PizzaBuilder withOlives(boolean hasOlives){
            this.hasOlives = hasOlives;
            return this;
        }
        public PizzaBuilder withRedOnion(boolean hasRedOnion){
            this.hasRedOnion = hasRedOnion;
            return this;
        }
        public PizzaBuilder withMushrooms(boolean hasMushrooms){
            this.hasMushrooms = hasMushrooms;
            return this;
        }
        public PizzaBuilder withBabySpinach(boolean hasBabySpinach){
            this.hasBabySpinach = hasBabySpinach;
            return this;
        }
        public PizzaBuilder withCorn(boolean hasCorn){
            this.hasCorn = hasCorn;
            return this;
        }
        public PizzaBuilder withMozzarellaCheese(boolean hasMozzarellaCheese){
            this.hasMozzarellaCheese = hasMozzarellaCheese;
            return this;
        }
        public PizzaBuilder withBocconciniCheese(boolean hasBocconciniCheese){
            this.hasBocconciniCheese = hasBocconciniCheese;
            return this;
        }
        public PizzaBuilder withFetaCheese(boolean hasFetaCheese){
            this.hasFetaCheese = hasFetaCheese;
            return this;
        }
        public PizzaBuilder withBrieCheese(boolean hasBrieCheese){
            this.hasBrieCheese = hasBrieCheese;
            return this;
        }
        public PizzaBuilder withGarlicSeasoning(boolean hasGarlicSeasoning){
            this.hasGarlicSeasoning = hasGarlicSeasoning;
            return this;
        }
        public PizzaBuilder withOreganoSeasoning(boolean hasOreganoSeasoning){
            this.hasOreganoSeasoning = hasOreganoSeasoning;
            return this;
        }
        public PizzaBuilder withChilliFlakesSeasoning(boolean hasChilliFlakesSeasoning){
            this.hasChilliFlakesSeasoning = hasChilliFlakesSeasoning;
            return this;
        }
        public PizzaBuilder withBasilSeasoning(boolean hasBasilSeasoning){
            this.hasBasilSeasoning = hasBasilSeasoning;
            return this;
        }
        public Pizza build(){
            return new Pizza(size, hasPizzaSauce, hasBBQSauce, hasPestoSauce, hasTomatoSauce, hasChickenMeat,
                    hasBacon, hasHam, hasSalami, hasPepperoni, hasChorizo, hasSausage, hasTomatoes, hasOlives,
                    hasRedOnion, hasMushrooms, hasBabySpinach, hasCorn, hasMozzarellaCheese, hasBocconciniCheese,
                    hasFetaCheese, hasBrieCheese, hasGarlicSeasoning, hasOreganoSeasoning, hasChilliFlakesSeasoning,
                    hasBasilSeasoning);
        }
    }
}
