package com.oulu.android.hackathon;

import android.app.Dialog;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import com.oulu.android.hackathon.settings.MainPreferenceActivity;

public class MenokalenteriActivity extends ListActivity implements OnItemClickListener {
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("DEBUG", "Here");
        setContentView(R.layout.main);
        Log.v("DEBUG", "Heasd");
        
        // FIXME: Debug code.
        //ArrayAdapter<String> adapter = new 
        // Bind data to view here.
        setListAdapter(getListAdapter());
        
        ListView lv = getListView();
        lv.setOnItemClickListener(this);
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
    protected Dialog onCreateDialog(int id) {
    	Log.v("DEBUG", "Creating dialog");
    	Dialog dialog = new Dialog(this);
    	dialog.setContentView(R.layout.about);
    	dialog.setTitle(R.string.dialog_about_title);
    	
    	return dialog;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	
    	switch (item.getItemId()) {
		case R.id.settings:
			startActivity(new Intent(this, MainPreferenceActivity.class));
			break;
		case R.id.about:
			showDialog(R.id.about);
			break;
		default:
			break;
		}
    	return super.onOptionsItemSelected(item);
    }

	@Override
	public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
		// TODO Auto-generated method stub
		
	}
}