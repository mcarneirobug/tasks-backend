package br.ce.wcaquino.taskbackend.utils;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class DateUtilsTest {

    @Test
    public void shouldReturnTrueToFutureDate() {
        LocalDate date = LocalDate.of(2030, 1, 1);
        Assert.assertTrue(DateUtils.isEqualOrFutureDate(date));
    }

    @Test
    public void shouldReturnFalseToFutureDate() {
        LocalDate date = LocalDate.of(2010, 1, 1);
        Assert.assertFalse(DateUtils.isEqualOrFutureDate(date));
    }

    @Test
    public void shouldReturnTrueToCurrentDate() {
        LocalDate date = LocalDate.now();
        Assert.assertTrue(DateUtils.isEqualOrFutureDate(date));
    }
}
