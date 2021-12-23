package as.course.myprilowenie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.audiofx.AudioEffect;
import android.os.Bundle;
import android.widget.ArrayAdapter;
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

        ListView listView = findViewById(R.id.games_list_view);
        ArrayList<String> gamesList = //gameXMLParser( вызвать метод getGameList xml парсер, который возвращает названия игр)
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, catNames);




        listView.setAdapter(adapter);





    }
}