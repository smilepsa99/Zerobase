package week_04.pre_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class _2_1 {
}


// 1
//import java.util.Arrays;
class Solution_2_1_1 {
    public int solution(int[] arr) {
        Arrays.sort(arr);
        int answer = 0;
        for (int i = arr.length - 1; i >= 2 ; i--) {
            if (arr[i] < arr[i-1] + arr[i-2]) {
                answer = arr[i] + arr[i-1] + arr[i-2];
                break;
            }
        }
        return answer;
    }
}

// 2
// import java.util.Arrays;
class Solution_2_1_2 {
    public int solution(int[] arr) {
        Arrays.sort(arr);
        arr[0] = 0;
        arr[arr.length-1] = 0;
        int sum = 0;
        for (int n : arr) {
            sum += n;
        }
        int answer = sum / (arr.length-2);
        return answer;
    }
}

// 3
// import java.util.HashMap;
// import java.util.ArrayList;
class Solution_2_1_3 {
    public boolean solution(String p, String s) {
        String[] arrP = p.split("");
        String[] arrS = s.split(" ");
        HashMap<String, String> map = new HashMap<>();

        if (arrP.length != arrS.length) {
            return false;
        }

        for (int i = 0; i < arrP.length; i++) {
            if (map.containsKey(arrP[i])) {
                if (!arrS[i].equals(map.get(arrP[i]))) {
                    return false;
                }
            } else {
                map.put(arrP[i], arrS[i]);
            }
        }

        ArrayList<String> keys = new ArrayList<>(map.keySet());
        for (int i = 0; i < keys.size() - 1; i++) {
            String key1 = map.get(keys.get(i));
            String key2 = map.get(keys.get(i+1));
            if (key1.equals(key2)) {
                return false;
            }
        }

        boolean answer = true;
        for (String str : arrS) {
            if (!map.containsValue(str)) {
                answer = false;
            }
        }
        return answer;
    }
}

// 4
// import java.util.Arrays;
// import java.util.HashSet;
class Solution_2_1_4 {
    public int solution(String s) {
        String[] parts = s.split(" ");
        HashSet<String> set = new HashSet<>(Arrays.asList(parts));
        int answer = set.size();
        return answer;
    }
}

// 5
// import java.util.HashSet;
// import java.util.Arrays;
class Solution_2_1_5 {
    public int[] solution(int[] arr1, int[] arr2) {
        Integer[] temp1 = Arrays.stream(arr1).boxed().toArray(Integer[]::new);
        Integer[] temp2 = Arrays.stream(arr2).boxed().toArray(Integer[]::new);
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(temp1));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(temp2));
        set1.retainAll(set2);

        int[] answer = new int[set1.size()];
        int index = 0;
        for (int n : set1) {
            answer[index++] = n;
        }
        Arrays.sort(answer);
        return answer;
    }
}