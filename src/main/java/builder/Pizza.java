package builder;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {

    final Set<Topping> toppings;

    Pizza(Builder builder) {
        toppings = builder.toppings.clone();
    }

    public String toString() {
        return toppings.toString();
    }

    public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}

    ;

    abstract static class Builder {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public Builder addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        public Builder sauceInside() {
            return self();
        }

        abstract Pizza build();

        protected abstract Builder self();
    }
}
