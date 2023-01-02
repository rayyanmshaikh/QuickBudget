package BudgetingStatistics;

import java.util.ArrayList;

/**
 * Tracking the budget of a month.
 */
public class MonthlyBudget extends Statistics{

    private ArrayList<Expense> expenses; //A list of expenses of the month

    /**
     * Constructing the budget for the month
     * @param budget The budget for the month
     */
    public MonthlyBudget(double budget, String month) {
        super(budget, month);
        this.expenses = new ArrayList<>();
    }

    /**
     * Calculating the remaining allotted budget and used percentage.
     */
    @Override
    void calculateMoney() {

    }


    /**
     * Add an expense for the month
     * @param budget the budget for the expense
     * @param name the name of the expense
     */
    public void addExpense(double budget, String name) { expenses.add(new Expense(budget, name)); }
}
