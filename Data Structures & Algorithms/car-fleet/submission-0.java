class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int count = 0;
        int[][] sorted = new int[position.length][2];

        for(int i = 0; i < position.length; i++){
            sorted[i][0] = position[i];
            sorted[i][1] = speed[i];
        }

        Arrays.sort(sorted, (a, b) -> Integer.compare(b[0], a[0]));
        Stack<Double> stack = new Stack<>();
        for(int[] p : sorted){
            double t = (double) (target - p[0]) / (p[1]);
            stack.push(t);

            if(stack.size() >= 2 && stack.peek() <= stack.get(stack.size() -2)){
                stack.pop();
            }
        }
        return stack.size();
    }
}
