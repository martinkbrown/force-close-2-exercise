package edu.fsu.cs.mobile.forceclose1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ForceClose2Activity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    private void submitForm()
    {
    	Toast.makeText(getApplicationContext(), "Form submitted!", Toast.LENGTH_SHORT).show();
    }
}