/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.nmq.mathutil.core.test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.nmq.mathutil.core.MathUtility;

/**
 *
 * @author Hp
 */
public class MathUtilityTest {

    @Test
    public void testFactorialGivenWrongArgumentReturnsWell() {
        assertEquals(24, MathUtility.getFactorial(4));
    }
}
