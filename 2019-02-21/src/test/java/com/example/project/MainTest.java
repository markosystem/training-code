/*
 * Copyright 2015-2018 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20 */

package com.example.project;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("fast")
class MainTest {

    @Test
    @DisplayName("Teste Módulo 10")
    void testMod10() {
        Main main = new Main();
        assertEquals(5, main.mod10("001905009"));
        assertEquals(9, main.mod10("4014481606"));
        assertEquals(4, main.mod10("0680935031"));
    }

    @Test
    @DisplayName("Teste Módulo 11")
    void testMod11() {
        Main main = new Main();
        assertEquals(6, main.mod11("123"));
        assertEquals(9, main.mod11("0019780100000152000000002779060000003892017"));
        assertEquals(3, main.mod11("0019373700000001000500940144816060680935031"));

        //id=27
        assertEquals(1, main.mod11("0019796300000525000000002779060000202019417"));
        //id=15
        assertEquals(1, main.mod11("0019790300000525010000002779060000152019417"));
        //id=18
        assertEquals(1, main.mod11("0019799500000524980000002779060000182019417"));
        //id=28
        assertEquals(1, main.mod11("0019799400000525000000002779060000212019417"));

    }

    /*@Test
    @DisplayName("My 1st JUnit 5 test! 😎")
    void testModDV() {
        Main main = new Main();
        assertEquals(5, main.modDV("001905009"));
        assertEquals(9, main.modDV("4014481606"));
        assertEquals(4, main.modDV("0680935031"));
    }*/

}
