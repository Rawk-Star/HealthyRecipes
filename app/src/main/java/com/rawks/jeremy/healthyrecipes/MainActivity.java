package com.rawks.jeremy.healthyrecipes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.btnRecipe);

        // Create a listener to monitor the "View Recipe" button click event
        button.setOnClickListener(new View.OnClickListener() {

            // This function is the event handler for when the user clicks the "View Recipe" button.
            // It opens the recipe activity
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Recipe.class));
            }
        });
    }
}
