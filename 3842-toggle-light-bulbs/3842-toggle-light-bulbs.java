class Solution {
    public List<Integer> toggleLightBulbs(List<Integer> bulbs) {
        HashSet<Integer> temp = new HashSet<>();

        for (int bulb : bulbs) {
            if (temp.contains(bulb))
                temp.remove(bulb);
            else
                temp.add(bulb);
        }

        return new ArrayList<>(new TreeSet<>(temp));
    }
}