/* 
 * Copyright 2019 Mario Merlos Abella - mario.merlos.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mario Merlos Abella - mario.merlos.alum@iescamp.es
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {

        //Variables
        char consol;
        int s = 0;
        int l = 0;
        int xxl = 0;
        int total;

        double porcentaje1;
        double porcentaje2;
        double porcentaje3;

        System.out.println("Talla clientes");
        System.out.println("=================");
        do {
            System.out.print("Inserte el su talla..:");
            consol = SCN.nextLine().charAt(0);
            switch (consol) {
                case 's':
                    s++;
                    break;
                case 'l':
                    l++;
                    break;
                case 'x':
                    xxl++;
                    break;

            }

        } while (consol != '0');
        total = s + l + xxl;
        porcentaje1 = (double) s / (double) total * 100;
        porcentaje2 = (double) l / (double) total * 100;
        porcentaje3 = (double) xxl / (double) total * 100;
        System.out.printf(Locale.ENGLISH, "Cliente con talla s ....:"
                + " %.2f%%%n", porcentaje1);
        System.out.printf(Locale.ENGLISH, "Cliente con talla l  ....:"
                + " %.2f%%%n", porcentaje2);
        System.out.printf(Locale.ENGLISH, "Cliente con talla xxl  ..:"
                + " %.2f%%%n", porcentaje3);
    }
}
