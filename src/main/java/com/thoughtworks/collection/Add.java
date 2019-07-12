package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Add {
    public List<Integer>  buildList(int leftBorder, int rightBorder){
        int start = leftBorder < rightBorder ? leftBorder : rightBorder;
        int end =  leftBorder > rightBorder ? leftBorder: rightBorder;
        return Stream.iterate(start, n -> n + 1).limit(end).collect(Collectors.toList());
    }
    public int getSumOfEvens(int leftBorder, int rightBorder) {

        List<Integer> arrayList = buildList(leftBorder,rightBorder);
        arrayList = arrayList.stream().filter(item -> item % 2 == 0 ).collect(Collectors.toList());
        return arrayList.stream().reduce((a,b) -> a + b).get();

    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        throw new NotImplementedException();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        return  arrayList.stream().mapToInt(number -> number * 3 + 2).sum();
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().map(item ->(item % 2 == 1 ?  item * 3 + 2: item)).collect(Collectors.toList());
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

//    public double getMedianOfEven(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

    public double getAverageOfEven(List<Integer> arrayList) {
        arrayList = arrayList.stream().filter(item -> item % 2 == 0 ).collect(Collectors.toList());
        return  arrayList.stream().collect(Collectors.averagingInt(item -> item));
        // return arrayList.stream().mapToInt(i -> i).average();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        arrayList = arrayList.stream().filter(item -> item % 2 == 0 ).collect(Collectors.toList());
        Set<Integer> result = new HashSet<>();
        return arrayList.stream().filter(result::add).collect(Collectors.toList());
    }

//    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

//    public List<Integer> getProcessedList(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }
}
