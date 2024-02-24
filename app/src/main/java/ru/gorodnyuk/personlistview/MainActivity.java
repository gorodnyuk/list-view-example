package ru.gorodnyuk.personlistview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import ru.gorodnyuk.personlistview.adapter.PersonAdapter;
import ru.gorodnyuk.personlistview.dto.Person;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        List<Person> persons = new ArrayList<>();
        fillPersons(persons);

        PersonAdapter personAdapter = new PersonAdapter(this, R.layout.person_item, persons);
        listView.setAdapter(personAdapter);

        listView.setOnItemClickListener((adapterView, view, i, l) -> {
            Intent intent = new Intent(MainActivity.this, PersonDetailsActivity.class);
            //todo person make serializable
            intent.putExtra("id", persons.get(i).getId().toString());
            intent.putExtra("name", persons.get(i).getName());
            startActivity(intent);
        });
    }

    private void fillPersons(List<Person> persons) {
        for (int i = 1; i <= 1000; i++) {
            persons.add(new Person("Ivan: " + i));
        }
    }
}