package lessons;

import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args){
        int[] input = {1, 3, 4, 2, 5, 3, 2, 10, 5, 11};
        findNextGreaterElementFor(input);
    }
    private static void findNextGreaterElementFor(int[] input){
        int nextGreaterElement;
        for(int i = 0; i < input.length; i++){
            nextGreaterElement = -1;
            for(int j = i+1; i < input.length; j++){
                if(input[i] < input[j]){
                    nextGreaterElement = input[j];
                    break;
                }
            }
            System.out.printf("For %s next greater is %s \n", input[i], nextGreaterElement);
        }
    }
    private static void findNextGreaterElementStack(int[] input){
        Stack<Integer> stack = new Stack<>();
        stack.push(input[0]);
        int next, pooped;
        for(int i = 1; i < input.length; i++){
            next = input[i];
            if(!stack.isEmpty()){
                pooped = stack.pop();
                while(pooped < next){
                    System.out.printf("For %s next greater is %s \n", pooped, next);
                    if(stack.isEmpty()) break;
                    pooped = stack.pop();
                }
                if(pooped < next)stack.push(pooped);
            }
            stack.push(next);
        }
        while(!stack.isEmpty()){
            System.out.printf("For %s next greater is %s \n", stack.pop(), -1);
        }
    }
}
