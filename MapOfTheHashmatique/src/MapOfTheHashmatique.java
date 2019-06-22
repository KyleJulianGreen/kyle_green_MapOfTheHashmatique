import java.util.HashMap;
import java.util.Map;

public class MapOfTheHashmatique {

    public static void trackList(){
        HashMap<String, String> tracks = new HashMap<>();
        tracks.put("Above The Clouds", " It has come to our attention that a mysterious force is LOOSE.. somewhere in outer space....");
        tracks.put("Exhibit C", " When I was sleepin' on the train, Sleepin' on Meserole Ave out in the rain....");
        tracks.put("Hello It's Me", " Hello, it's me I've thought about us for a long, long time....");
        tracks.put("Brown Sugar", " Let me tell you 'bout this girl, maybe I shouldn't, I met her in Philly and her name was Brown Sugar....");


        String lyrics = tracks.get("Exhibit C");
        System.out.println(lyrics);

        for(Map.Entry<String, String> song : tracks.entrySet()){
            System.out.println(song.getKey() + ":");
            System.out.println(song.getValue());
        }
    }
    public static void main(String[] args) {
        MapOfTheHashmatique.trackList();
    }
}
