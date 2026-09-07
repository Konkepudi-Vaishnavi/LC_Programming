class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        Set<Integer> frs = new HashSet<>();
        for(int fs: friends){
            frs.add(fs);
        }
        int[] nar = new int[friends.length];
        int ind = 0;

        for(int id: order){
            if(frs.contains(id)){
                nar[ind++]=id;
            }
        }
        return nar;
    }
}