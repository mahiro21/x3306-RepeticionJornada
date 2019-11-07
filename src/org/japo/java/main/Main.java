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
        int dia;
        int hora;
        int minuto = 0;
        int tHora = 0;
        int tMinuto = 0;

        System.out.println("Jornada laboral");
        System.out.println("===============");
        for (dia = 1; dia <= 7; dia++) {
            try {
                System.out.printf("Jornada %dº día%n", dia);
                System.out.print("hora ..:");
                hora = SCN.nextInt();
                SCN.nextLine();
                System.out.print("minutos ..:");
                minuto = SCN.nextInt();
                System.out.print("");
                tHora += hora;
                tMinuto += minuto;

            } catch (Exception e) {
                System.out.println("Error: valor erroneo");
            }

        }
        tHora = (tMinuto / 60) + tHora;
        tMinuto = tMinuto % 60;
        System.out.printf("Jornada semanal de %d horas y %d minutos%n ",
                tHora, tMinuto);
    }
}
