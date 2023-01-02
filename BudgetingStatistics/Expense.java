package BudgetingStatistics;

/**
 * The expense being budgeted to.
 */
public class Expense {
    private double budget;
    private String name;

    /**
     * @param budget The money budgeted to this expense
     * @param name The name of the expense
     */
    public Expense(double budget, String name) {
        this.budget = budget;
        this.name = name;
    }

    /**
     * Set the new budget to the expense
     * @param budget The new budget
     */
    public void setBudget(double budget) { this.budget = budget; }
}
