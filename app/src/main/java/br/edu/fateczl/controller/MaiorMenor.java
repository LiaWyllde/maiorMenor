package br.edu.fateczl.controller;

import android.widget.EditText;

public class MaiorMenor {

    public String verificaMenor (EditText numero1, EditText numero2){

        int nn1 = Integer.parseInt(numero1.getText().toString());
        int nn2 = Integer.parseInt(numero2.getText().toString());

        String n2 = String.valueOf(nn2);
        String n1 = String.valueOf(nn1);

        if (nn1 > nn2) {
            return n2;
        } else {
            return n1;
        }
    }

    public String verificaMaior (EditText numero1, EditText numero2){

        int nn1 = Integer.parseInt(numero1.getText().toString());
        int nn2 = Integer.parseInt(numero2.getText().toString());

        String n2 = String.valueOf(nn2);
        String n1 = String.valueOf(nn1);

        if (nn1 > nn2) {
            return n1;
        } else {
            return n2;
        }
    }

    public String somatoria (EditText numero1, EditText numero2){

        int maior = Integer.parseInt(verificaMaior(numero1, numero2));
        int menor = Integer.parseInt(verificaMenor(numero1, numero2));
        int somatoria = 0;

        String n2 = String.valueOf(maior);
        String n1 = String.valueOf(menor);


        for (int i = (menor + 1); i < maior; i++){
            if ((i % 2) == 1){
                somatoria += i;
            }
        }

        String total = String.valueOf(somatoria);

        return total;
    }
}
