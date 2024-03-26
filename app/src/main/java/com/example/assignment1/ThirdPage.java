package com.example.assignment1;

import android.os.Bundle;
        import android.widget.ImageView;
        import android.widget.TextView;
        import androidx.annotation.Nullable;
        import androidx.appcompat.app.AppCompatActivity;

public class ThirdPage extends AppCompatActivity {
    private ImageView profilePictureImageView;
    private TextView usernameTextView, bioTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_page);

        // Initialize views
        profilePictureImageView = findViewById(R.id.profilePictureImageView);
        usernameTextView = findViewById(R.id.usernameTextView);
        bioTextView = findViewById(R.id.bioTextView);

        // Populate views with sample data (replace with actual data from user profile)
        profilePictureImageView.setImageResource(R.drawable.profile_picture);
        usernameTextView.setText("Your Username");
        bioTextView.setText("Your Bio");

        // Set up RecyclerView for displaying posts (you'll need to implement this)
        // RecyclerView postsRecyclerView = findViewById(R.id.postsRecyclerView);
        // postsRecyclerView.setLayoutManager(new GridLayoutManager(this, 3)); // Example grid layout
        // postsRecyclerView.setAdapter(new PostsAdapter(postsData)); // Example adapter for posts
    }
}
