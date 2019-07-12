package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;
import java.util.stream.Collectors;

public class Filter {

    List<Integer>  array;

    public Filter(List<Integer> array) {
     this.array = array;
    }

    public List<Integer> filterEven() {
//        List<Integer> result = new ArrayList<>();
//        for(int i = 0; i <array.size();i++){
//            if(array.get(i) % 2 == 0){
//                result.add(array.get(i));
//            }
//        }
        return array.stream().filter(item -> item % 2 == 0 ).collect(Collectors.toList());
    }

    public List<Integer> filterMultipleOfThree() {
        return array.stream().filter(item -> item % 3 == 0 ).collect(Collectors.toList());
    }


    public List<Integer> getDifferentElements() {
        Set<Integer> result = new HashSet<>();
        return array.stream().filter(result::add).collect(Collectors.toList());
//        return array.stream().collect(Collectors.toSet()).stream().collect(Collectors.toList());
    }

    public List<Integer> getCommonElements(List<Integer> firstList, List<Integer> secondList) {
//        List<Integer> result = new ArrayList<>();
//        for(int i = 0; i < firstList.size();i++){
//            for(int j = 0;j < secondList.size();j++){
//                if(firstList.get(i) == secondList.get(j)){
//                    result.add(firstList.get(i));
//                }
//            }
//        }
//
       return firstList.stream().filter(secondList::contains).collect(Collectors.toList());
    }
}