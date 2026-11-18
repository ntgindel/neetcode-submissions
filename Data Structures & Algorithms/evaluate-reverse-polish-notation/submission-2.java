class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for(String s : tokens){
            if(s.equals("+")){
                int num1 = Integer.parseInt(stack.pop());
                int num2 = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(num1 + num2));
            }
            else if(s.equals("-")){
                int num1 = Integer.parseInt(stack.pop());
                int num2 = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(num2 - num1));
            }
            else if(s.equals("*")){
                int num1 = Integer.parseInt(stack.pop());
                int num2 = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(num1 * num2));
            }
            else if(s.equals("/")){
                int num1 = Integer.parseInt(stack.pop());
                int num2 = Integer.parseInt(stack.pop());
                stack.push(Integer.toString(num2 / num1));
            }
            else{
                stack.push(s);
            }
        }
        return Integer.parseInt(stack.pop());
        
    }
}
