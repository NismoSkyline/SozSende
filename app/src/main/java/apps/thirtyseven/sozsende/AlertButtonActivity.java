package apps.thirtyseven.sozsende;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.media.MediaPlayer;

public class AlertButtonActivity extends AppCompatActivity {
    ImageButton button;
    MediaPlayer mp;
    boolean isPressed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_button);
        button = (ImageButton) findViewById(R.id.alarmButton);
        mp = MediaPlayer.create(this, R.raw.inquisitiveness);

    }

    public void alarmButton(View v) {
        if (isPressed) {
            mp.start();
            button.setImageResource(R.drawable.redbutton1);
        } else {
            button.setImageResource(R.drawable.redbutton2);
            mp.start();
            button.setClickable(false);

        }
        isPressed = !isPressed;
    }
}

