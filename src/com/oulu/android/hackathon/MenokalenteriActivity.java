package com.oulu.android.hackathon;

import com.oulu.android.hackathon.about.AboutDialog;
import com.oulu.android.hackathon.settings.MainPreferenceActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MenokalenteriActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    /**
     * Creates content to the menu, which appears when you press the physical menu button.
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	MenuInflater inflater = getMenuInflater();
    	inflater.inflate(R.menu.menu, menu);
    	return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	
    	switch (item.getItemId()) {
		case R.id.settings:
			startActivity(new Intent(this, MainPreferenceActivity.class));
			break;
		case R.id.about:
			startActivity(new Intent(this, AboutDialog.class));
			break;

		default:
			break;
		}
    	return super.onOptionsItemSelected(item);
    }
}