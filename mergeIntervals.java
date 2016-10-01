// java.util.* has been imported for this problem.
// You don't need any other imports.
/*A Range Module is a module that tracks ranges of numbers. Range modules are used 
extensively when designing scalable online game maps with millions of players. 
Your task is to write a method - mergeIntervals that takes in an ArrayList of integer Interval s (aka ranges),
and returns an ArrayList of sorted Interval s where all overlapping intervals have been merged.*/



public static ArrayList<Interval> mergeIntervals(ArrayList<Interval> intervalsList) {
    //Making there are at least 2 intervals of intervals 
    if(intervalsList == null || intervalsList.size() < 2){
        return intervalsList; //return the same thing if there is only 1 interval / nothing
    }
    
    //Create new ArrayList to store merged intervalsList
    ArrayList<Interval> mergedList = new ArrayList<>();
    
    //Sort the intervals based on their start time
    Collections.sort(intervalsList, new Comparator<Interval>() {
        @Override
        public int compare(Interval o1, Interval o2) {
            return Integer.compare(o1.start, o2.start);
        }
    });
        
    
    //Variable to store the first out of the two intervals being merged
    Interval prev = intervalsList.get(0);
    //Iterate through other intervals merging the two intervals if the start of the second interval <=
    //the end of the first interval.
    for(int i=1; i< intervalsList.size(); i++){
        
        Interval cur = intervalsList.get(i);
        if(cur.start <= prev.end){//If intervals overlap 
           prev = new Interval(prev.start, Math.max(cur.end,prev.end));
        }
        else{
            mergedList.add(prev);
            prev = cur;
        }
    }
    
    mergedList.add(prev);//Add the last interval
    return mergedList;
    
}