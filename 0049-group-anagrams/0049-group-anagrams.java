class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list=new ArrayList<>();
        HashMap<String,List<Integer>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String s = strs[i];
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);
            List<Integer> indices = map.getOrDefault(sorted, new ArrayList<>());
            indices.add(i);
            map.put(sorted, indices);
        }
        for (List<Integer> indices : map.values()) {
            List<String> temp = new ArrayList<>();

            for (int index : indices) {
                temp.add(strs[index]);
            }
            list.add(temp);
        }
        return list;
    }
}