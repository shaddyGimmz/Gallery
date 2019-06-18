package com.example.carol.gallery;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Two extends AppCompatActivity
{
    Button backTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        backTwo = findViewById(R.id.backTwo);

        backTwo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(Two.this, MainActivity.class);
                startActivity(intent);

            }
        });

    }

}
