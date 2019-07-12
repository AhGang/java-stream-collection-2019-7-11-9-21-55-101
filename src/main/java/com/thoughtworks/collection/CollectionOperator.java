package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectionOperator {
    public List<Integer>  buildList(int left, int right){
        if(left > right ){
            return Stream.iterate(left, n -> n - 1).limit(left).collect(Collectors.toList());
        }else{
            return Stream.iterate(left, n -> n + 1).limit(right).collect(Collectors.toList());
        }

    }
    public List<Integer> getListByInterval(int left, int right) {
        return buildList(left,right);
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        return buildList(left,right).stream().filter(item -> item % 2 == 0 ).collect(Collectors.toList());
    }

    public List<Integer> popEvenElments(int[] array) {
        return IntStream.of(array).boxed().filter(i -> i % 2 == 0).collect(Collectors.toList());
    }

    public int popLastElment(int[] array) {
        return array[array.length-1];

    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
