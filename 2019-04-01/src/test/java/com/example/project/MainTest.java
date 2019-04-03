/*
 * Copyright 2015-2018 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20 */

package com.example.project;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Calendar;

@Tag("fast")
class MainTest {

    @Test
    @DisplayName("to 01-04-2019 with(diaVencimento=15 and diasTributo=0) hold 15-04-2019")
    void testMain() {
        try {
            Calendar dateNow = Calendar.getInstance();
            dateNow.set(2019, Calendar.APRIL, 1);
            Main main = new Main();
            Assertions.assertEquals(main.main(dateNow, 15, 0), "15-04-2019");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @DisplayName("to 14-04-2019 with(diaVencimento=15 and diasTributo=0) hold 15-04-2019")
    void testMain2() {
        try {
            Calendar dateNow = Calendar.getInstance();
            dateNow.set(2019, Calendar.APRIL, 14);
            Main main = new Main();
            Assertions.assertEquals(main.main(dateNow, 15, 0), "15-04-2019");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @DisplayName("to 14-04-2019 with(diaVencimento=15 and diasTributo=0) hold 15-05-2019")
    void testMain3() {
        try {
            Calendar dateNow = Calendar.getInstance();
            dateNow.set(2019, Calendar.APRIL, 17);
            Main main = new Main();
            Assertions.assertEquals(main.main(dateNow, 15, 0), "15-05-2019");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @DisplayName("to 15-04-2019 with(diaVencimento=15 and diasTributo=0) hold 15-04-2019")
    void testMain4() {
        try {
            Calendar dateNow = Calendar.getInstance();
            dateNow.set(2019, Calendar.APRIL, 15);
            Main main = new Main();
            Assertions.assertEquals(main.main(dateNow, 15, 0), "15-04-2019");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @DisplayName("to 16-04-2019 with(diaVencimento=15 and diasTributo=0) hold 15-05-2019")
    void testMain5() {
        try {
            Calendar dateNow = Calendar.getInstance();
            dateNow.set(2019, Calendar.APRIL, 16);
            Main main = new Main();
            Assertions.assertEquals(main.main(dateNow, 15, 0), "15-05-2019");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @DisplayName("to 14-02-2019 with(diaVencimento=15 and diasTributo=0) hold 15-02-2019")
    void testMain6() {
        try {
            Calendar dateNow = Calendar.getInstance();
            dateNow.set(2019, Calendar.FEBRUARY, 14);
            Main main = new Main();
            Assertions.assertEquals(main.main(dateNow, 15, 0), "15-02-2019");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @DisplayName("to 20-02-2019 with(diaVencimento=15 and diasTributo=0) hold 15-03-2019")
    void testMain7() {
        try {
            Calendar dateNow = Calendar.getInstance();
            dateNow.set(2019, Calendar.FEBRUARY, 20);
            Main main = new Main();
            Assertions.assertEquals(main.main(dateNow, 15, 0), "15-03-2019");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @DisplayName("to 20-02-2019 with(diaVencimento=15 and diasTributo=0) hold 15-03-2019")
    void testMain8() {
        try {
            Calendar dateNow = Calendar.getInstance();
            dateNow.set(2019, Calendar.FEBRUARY, 20);
            Main main = new Main();
            Assertions.assertEquals(main.main(dateNow, 15, 0), "15-03-2019");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
