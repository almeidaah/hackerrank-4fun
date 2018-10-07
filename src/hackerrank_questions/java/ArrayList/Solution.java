package hackerrank_questions.java.ArrayList;

import java.util.*;

public class Solution {


    /*public static void main(String... args){
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");

        ArrayList<Integer> integers = new ArrayList<>();

        Integer listLines = scanner.nextInt();

        int i = 0;
        Map<Integer, List<Integer>> map = new HashMap<>();

        while(i <= listLines){
            String line = scanner.nextLine();

            if(!line.isEmpty()){
                String[] s = splitLine(line);
                for (int j = 0; j < s.length; j++){
                    integers.add(Integer.parseInt(s[j]));
                }
                map.put(i, integers);
                integers = new ArrayList<>();
            }
            ++i;
        }

        Integer queryCounter = scanner.nextInt();

        while(i < queryCounter){
            String line = (i == (queryCounter -1)) ? scanner.next() : scanner.next();


            String[] s = splitLine(line);

            if(!line.isEmpty()) {
                ++i;

                Integer sLine = Integer.valueOf(s[0]); // line of map to search
                Integer sColumn = Integer.valueOf(s[1]); // number of column to seach

                List<Integer> recIntegers = map.get(sLine);

                if(sColumn > recIntegers.size()) {
                    System.out.println("ERROR!");
                    continue;
                }

                Integer number = recIntegers.get(sColumn);

                if (Objects.nonNull(number)) {
                    System.out.println(number);
                } else {
                    System.out.println("ERROR!");
                }
            }
        }
    }*/

    private static String[] splitLine(String line) {
        return line.split(" ");
    }

    public static void main(String ... args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d,q,x,y;
        ArrayList[] set = new ArrayList[n];
        for(int i=0;i<n;i++){
            d = in.nextInt();
            set[i] = new ArrayList();
            for(int j=0;j<d;j++){
                set[i].add(in.nextInt());
            }
        }
        q=in.nextInt();
        for(int i=0;i<q;i++){
            x=in.nextInt();
            y=in.nextInt();
            try{
                System.out.println(set[x-1].get(y-1));
            } catch(Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}
