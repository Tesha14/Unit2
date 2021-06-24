package cosmodrome;
public class Main {
    public static void main(String[] args){
        Cosmodrome cosmodrome = new Cosmodrome();
        Shuttle shuttle = new Shuttle();
        SpaceX spaceX = new SpaceX();
        cosmodrome.launch(shuttle);
        cosmodrome.launch(spaceX);
    }
}
