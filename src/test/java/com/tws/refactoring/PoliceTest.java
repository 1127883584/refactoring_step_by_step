package com.tws.refactoring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PoliceTest {
    @Test
    public void should_return_true_when_age_is_greater_than_18(){
        //given
        Police police = new Police();
        Driver driver = new Driver(25);

        //when
        boolean result = police.checkDriver(driver);

        //then
        assertTrue(result);
    }

    @Test
    public void should_return_true_when_age_is_18(){
        //given
        Police police = new Police();
        Driver driver = new Driver(18);

        //when
        boolean result = police.checkDriver(driver);

        //then
        assertTrue(result);
    }

    @Test
    public void should_return_false_when_age_is_smaller_than_18(){
        //given
        Police police = new Police();
        Driver driver = new Driver(15);

        //when
        boolean result = police.checkDriver(driver);

        //then
        assertFalse(result);
    }
}
