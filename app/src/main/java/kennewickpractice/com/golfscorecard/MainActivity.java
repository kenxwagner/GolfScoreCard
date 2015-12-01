package kennewickpractice.com.golfscorecard;

import android.app.ListActivity;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends ListActivity {
    private static final String PREFS_FILE = "kennewickpractice.com.golfscorecard.preferences";
    private static final int KEY_STROKECOUNT = ;
    private SharedPreferences mSharedPreferences;
    private SharedPreferences.Editor mEditor;
    private Hole[] mHoles = new Hole[18];
    private ListAdapter mListAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSharedPreferences = getSharedPreferences(PREFS_FILE, Context.MODE_PRIVATE);
        mEditor = mSharedPreferences.edit();

        //Initialize holes
        int strokes = 0;
        for (int i = 0; i < mHoles.length; i++) {
            mHoles[i] = new Hole("Hole" + (i + 1) + " :", strokes);
        }

        mListAdapter = new ListAdapter(this, mHoles);
        setListAdapter(mListAdapter);
    }

    @Override
    protected void onPause() {
        super.onPause();

        for (int i = 0; i < mHoles.length; i++) {
            mEditor.putInt(KEY_STROKECOUNT + i, mHoles[i].getStrokeCount());

        }
        mEditor.apply();
    }
}
