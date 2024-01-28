package edu.upvictoria.fpoo.helpers;

public class Payments {
    public double totalPayInXWeeks(double payPerHour, double hoursWorkedPerDay, int weeks) {
        Round round = new Round();
        return round.roundTwoDecimals(payPerHour * hoursWorkedPerDay * weeks * 5);
    }

    public double getTotal(double hotelExpenses, double foodExpenses, double otherExpenses, int totalOfDays) {
        Round round = new Round();
        return round.roundTwoDecimals(hotelExpenses + foodExpenses + (otherExpenses * totalOfDays));
    }
}
