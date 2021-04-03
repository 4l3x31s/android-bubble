package com.example.examplebubble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.bsk.floatingbubblelib.FloatingBubblePermissions;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FloatingBubblePermissions.startPermissionRequest(this);
        View startBubble = findViewById(R.id.start_bubble);
        startBubble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startService(new Intent(getApplicationContext(), SimpleService.class));
            }
        });
    }
}