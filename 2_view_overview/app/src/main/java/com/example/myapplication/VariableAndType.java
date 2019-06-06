package com.example.myapplication;

import java.util.ArrayList;

public class VariableAndType {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Boolean> arrayList2 = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            arrayList1.add(i);
        }

        for(int i = 0; i < arrayList1.size(); i++) {
            if(arrayList1.get(i) < 5) {
                arrayList2.add(true);
            }
            arrayList2.add(false);
        }

        howManyOdds(arrayList1);


    }

    public static int howManyOdds(ArrayList<Integer> list){
        int result = 0;
        for(int num : list) {
            if(num % 2 != 0) {
                result++;
            }
        }
        return result;
    }
}
