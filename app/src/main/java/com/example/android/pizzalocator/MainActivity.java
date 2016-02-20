package com.example.android.pizzalocator;

//Jeremy Manthey
//Asg 5 Location Choice

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView dominoeListView;
    String[] dominoes;
    String outputString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Resources resources = getResources();
        dominoes = resources.getStringArray(R.array.Dominoes);
        dominoeListView = (ListView) findViewById(R.id.listView);
        dominoeListView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dominoes));


        Button activityButton = (Button) findViewById(R.id.findPizza);
        activityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(),
                        Main2Activity.class);
                startIntent.putExtra("edu.css.MESSAGE", outputString);
                startActivity(startIntent);
            }
        });



        dominoeListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                outputString = dominoes[position];
                Toast.makeText(getApplicationContext(),dominoes[position], Toast.LENGTH_SHORT).show();

            }
        });

    }
}
