package time_measure_collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author hau
 */
public class Benchmark_Collections
{

    public static void main(String[] args)
    {
        //== create and fill lists  ===============================================
        
        int n = 1_000_000;          // "problem size"  (best 10E5 -10E7)

        ArrayList<Integer> arrayList = new ArrayList();
        for (int i = 0; i < n; i++)
            arrayList.add(i);
        
        LinkedList<Integer> linkedList = new LinkedList();
        for (int i = 0; i < n; i++)
        {
            linkedList.add(i);
        }
        
        HashMap<Integer, Integer> hashMap = new HashMap(n);
        for (int i = 0; i < n; i++)
        {
            hashMap.put(i, i);
        }
        
        
        //== measure execution time  ==============================================
        
        long startTime;

        //== ArrayList ==
        
        startTime = System.nanoTime();        
        arrayList.add(0, 1);
        long A_first =  System.nanoTime() - startTime;

        startTime = System.nanoTime();       
        arrayList.add(n/2, 1);
        long A_mid = System.nanoTime() - startTime;

        startTime = System.nanoTime();       
        arrayList.add(n-1, 1);
        long A_last = System.nanoTime() - startTime;
        
        
        //== LinkedList ==
        
        startTime = System.nanoTime();       
        linkedList.add(0, 1);
        long L_first = System.nanoTime() - startTime;

        startTime = System.nanoTime();    
        linkedList.add(n/2, 1);
        long L_mid = System.nanoTime() - startTime; 

        startTime = System.nanoTime();
        linkedList.add(n-1, 1);
        long L_last = System.nanoTime() - startTime;
        
        //== HashMap ==
        
        startTime = System.nanoTime();
        hashMap.put(0, 1);
        long H_first = System.nanoTime() - startTime;

        startTime = System.nanoTime();  
        hashMap.put(n/2, 1);
        long H_mid = System.nanoTime() - startTime; 

        startTime = System.nanoTime();
        hashMap.put(n-1, 1);
        long H_last = System.nanoTime() - startTime; 
        
        
        //== report results  ==========================================

        System.out.println("Execution time (micro sec): ");
        System.out.println("A start: " + A_first/1000);
        System.out.println("A mid  : " + A_mid/1000);
        System.out.println("A last : " + A_last/1000);
        System.out.println("");
        
        System.out.println("L start: " + L_first/1000);
        System.out.println("L mid  : " + L_mid/1000);
        System.out.println("L last : " + L_last/1000);
        System.out.println("");
        
        System.out.println("H start: " + H_first/1000);
        System.out.println("H mid  : " + H_mid/1000);
        System.out.println("H last : " + H_last/1000);

    }

}
