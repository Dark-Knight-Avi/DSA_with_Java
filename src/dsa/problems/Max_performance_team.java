package dsa.problems;

import java.util.ArrayList;
import java.util.Collections;

public class Max_performance_team {
    public static int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        ArrayList<Float> pdt = new ArrayList<>();
        for(int i = 0; i < n; i++){
            float eff = efficiency[i];
            float spd = speed[i];
            float p = eff / spd;
            pdt.add(p);
        }
        System.out.println("temp : " + pdt);
        ArrayList<Float> temp = pdt;
        Collections.sort(temp);
        ArrayList<Float> engineer = new ArrayList<>();
        ArrayList<Integer> idx = new ArrayList<>();
        ArrayList<Integer> eff = new ArrayList<>();
        for(int i = 1; i <= k; i++){
            engineer.add(temp.get(n - i));
        }
        System.out.println("engineer : " + engineer);
        for(float e: engineer){
            idx.add(pdt.indexOf(e));
        }
        System.out.println("idx : " + idx);
        int sum_of_speed = 0;
        int min = Integer.MAX_VALUE;
        for(int i: idx){
            sum_of_speed += speed[i];
            min = Math.min(min, efficiency[i]);
        }
        int per = sum_of_speed * min;
        return per;
    }
    public static void main(String[] args) {
        int [] speed = {2, 10, 3, 1, 5, 8};
        int [] eff = {5,4,3,9,7,2};
        System.out.println(maxPerformance(6, speed, eff, 3));
    }
}
