class Solution {
    public boolean isValid(String s) {
        if(s.length() < 2 || s.length() % 2 != 0){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char cur = s.charAt(i);
            if(cur == '(' || cur == '{' ||cur == '['){
                stack.push(cur);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    char c = stack.pop();
                    if(cur == ')' && c != '('){
                        return false;
                    }
                    else if(cur == '}' && c != '{'){
                        return false;
                    }
                    else if(cur == ']' && c != '['){
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
