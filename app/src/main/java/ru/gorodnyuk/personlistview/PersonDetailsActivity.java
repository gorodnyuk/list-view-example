package ru.gorodnyuk.personlistview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import ru.gorodnyuk.personlistview.dto.Person;

public class PersonDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_details);

        TextView personIdTextView = findViewById(R.id.detailsPersonId);
        TextView personNameTextView = findViewById(R.id.detailsPersonName);

        Intent intent = getIntent();
        Person person = (Person) intent.getSerializableExtra("person");

        personIdTextView.setText(person.getId().toString());
        personNameTextView.setText(person.getName());
    }
}