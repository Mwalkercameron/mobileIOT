package com.example.app_v3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
    private Button viewDevicesButton;
    private Button addDeviceButton;
    private Button deleteDeviceButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        viewDevicesButton = findViewById(R.id.viewDevicesButton);
        addDeviceButton = findViewById(R.id.addDeviceButton);
        deleteDeviceButton = findViewById(R.id.deleteDeviceButton);

        viewDevicesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, ViewDevicesActivity.class);
                startActivity(intent);
            }
        });

        addDeviceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, AddDeviceActivity.class);
                startActivity(intent);
            }
        });

        deleteDeviceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, DeleteDeviceActivity.class);
                startActivity(intent);
            }
        });
    }
}
