import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();

        int A = 0;
        int B = 0;

        A = a0 > b0 ? 1 : 0;
        A += a1 > b1 ? 1 : 0;
        A += a2 > b2 ? 1 : 0;

        B = a0 < b0 ? 1 : 0;
        B += a1 < b1 ? 1 : 0;
        B += a2 < b2 ? 1 : 0;


        System.out.println(A + " " + B);

    }
}
