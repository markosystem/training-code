/*
 * Copyright 2015-2018 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Main {

    public String main(Calendar calendar, int diaVencimento, int diasTributos) {
        String output;
        Calendar dateNew = Calendar.getInstance();
        dateNew.setTime(calendar.getTime());
        dateNew.set(Calendar.DAY_OF_MONTH, diaVencimento);
        if (calendar.after(dateNew)) {
            dateNew.add(Calendar.MONTH, 1);
            output = new SimpleDateFormat("dd-MM-yyyy").format(dateNew.getTime());
        } else
            output = new SimpleDateFormat("dd-MM-yyyy").format(dateNew.getTime());
        return output;
    }

}
