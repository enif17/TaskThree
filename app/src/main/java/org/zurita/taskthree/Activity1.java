package org.zurita.taskthree;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    //onImplicit function launches when the implicit button is clicked
    public void onImplicit(View view) {
        Log.d("piruli", "Implicit button clicked");
    }

    //onExplicit function launches when the explicit button is clicked
    public void onExplicit(View view) {
        Log.d("piruli", "Explicit button clicked");

        //a new intent is created associated with Activity2
        Intent explicit = new Intent(this, Activity2.class);
        //throws the intent; Activity2 is now running
        startActivity(explicit);
    }


}
