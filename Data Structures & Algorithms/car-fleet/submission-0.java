class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
      int n = position.length;

      int[][] ps = new int[n][2];
      for(int i=0; i<n; i++){
        ps[i][0] = position[i];
        ps[i][1] = speed[i];
      }

      Arrays.sort(ps, (row1,row2) -> Integer.compare(row2[0], row1[0]));

      double[] time = new double[n];
      for(int i=0; i<n; i++){
        time[i] = (double)(target-ps[i][0])/ps[i][1];
      }

      Stack<Integer> stack = new Stack<>();
      int car_fleets = 0;

      for(int i=0; i<n; i++){
        if(!stack.isEmpty() && time[i]<=time[stack.peek()]){
            continue;
        }
        else{
            stack.push(i);
            car_fleets += 1;
        }
      }
      return car_fleets;
    }
}
