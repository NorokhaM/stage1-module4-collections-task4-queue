package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i=1; i<=numberOfDishes; i++) {
            queue.offer(i);
        }
        int size= queue.size();
        List<Integer> result = new ArrayList<>();
        while(result.size() <size) {
            Integer element=0;
            for (int i=0; i<everyDishNumberToEat; i++) {
                element = queue.poll();
                if (i != everyDishNumberToEat-1) {
                    queue.offer(element);
                }
            }
            result.add(element);
        }
        return result;
    }
}
