/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String_Comparison;

/**
 *
 * @author brend
 */
public class StringComparison {
    public static int difference(String FirstWord, String SecondWord) {
        //put words into same case
        FirstWord = FirstWord.toLowerCase();
        SecondWord = SecondWord.toLowerCase();
        int [] costs = new int [SecondWord.length() + 1];
        for (int j = 0; j < costs.length; j++)
            costs[j] = j;
        for (int i = 1; i <= FirstWord.length(); i++) {
            costs[0] = i;
            int nw = i - 1;
            for (int j = 1; j <= SecondWord.length(); j++) {
                int cj = Math.min(1 + Math.min(costs[j], costs[j - 1]), FirstWord.charAt(i - 1) == SecondWord.charAt(j - 1) ? nw : nw + 1);
                nw = costs[j];
                costs[j] = cj;
            }
        }
        return costs[SecondWord.length()];
    }
 
    public static void main(String [] args) {
        //Set Words, compare their length and calculate difference
        String FWord = "First Word";
        String SWord = "Second Word";
        String [] data = { FWord, SWord};
        for (int i = 0; i < data.length; i += 2)
            System.out.println("difference between " + data[i] + ", " + data[i+1] + " = " + difference(data[i], data[i+1]));
    }
}
