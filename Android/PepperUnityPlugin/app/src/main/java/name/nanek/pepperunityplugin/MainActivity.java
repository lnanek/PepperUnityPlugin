package name.nanek.pepperunityplugin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import name.nanek.pepperandroidlibrary.RobotHelper;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "SayActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RobotHelper.say(this);
    }

}
