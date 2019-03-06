package z1835941.niu.portfolio7;

import android.app.Activity;
import android.media.Image;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends Activity {

    private LinearLayout gallery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gallery = findViewById(R.id.characterLayout);
        fillGallery();
    }//end onCreate

    private void fillGallery() {
        ImageButton characterIB;
        for (int i = 0 ; i < CharacterInfo.description.length ; i++) {
            //create image button
            characterIB = new ImageButton(this);

            Character character = new Character(CharacterInfo.description[i], CharacterInfo.id[i]);

            //place info on image button
            characterIB.setContentDescription(character.getCharacterDescription());

            characterIB.setImageDrawable(ResourcesCompat.getDrawable(getResources(), character.getCharacterID(), null));

            //handle button click
            characterIB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String descrip = (String)v.getContentDescription();
                    Toast.makeText(getApplicationContext(), descrip, Toast.LENGTH_LONG).show();
                }
            });

            gallery.addView(characterIB);

        }
    }//end fillGallery
}//endClass
