package GrokkingAlgo;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;


public class SelectionSort{


    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(5,3,6,2,10));
        System.out.println(selectionSort(array));
    }


    public static int selectSmallest(List<Integer> array){
        int smallestIndex = 0;
        int smallestValue = array.get(0);
        for(int i = 0 ; i < array.size(); i ++){
            if(array.get(i)< smallestValue){
                smallestValue = array.get(i);
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static List<Integer> selectionSort(List<Integer> array){

        List<Integer> newArray = new ArrayList<>(array.size());

        int size = array.size();

        for(int i = 0 ; i < size ; i ++ ){

            int smallest = selectSmallest(array);

            newArray.add(array.get(smallest));

            array.remove(smallest);
        }
        return newArray;


    }
}
