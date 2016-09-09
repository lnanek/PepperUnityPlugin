package name.nanek.pepperunityplugin;

import android.content.Context;
import android.util.Log;

import com.aldebaran.qi.QiCallback;
import com.aldebaran.qi.sdk.Qi;
import com.aldebaran.qi.sdk.object.interaction.Say;

/**
 * Created by Lance on 9/9/16.
 */
public class RobotHelper {

    private static final String TAG = RobotHelper.class.getSimpleName();

    public static void say(final Context context) {
        say(context, "Hello, Unity Args!");
    }

    public static void say(final Context context, final String text) {
        Say say = new Say(context);
        say.run(text).then(Qi.onUiThread(new QiCallback<Void>() {
            @Override
            public void onResult(Void ignore) {
                Log.d(TAG, "result on thread " + Thread.currentThread().getName());
            }

            @Override
            public void onError(Throwable error) {
                Log.e(TAG, "error", error);
            }

            @Override
            public void onCancel() {
                Log.w(TAG, "cancel");
            }
        }));
    }

}
