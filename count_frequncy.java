import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed

public class Main{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
    
        ArrayList<Integer> unique = new ArrayList<Integer>();
  
        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();
    
        for(int i=0; i<n; i++){
            if(!unique.contains(arr[i])){
                unique.add(arr[i]);
                freq.put(arr[i], 1);
            } else {
                freq.put(arr[i], freq.get(arr[i])+1);
            }
        }
        for(int i=0; i<unique.size(); i++){
            System.out.println(unique.get(i) + " " + freq.get(unique.get(i)));
        }
    }

}