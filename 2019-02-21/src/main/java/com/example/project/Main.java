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

public class Main {

    public int mod10(String numeros) {
        try {
            String numeroReverso = new StringBuilder(numeros).reverse().toString();
            int soma = 0;
            int peso = 2;
            for (char ch : numeroReverso.toCharArray()) {
                int result = Character.getNumericValue(ch) * peso;
                int[] digits = Integer.toString(result).chars().map(c -> c - '0').toArray();
                soma += result > 10 ? digits[0] + digits[1] : result;
                peso = peso == 2 ? 1 : 2;
            }
            int proximaDezena = (int) (Math.floor((soma + 10) / 10.0) * 10);
            int total = proximaDezena - soma;
            return total >= 10 ? 0 : total;
        } catch (Exception e) {
            System.out.println(e);
        }
        return -1;
    }


    public int mod11(String numeros) {
        try {
            String numeroReverso = new StringBuilder(numeros).reverse().toString();
            int soma = 0;
            int fator = 2;
            for (char ch : numeroReverso.toCharArray()) {
                soma += Character.getNumericValue(ch) * fator;
                fator = fator == 9 ? 2 : fator + 1;
            }
            int digito = 11 - (soma % 11);
            return digito >= 10 ? 1 : digito;
        } catch (Exception e) {
            System.out.println(e);
        }
        return -1;
    }

    public int modDV(String numeros) {
        try {
            String resultado = "";
            for (int i = 0; i < numeros.length(); i++)
                resultado = resultado + Integer.parseInt((Character.toString(numeros.charAt(i)))) * (i % 2 == 0 ? 2 : 1);
            int valor = 0;
            for (int i = 0; i < resultado.length(); i++)
                valor += Integer.parseInt((Character.toString(resultado.charAt(i))));
            int resultadoFinal = (10 - (valor % 10));
            return resultadoFinal >= 10 ? 0 : resultadoFinal;
        } catch (Exception e) {
            System.out.println(e);
        }
        return -1;
    }

}
