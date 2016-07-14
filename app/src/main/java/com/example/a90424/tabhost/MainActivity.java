package com.example.a90424.tabhost;

import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabHost = (TabHost)findViewById(R.id.tabHost);

        TabHost.TabSpec tab1 = tabHost.newTabSpec("First");
        TabHost.TabSpec tab2 = tabHost.newTabSpec("Second");
        TabHost.TabSpec tab3 = tabHost.newTabSpec("Third");

        tab1.setIndicator("tabActivity1");
        tab1.setContent(new Intent(this, tabActivity1.class));

        tab2.setIndicator("tabActivity2");
        tab2.setContent(new Intent(this, tabActivity2.class));

        tab3.setIndicator("tabActivity3");
        tab3.setContent(new Intent(this, tabActivity3.class));

        tabHost.addTab(tab1);
        tabHost.addTab(tab2);
        tabHost.addTab(tab3);

        tabHost.setCurrentTab(0);




    }
}
