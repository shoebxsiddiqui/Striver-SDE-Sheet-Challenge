class Solution {
    public List<List<Integer>> generate(int a) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        for(int i=0; i<a; i++) {
            List<Integer> row = new ArrayList<>();
            for(int j=0; j<=i; j++) { 
                if(j == 0 || j == i)
                    row.add(1);    
                else
                    row.add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
            }
            ans.add(row);
        }
        return ans;
    }
}