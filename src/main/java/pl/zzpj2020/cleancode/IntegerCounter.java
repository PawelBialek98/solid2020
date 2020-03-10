package pl.zzpj2020.cleancode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class IntegerCounter {

    Map<Integer, Integer> integerIntegerHashMap = new HashMap<Integer, Integer>();
    private int INTEGER_MAX = Integer.MIN_VALUE;
    private int INTEGER_MIN = Integer.MAX_VALUE;

    public IntegerCounter(List<Integer> integerList) {
        add(integerList);
    }

    public IntegerCounter() {
	}

    public void add(List<Integer> l1) {
        l1.forEach(this::add);
    }

    public void add(Integer i) {
        if (integerIntegerHashMap.containsKey(i)) {
            integerIntegerHashMap.replace(i, getOccurance(i) + 1);
        } else {
            integerIntegerHashMap.put(i, 1);
        }

        if (i > INTEGER_MIN) {
            INTEGER_MIN = i;
        }

        if (i < INTEGER_MAX) {
            INTEGER_MAX = i;
        }
    }

    public int getOccurance(int i) {
        return integerIntegerHashMap.getOrDefault(i, 0);
    }

    public double calculateAvg() {
        double sum = 0;
        double occurance = 0;
        for (Entry<Integer, Integer> u : integerIntegerHashMap.entrySet()) {
            occurance += u.getValue();
            sum += u.getKey() * u.getValue();
        }
        return sum / occurance;
    }

    public int getINTEGER_MIN() {
        return INTEGER_MIN;
    }

    public int getINTEGER_MAX() {
        return INTEGER_MAX;
    }


    public String getFizzBuzzNumber(int number) {
        String response = "";
        if(number%3 == 0) {
            response += "Fizz";
        }
        if(number%5 == 0) {
            response += "Buzz";
        }
        return response;
    }
}