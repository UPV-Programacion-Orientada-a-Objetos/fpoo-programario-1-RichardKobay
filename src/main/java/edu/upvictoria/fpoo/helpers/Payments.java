package edu.upvictoria.fpoo.helpers;

public class Payments {
    public double totalPayInXWeeks(double payPerHour, double hoursWorkedPerDay, int weeks) {
        return payPerHour * hoursWorkedPerDay * weeks * 5;
    }

    public double getTotal(double hotelExpenses, double foodExpenses, double otherExpenses, double totalOfDays) {
        return hotelExpenses + foodExpenses + (otherExpenses * totalOfDays);
    }
}
