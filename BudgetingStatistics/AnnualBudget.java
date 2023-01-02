package BudgetingStatistics;

import java.time.Month;
import java.util.ArrayList;

/**
 * Tracking the budget of a year.
 */
public class AnnualBudget extends Statistics{
    private ArrayList<MonthlyBudget> months;

    /**
     * Constructing the budget for the year
     * @param budget annual income or net worth
     * @param months the months in the year
     */
    public AnnualBudget(double budget, String year, ArrayList<MonthlyBudget> months) {
        super(budget, year);
        this.months = new ArrayList<>();
        for(int i = 1; i < 13; i++) this.months.add(new MonthlyBudget(0, String.valueOf(Month.of(i))));
    }

    /**
     * Calculating the remaining allotted budget and used percentage.
     */
    @Override
    void calculateMoney() {

    }
}
