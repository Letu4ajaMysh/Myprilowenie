package as.course.myprilowenie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.audiofx.AudioEffect;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.xmlpull.v1.XmlPullParser;

import java.util.ArrayList;
import java.util.jar.Attributes;

public class DisplayMessageActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_display_message2 );

//        ListView listView = findViewById(R.id.games_list_view);
//        ArrayList<String> = GameXMLParser;
//      ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
//               android.R.layout.simple_list_item_1, gameName);


//        listView.setAdapter(adapter);


        XmlPullParser xpp = getResources ().getXml ( R.xml.games );
        GameXMLParser fxp = new GameXMLParser ( xpp );
        ArrayList<Game> foodsItem = fxp.getGamesList ();

        ListView gamesListView = findViewById(R.id.games_list_view);
        GamesAdapter gameListAdapter = new GamesAdapter(this, R.layout.games_list_item, foodsItem);
        gamesListView.setAdapter(gameListAdapter);





//        String imgName = "h" + currentId;
//        int resourceId = this.getResources().getIdentifier(imgName, "drawable", this.getPackageName());
//        ImageView gameImage = (ImageView) findViewById(R.id.gameimage);
//        gameImage.setImageResource(resourceId);


    }
}