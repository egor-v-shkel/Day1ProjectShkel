package by.javatr.task3.logic;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class CircleInscribedLogicTest {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void calculate() {
        assertEquals(CircleInscribedLogic.calculate(255.0), 127.5, 0.1);
    }

    @Test
    public void calculateExc() {
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("Проверьте правильность ввода");
        CircleInscribedLogic.calculate(-4.0);
    }
}