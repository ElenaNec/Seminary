package org.example.Sem_2;

import lombok.extern.slf4j.Slf4j;

//Дано четное число N (>0) и символы c1 и c2.
//Написать метод, который вернет строку длины N,
//которая состоит из чередующихся символов c1 и c2, начиная с c1.

public class Task1 {
    private String one = "c1";
    private String two = "c2";

    public void build(int num){
        StringBuilder str = new StringBuilder("c1");
        for (int i = 1; i < num ; i++) {
            if (i%2 == 0){
                str.append("c1");
            }
            else {
                str.append("c2");
            }
        }
        System.out.println( str );

    }

}
