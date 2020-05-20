class StockSpanner {
    List<Integer> prices;
    List<Integer> spans;
    public StockSpanner() {
        prices=new ArrayList<>();
        spans=new ArrayList<>();
    }
    
    public int next(int price) {
        int c=1;
        int i=prices.size()-1;
        while(i>=0 && prices.get(i)<=price){
            c+=spans.get(i);
            i-=spans.get(i);
        }
        prices.add(price);
        spans.add(c);
        return c;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */