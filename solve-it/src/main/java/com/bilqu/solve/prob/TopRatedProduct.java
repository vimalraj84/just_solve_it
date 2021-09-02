package com.bilqu.solve.prob;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TopRatedProduct {

    public static void main(String[] args) {
        List<String> productList = Arrays.asList(new String[]{"12345","746823","12345","746823","93722","12397"});

        findTopSku(productList,2).stream().forEach(System.out::println);

    }

    private static List<String> findTopSku(List<String> productList, int k){

        Map<String,Long> productGroup = productList.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(productGroup);

        Map<String,Long> productSorted = productGroup.entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue().reversed()).collect(
                Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(oldValue,newValue) -> oldValue, LinkedHashMap::new));
        System.out.println(productSorted);

        List<String> result = new ArrayList<>();

        for(Map.Entry<String,Long> e : productSorted.entrySet()){
            result.add(e.getKey());

            if(result.size() == 2){
                break;
            }
        }

        return result;

    }

}
