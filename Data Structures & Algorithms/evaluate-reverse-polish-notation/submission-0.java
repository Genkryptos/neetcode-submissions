class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length == 0)
            return 0;            
        Deque<Integer> stack = new ArrayDeque<>();
        for(String s : tokens){
            if(s.equals("+")){
                 int num1  =  stack.pop();
                 int num2 = stack.pop();        
                 stack.push(num2+num1);
            }else if(s.equals("-")){
                 int num1  =  stack.pop();
                 int num2 = stack.pop();        
                 stack.push(num2-num1);
            }
            else if(s.equals("*")){
                 int num1  =  stack.pop();
                 int num2 = stack.pop();        
                 stack.push(num2*num1);
            }
            else if(s.equals("/")){
                 int num1  =  stack.pop();
                 int num2 = stack.pop();        
                 stack.push(num2/num1);
            }else{
                  stack.push(Integer.parseInt(s));   
            }
            
        }
        return stack.pop();
    }
}