/*
 * Problem Statement
Given an array of n pairs of integers. Your task is to sort the array on the basis of the first element of pairs in descending order. If the first element is equal in two or more pairs then give preference to the pair that has a greater second element value.
Input
User Task:
Since this will be a functional problem, you don't have to take input. You just have to complete the function SortPair() that takes the array of pairs and the integer N(size of the array) as a parameter.

Custom Input
The first line of input will be a single integer N. The next line of input contains 2*N space-separated integers where unique adjacent elements are pairs. Custom input for 1st sample:-
4
1 2 3 4 5 6 7 8

Constraints:-
1<=N<=103
1<=value<=105
Output
Return the sorted array of pairs.
 */

 /*class Pair { 
    int x; 
    int y; 
  
    // Constructor 
public Pair(int x, int y) 
    { 
        this.x = x; 
        this.y = y; 
    } 
} 
*/


static Pair[] SortPair(Pair arr[], int n)  { 

    Arrays.sort(arr, new Comparator<Pair>() {
               @Override public int compare(Pair p1, Pair p2)
               {
                   if(p1.x==p2.x) {
                       return p2.y - p1.y; // To compare the first element just
                                       //change the variable from p1.y - p2.y to x.
                   }
                   return p2.x - p1.x;
               }    
           });
           return arr;
       }