package HippocampusChess;

public class Pair {
    public int first;
    public int second;
    public void equalise(Pair b){
        this.first = b.first;
        this.second = b.second;
    }
    public boolean equals(Pair b){
        return this.first == b.first && this.second == b.second;
    }
    public boolean between (Pair a, Pair b){
        return this.first > a.first && this.first < b.first
                && this.second > a.second && this.second < b.second;
    }
}
