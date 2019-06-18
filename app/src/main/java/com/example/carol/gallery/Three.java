package com.example.carol.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Three extends AppCompatActivity
{
    Button back3;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        back3 = findViewById(R.id.backThree);
        back3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(Three.this, MainActivity.class);
                startActivity(intent);

            }
        });

    }
}
