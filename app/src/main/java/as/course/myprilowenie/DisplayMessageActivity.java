package as.course.myprilowenie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_display_message );
        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent ( );
        String message = "Здравствуйте " + intent.getStringExtra ( MainActivity.EXTRA_MESSAGE );
        Toast.makeText ( getApplicationContext ( ) , message , Toast.LENGTH_SHORT ).show ( );


        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById ( R.id.textView );
        textView.setText ( message );

    }
        public void sendMessage ( View view ){
            Intent intent2 = new Intent ( this , DisplayMessageActivity2.class );
            startActivity ( intent2 );
        }
    }
