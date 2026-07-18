class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        HashSet<Integer> set = new HashSet<>();

        for (int bulb : bulbs) {
            if (set.contains(bulb)) {
                set.remove(bulb);
            } else {
                set.add(bulb);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>(set);
        Collections.sort(ans);

        return ans;
    }
}