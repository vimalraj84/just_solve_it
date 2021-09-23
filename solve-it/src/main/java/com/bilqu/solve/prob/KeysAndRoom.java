package com.bilqu.solve.prob;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

// There are n rooms labeled from 0 to n - 1 and all the rooms are locked except for room 0. Your goal is to visit all the rooms.
// However, you cannot enter a locked room without having its key.
//
// When you visit a room, you may find a set of distinct keys in it.
// Each key has a number on it, denoting which room it unlocks, and you can take all of them with you to unlock the other rooms.
//
// Given an array rooms where rooms[i] is the set of keys that you can obtain if you visited room i, return true if you can visit all the rooms, or false otherwise

// Input: rooms = [[1],[2],[3],[]]
// Output: true
// Explanation:
//   We visit room 0 and pick up key 1.
//   We then visit room 1 and pick up key 2.
//   We then visit room 2 and pick up key 3.
//   We then visit room 3.
//   Since we were able to visit every room, we return true.
//
//
//  Input: rooms = [[1,3],[3,0,1],[2],[0]]
//  Output: false
//  Explanation:
//    We can not enter room number 2 since the only key that unlocks it is in that room.

public class KeysAndRoom {

    public static void main(String[] args) {
        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(Arrays.asList(Integer.valueOf(1)));
        rooms.add(Arrays.asList(Integer.valueOf(2)));
        rooms.add(Arrays.asList(Integer.valueOf(3)));
        rooms.add(new ArrayList<>());
        System.out.println(rooms+ " : " + canVisitAllRooms(rooms));
    }
    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {

        boolean[] rooms_visited = new boolean[rooms.size()];

        rooms_visited[0] = true;

        Stack<Integer> keys = new Stack<>();
        keys.push(0);

        while(!keys.isEmpty()){

            int current_key = keys.pop();

            for(int new_key : rooms.get(current_key)){
                if(!rooms_visited[new_key]){
                    rooms_visited[new_key] = true;
                    keys.push(new_key);
                }
            }
        }

        for(boolean isVisited : rooms_visited){
            if(!isVisited)
                return false;
        }

        return true;
    }


}
