/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package time_measure_collections;

import java.util.ArrayList;

/**
 *
 * @author Henrik
 */
public class Benchmark_sort
{
    public static void main(String[] args)
    {
        int n = 1_000_000;          // "problem size"  (best 10E5 -10E7)

        ArrayList<Integer> arrayList = new ArrayList();
        for (int i = 0; i < n; i++)
            arrayList.add(i);
        
    }
}
