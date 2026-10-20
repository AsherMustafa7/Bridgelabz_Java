
/*
 * Question:
 * Design a Personalized Meal Plan Generator for Vegetarian, Vegan,
 * Keto, and High-Protein meal categories.
 *
 * Hint:
 * Define a MealPlan interface and implement its subtypes.
 * Create Meal<T extends MealPlan> and a generic validation method.
 *
 * Author: Asher Mustafa
 * Date: 20 - 10 - 2026
 */

package JavaGenerics.AssignmentsOfJavaGenerics.PersonalizedMealPlanGenerator;

import java.util.ArrayList;
import java.util.List;

// Every valid meal plan must provide its category and description.
interface MealPlan {
    String getCategory();
    String getDescription();
}

// Vegetarian meal plan.
class VegetarianMeal implements MealPlan {
    public String getCategory() {
        return "Vegetarian";
    }

    public String getDescription() {
        return "Vegetable curry with rice";
    }
}

// Vegan meal plan.
class VeganMeal implements MealPlan {
    public String getCategory() {
        return "Vegan";
    }

    public String getDescription() {
        return "Lentil bowl with vegetables";
    }
}

// Keto meal plan.
class KetoMeal implements MealPlan {
    public String getCategory() {
        return "Keto";
    }

    public String getDescription() {
        return "Avocado and egg salad";
    }
}

// High-protein meal plan.
class HighProteinMeal implements MealPlan {
    public String getCategory() {
        return "High-Protein";
    }

    public String getDescription() {
        return "Grilled tofu with beans";
    }
}

// T must implement the MealPlan interface.
class Meal<T extends MealPlan> {
    private String personName;
    private T plan;

    public Meal(String personName, T plan) {
        this.personName = personName;
        this.plan = plan;
    }

    public T getPlan() {
        return plan;
    }

    public void display() {
        System.out.println("Person: " + personName);
        System.out.println("Meal Category: " + plan.getCategory());
        System.out.println("Meal: " + plan.getDescription());
    }
}

public class PersonalizedMealPlanGenerator {

    // Accept any meal whose type implements MealPlan.
    public static <T extends MealPlan> Meal<T> generateMealPlan(
            String personName, T plan) {

        // Validate that the required information is present.
        if (personName == null || personName.trim().isEmpty()
                || plan == null) {
            System.out.println("Invalid meal plan details.");
            return null;
        }

        // Create and return a type-safe meal.
        return new Meal<>(personName, plan);
    }

    // Display a collection containing any valid meal plan subtype.
    public static void displayMealPlans(
            List<? extends MealPlan> plans) {

        for (MealPlan plan : plans) {
            System.out.println("Category: " + plan.getCategory());
            System.out.println("Meal: " + plan.getDescription());
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Generate meal plans for different categories.
        Meal<VegetarianMeal> m1 =
                generateMealPlan("Student 1", new VegetarianMeal());

        Meal<VeganMeal> m2 =
                generateMealPlan("Student 2", new VeganMeal());

        Meal<KetoMeal> m3 =
                generateMealPlan("Student 3", new KetoMeal());

        Meal<HighProteinMeal> m4 =
                generateMealPlan("Student 4", new HighProteinMeal());

        // Display each generated plan when validation succeeds.
        System.out.println("Personalized Meal Plans:\n");

        if (m1 != null) {
            m1.display();
            System.out.println();
        }

        if (m2 != null) {
            m2.display();
            System.out.println();
        }

        if (m3 != null) {
            m3.display();
            System.out.println();
        }

        if (m4 != null) {
            m4.display();
            System.out.println();
        }

        // Store all categories through their shared interface.
        List<MealPlan> plans = new ArrayList<>();
        plans.add(new VegetarianMeal());
        plans.add(new VeganMeal());
        plans.add(new KetoMeal());
        plans.add(new HighProteinMeal());

        // Display the meal options using an upper-bounded wildcard.
        System.out.println("Available Meal Options:\n");
        displayMealPlans(plans);
    }
}
