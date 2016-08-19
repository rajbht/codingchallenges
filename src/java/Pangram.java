package java;

import java.io.*;
import java.util.HashSet;

import java.util.Set;

public class Pangram {

    public static void main(String args[]) {
        try {
            FileInputStream in = new FileInputStream("/Users/rajesh.bhatnagar/IdeaProjects/CodingChallenge/src/pangram.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            String line = null;
            while((line = br.readLine()) != null) {
                String input = line.toLowerCase().replaceAll(" ", "");
                char[] chars = input.toCharArray();
                Set<Character> set = new HashSet<Character>();

                for (char c : chars) {
                    set.add(c);
                }

                System.out.println(set);
                System.out.println(set.size());
                if (set.size() == 26) {
                    System.out.println("pangram");
                } else {
                    System.out.println("not pangram");
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}