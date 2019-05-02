package com.example.proyecto01;

import android.content.Intent;
import com.google.android.material.button.MaterialButton;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btniniciar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btniniciar=findViewById(R.id.btninicar);

        btniniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,loginActivity.class);
                startActivity(intent);
            }
        });

    }
}
