class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int n = heights.length;

        int left = 0;
        int right = n-1;

        int max_area = 0;
        for (int i = 0; i <= n; i++) {
            int currentHeight = (i == n) ? 0 : heights[i];

            while (!stack.isEmpty() && currentHeight < heights[stack.peek()]) {
                int mid = stack.pop();
                int h = heights[mid];
                
               
                int width = stack.isEmpty() ? i : (i - stack.peek() - 1);
                
                max_area = Math.max(max_area, h * width);
            }
            stack.push(i);
        }
        return max_area;
    }
}
