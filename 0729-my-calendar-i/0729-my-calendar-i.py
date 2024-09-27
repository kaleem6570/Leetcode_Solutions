class MyCalendar {
 private TreeMap<Integer, Integer> booking;
    public MyCalendar() {
       booking = new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        Integer floorKey = booking.floorKey(start);
        if(floorKey!=null&&booking.get(floorKey)>start)return false;
        Integer  ceilingKey = booking.ceilingKey(start);
        if(ceilingKey!=null&&ceilingKey<end)return false;
        booking.put(start,end);
        return true;
    }
}
# Your MyCalendar object will be instantiated and called as such:
# obj = MyCalendar()
# param_1 = obj.book(start,end)
