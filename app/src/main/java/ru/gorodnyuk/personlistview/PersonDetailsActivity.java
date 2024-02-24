package ru.gorodnyuk.personlistview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PersonDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_details);

        TextView personIdTextView = findViewById(R.id.detailsPersonId);
        TextView personNameTextView = findViewById(R.id.detailsPersonName);

        Intent intent = getIntent();

        personIdTextView.setText(intent.getStringExtra("id"));
        personNameTextView.setText(intent.getStringExtra("name"));
    }
}