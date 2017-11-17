package com.example.andresfelipe.appaltem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> selectedItems = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView ch1 = (ListView) findViewById(R.id.checkable_list);
        ch1.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

        String[] items = {"Estudiante 1", "Estudiante 2", "Estudiante 3", "Estudiante 4", "Estudiante 5", "Estudiante ", "Estudiante 7", "Estudiante8", "Estudiante9", "Estudiante10","Estudiante10","Estudiante11","Estudiante101","Estudiante102","Estudiante103","Estudiante104","Estudiante105","Estudiante106","Estudiante108","Estudiante109"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.rowlayout, R.id.txt_lan, items);
        ch1.setAdapter(adapter);
        ch1.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                String selectedItem = ((TextView) view).getText().toString();
                if (selectedItems.contains(selectedItem)) {
                    selectedItems.remove(selectedItem);
                } else
                    selectedItems.add(selectedItem);

            }


        });

    }
    public void showSelectedItems(View view){

        String items="";
        for (String item:selectedItems){
            items+="-"+item+"\n";

        }
        Toast.makeText(this,"you have selected \n"+items, Toast.LENGTH_LONG).show();
    }


    }

