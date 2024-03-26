package com.example.assignment1;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Call method to navigate to SecondPage activity
        navigateToSecondPage();
    }

    // Method to navigate to the SecondPage activity
    private void navigateToSecondPage() {
        Intent intent = new Intent(this, SecondPage.class);
        startActivity(intent);
        finish(); // Optional: finish MainActivity if you don't want it to stay in the back stack
    }
}
