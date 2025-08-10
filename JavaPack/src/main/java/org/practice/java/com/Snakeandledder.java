package org.practice.java.com;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Snakeandledder {

    public String perform(int n, List<List<Integer>> pos, List<Integer> rolles, int target){
        List<Integer> posList = dissolveList(pos);
        boolean flag = false;
        String result = "Not affected";
        Integer sum = 1;
        for(Integer r: rolles){
            sum += r;
            if(posList.contains(sum)){
                List<String> sumOutput = caughtSnakeorLedder(sum, pos);
                if(sumOutput.contains("-1")){
                    result = sumOutput.get(2) + " " + sumOutput.get(0);
                }
            }
        }
        if(target == sum){
            return result;
        }
        return "Not reachable";

    }

    private List<Integer> dissolveList(List<List<Integer>> pos) {
        List<Integer> flatList = new ArrayList<>();
        for (List<Integer> sublist : pos) {
            flatList.addAll(sublist);
        }
        return flatList;
    }

    private List<String> caughtSnakeorLedder(Integer sum, List<List<Integer>> pos) {
        for(List<Integer> position : pos){
            if(position.contains(sum)){
                return position.get(0) == sum ? List.of(String.valueOf(position.get(1)), "0") :
                        List.of(String.valueOf(position.get(0)), "-1", String.valueOf(position.get(1))) ;
            }
        }
        return List.of("");
    }
}
