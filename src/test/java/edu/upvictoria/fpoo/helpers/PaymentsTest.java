package edu.upvictoria.fpoo.helpers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentsTest {

    @Test
    void totalPayInXWeeks_1() {
        Payments payments = new Payments();
        assertEquals(5, payments.totalPayInXWeeks(1, 1, 1));
    }

    @Test
    void totalPayInXWeeks_2() {
        Payments payments = new Payments();
        assertEquals(625, payments.totalPayInXWeeks(5, 5, 5));
    }

    @Test
    void totalPayInXWeeks_3() {
        Payments payments = new Payments();
        assertEquals(4250, payments.totalPayInXWeeks(6.8, 12.5, 10));
    }

    @Test
    void totalPayInXWeeks_4() {
        Payments payments = new Payments();
        assertEquals(184, payments.totalPayInXWeeks(3.2, 2.3, 5));
    }

    @Test
    void getTotal_1() {
        Payments payments = new Payments();
        assertEquals(320, payments.getTotal(10, 10, 30, 10));
    }

    @Test
    void getTotal_2() {
        Payments payments = new Payments();
        assertEquals(200, payments.getTotal(30, 20, 50, 3));
    }

    @Test
    void getTotal_3() {
        Payments payments = new Payments();
        assertEquals(373.60, payments.getTotal(202.05, 20.83, 50.24, 3));
    }

    @Test
    void getTotal_4() {
        Payments payments = new Payments();
        assertEquals(260.80, payments.getTotal(32.26, 45.21, 20.37, 9));
    }

}