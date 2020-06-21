package ProductSum;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ProductSumBasicApproach {
   static int countDepth =1;
    public static void main(String[] args) {

        List<Object> arrayList = new ArrayList<Object>();
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add("[7");
        arrayList.add("-1]");
        arrayList.add(3);
        arrayList.add("[6");
        arrayList.add("[-13");
        arrayList.add("8]");
        arrayList.add("4]]");
        System.out.println(productSum(arrayList, arrayList.size()));
    }

    public static int productSum(List<Object> array, int len) {
        Stack<Object> stack = new Stack<Object>();
        for (int loop = 0; loop < len; loop++) {
            if (array.get(loop) instanceof String) {
                if (array.get(loop).toString().contains("[")) {
                    countDepth++;
                    stack.push(countDepth);
                    stack.push(Integer.valueOf(array.get(loop).toString().replace("[", "")));
                }
                if (array.get(loop).toString().contains("]")) {
                    countDepth--;
                    stack.push(countDepth);
                    stack.push(Integer.valueOf(array.get(loop).toString().replace("[", "")));
                    
                    stack.pop();
                }

            } else {
                stack.push(array.get(loop));
            }
        }
        return -1;
    }
}