package BudgetingStatistics;

/**
 * An abstract class containing common statistics
 */
public abstract class Statistics {
    protected double budget; //The budget
    protected Double used_percentage; //The percentage of the budget used
    protected Double remaining; //The remaining amount of the budget
    protected String name; //The year or month

    public Statistics(double budget, String name) {
        this.budget = budget;
        this.name = name;
    }

    /**
     * Calculating the remaining allotted budget and used percentage.
     */
    abstract void calculateMoney();

    /**
     * Set the budget allotted for the year/month
     */
    public void setBudget(double budget) { this.budget = budget; }
}
