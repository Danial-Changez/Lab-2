/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package prime.numbers;

public class PrimeNumbers {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1; i < 10000; i++) {
            for (int j = 1; j <= i; j++) {
                switch (i % j) {
                    case 0:
                        count++;
                        break;
                }
            }
            
            switch (count) {
                case 2:
                    System.out.println("Prime: " + i);
                    break;
            }
            count = 0;
        }
    }
}
