package Task;

import java.util.ArrayList;
import java.util.List;

class Solution8 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if (nums.length == 0) {
            ret.add(new ArrayList<Integer>());
            return ret;
        }

        for (int num : nums) {
            List<Integer> tmp = new ArrayList<Integer>();
            tmp.add(num);
            ret.add(tmp);
        }

        for (int i = 0; i < nums.length - 1; i++) {
            List<List<Integer>> tmpRet = new ArrayList<List<Integer>>();
            for (int num : nums) {
                for (List<Integer> list : ret) {
                    if (list.contains(num)) {
                        continue;
                    }
                    List<Integer> tmp = new ArrayList<Integer>(list);
                    tmp.add(num);
                    tmpRet.add(tmp);
                }
            }
            ret = tmpRet;
        }

        return ret;
    }
};
