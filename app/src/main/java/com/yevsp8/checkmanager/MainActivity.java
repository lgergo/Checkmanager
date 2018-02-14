package com.yevsp8.checkmanager;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DbHandler db = DbHandler.getInstance(this);
        db.generateDemoData();

        ListCheckFragment fragment = ListCheckFragment.newInsatce();

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.checklist_fragmentcontainer, fragment);
        transaction.commit();
        
        FloatingActionButton button = (FloatingActionButton) findViewById(R.id.newImage_button); 
        button.setOnClickListener(new View.OnClickListener() { 
            public void onClick(View v) { 
                //Intent intent = new Intent(getActivity(), NewImageActivity.class);
               // startActivity(intent);
            } 
    });
    }
}
