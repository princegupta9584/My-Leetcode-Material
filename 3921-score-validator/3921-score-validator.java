class Solution {
    public int[] scoreValidator(String[] events) {
        int score = 0;
        int counter = 0;
        for(int i=0; i<events.length; i++){
            if(counter == 10) break;
            String s = events[i];

            if(s.equals("W")){
                counter++;
            }
            else if(s.equals("WD") || s.equals("NB")){
                score++;
            }
            else{
                score += Integer.parseInt(s);
            }
        }
        return new int[]{score, counter};
    }
}