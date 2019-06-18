package com.example.carol.gallery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    Button button1,button2,button3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.buttonOne);
        button2 = findViewById(R.id.buttonTwo);
        button3 = findViewById(R.id.buttonThree);

        button1.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
             Intent intent1 = new Intent(MainActivity.this,One.class);
             startActivity(intent1);
            }
        });

        button2.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                Intent intent2 = new Intent(MainActivity.this,Two.class);
                startActivity(intent2);
            }
        });

        button3.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View view)
            {
                Intent intent3 = new Intent(MainActivity.this,Three.class);
                startActivity(intent3);
            }
        });
    }
}
