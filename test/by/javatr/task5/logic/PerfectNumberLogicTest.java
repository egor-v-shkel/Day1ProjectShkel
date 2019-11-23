package by.javatr.task5.logic;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class PerfectNumberLogicTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void isPerfectNegativeNum() {
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("Введено ненатуральное число.");
        PerfectNumberLogic.isPerfect(-1);
    }

    @Test
    public void isPerfect() {
        assertTrue(PerfectNumberLogic.isPerfect(8128));
    }

    @Test
    public void notPerfect() {
        assertFalse(PerfectNumberLogic.isPerfect(1993));
    }

    @Test
    public void zero() {
        assertFalse(PerfectNumberLogic.isPerfect(0));
    }
}