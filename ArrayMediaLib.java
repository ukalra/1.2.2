public class ArrayMediaLib extends MediaLib
public class ArrayMediaLib extends MediaLib
{    
    public static void main()
    {
       Song[] topTenSongs = { new Song("The Twist"),
           new Song("Smooth"),
           new Song("Mack the Knife"),
           new Song("How Do I Live"),
           new Song("Party Rock Anthem"),
           new Song("I Gotta Feeling"),
           new Song("Macarena"),
           new Song("Physical"),
           new Song("You Light Up My Life"),
           new Song("Hey Jude"),};                  
       for(Song changeSong: topTenSongs)
       {
          changeSong.setPrice(1.29);
       }      
       for (int i = 0; i <= topTenSongs.length- 1; i++) {
           if ((i+1)%3 == 0)
           {
               topTenSongs[i].setPrice(.99);
           }
       }   
       for(Song s: topTenSongs)
       {
           System.out.println(s.getTitle());
           System.out.println(s.getPrice());
       }
    }
}