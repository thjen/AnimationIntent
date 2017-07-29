package com.example.qthjen.animationintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {

    Button bt2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        bt2 = (Button) findViewById(R.id.bt2);

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Activity2.this, MainActivity.class));
                overridePendingTransition(R.anim.anim_start, R.anim.anim_exit);
            }
        });

    }
}
