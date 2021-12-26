package as.course.myprilowenie;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import org.xmlpull.v1.XmlPullParser;

import java.util.List;
import java.util.Locale;

public class GamesAdapter extends ArrayAdapter <Game> {
        private LayoutInflater inflater;
        private int layout;
        private List<Game> games;

        public GamesAdapter (@NonNull Context context,
                            int resource,
                            @NonNull List<Game> objects) {
            super(context, resource, objects);
            this.games = objects;
            this.layout = resource;
            this.inflater = LayoutInflater.from(context);
        }

        public View getView( int position, View convertView, ViewGroup parent) {
            View view=inflater.inflate(this.layout, parent, false);

            TextView gameNameView = view.findViewById(R.id.gameName);
            ImageView izoView = view.findViewById(R.id.izo);

            Game game = games.get(position);

            gameNameView.setText(game.getName());

            String imageName = "h"+ game.getId ();

            int res = this.getResources().getIdentifier(xpp.getAttributeValue(0).toLowerCase( Locale.ROOT ), "drawable", this.getPackageName())


//            String imgName = "h" + game.getId ();
//            int resourceId = this.getResources().getIdentifier(imgName, "drawable", this.getPackageName());
//            ImageView gameImage = (ImageView) izoView.findViewById ( resourceId);
//            gameImage.setImageResource(resourceId);






            izoView.setImageResource(game.getIzoResource ());

            return view;
        }
    }