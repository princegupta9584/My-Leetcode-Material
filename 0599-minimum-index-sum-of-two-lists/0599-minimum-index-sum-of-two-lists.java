class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
                if(list1[i].equals(list2[j])){
                    map.put(list1[i],i+j);
                }
            }
        }
        int minimum = Integer.MAX_VALUE;
        for (int value : map.values()) {
            if(minimum > value){
                minimum = value;
            }
        }

        ArrayList<String> list = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue()==minimum){
                list.add(entry.getKey());
            }
        }
        return list.toArray(new String[0]);
    }
}