package com.example.mike.mycontacts;

import android.graphics.Point;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;


public class ContactViewActivity extends ActionBarActivity {

    public static final String TAG= "ContactViewActivty";
    public static final String EXTRA = "ContactViewActivty_Contact";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_view);



        Display display = (Display)getWindowManager().getDefaultDisplay();
        Point point = new Point();
        display.getSize(point);

        int width = point.x;
        int height = point.y;

        RelativeLayout headerSection = (RelativeLayout) findViewById(R.id.contact_view_header);
        headerSection.setLayoutParams(new RelativeLayout.LayoutParams(width, (int)(width * (9.0/16.0))));
        Log.d(TAG, "New height is " + headerSection.getLayoutParams().height);

        Contact contact = (Contact) getIntent().getSerializableExtra(EXTRA);
        TextView contactName = (TextView)findViewById(R.id.contact_view_name);
        contactName.setText(contact.getName());

        Toolbar toolbar = (Toolbar)findViewById(R.id.contact_view_toolbar);
        setSupportActionBar(toolbar);
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_contact_view, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
