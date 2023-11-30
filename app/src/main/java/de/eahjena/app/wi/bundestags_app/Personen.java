package de.eahjena.app.wi.bundestags_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class Personen extends AppCompatActivity {

    String personenList[] = {"Person_1", "Person_2", "Person_3", "Person_4", "Person_5", };

    int personenImages [] = {R.drawable.adler,R.drawable.adler,R.drawable.adler,R.drawable.adler,R.drawable.adler };

    // Hier Müssen dann die Arrays eingepflegt werden

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personen);
        listView = (ListView) findViewById(R.id.customListView_2);
        CustomBaseAdapter customBaseAdapter = new CustomBaseAdapter(getApplicationContext(),personenList,personenImages );
        listView.setAdapter(customBaseAdapter);
    }
}