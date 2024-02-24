package ru.gorodnyuk.personlistview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import ru.gorodnyuk.personlistview.R;
import ru.gorodnyuk.personlistview.dto.Person;

public class PersonAdapter extends ArrayAdapter<Person> {

    private final List<Person> persons;

    public PersonAdapter(@NonNull Context context, int resource, List<Person> persons) {
        super(context, resource);
        this.persons = persons;
    }

    @Override
    public int getCount() {
        return persons.size();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        convertView = layoutInflater.inflate(R.layout.person_item, parent, false);

        TextView personName = convertView.findViewById(R.id.personName);

        personName.setText(persons.get(position).getName());

        return convertView;
    }
}
