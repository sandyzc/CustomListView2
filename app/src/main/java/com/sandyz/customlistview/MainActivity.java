package com.sandyz.customlistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.sandyz.customlistview.Adapters.ListAdaper;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] name = new String[]{"Name 1","Name 2","Name 3","Name 4","Name 5","Name 6","Name 7","Name 8","Name 9","Name 10"};
    String[] numb = new String[]{"PhoneNumber 1 ","Phonenumber 2","Phonenumber 3","Phonenumber 4","Phonenumber 5","Phonenumber 6","Phonenumber 7","Phonenumber 8","Phonenumber 9","Phonenumber 10"};
    List<CustomBean> model = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView)findViewById(R.id.list);
        for (int i = 0; i <name.length; i++){


            CustomBean handler = new CustomBean();
            handler.setName(name[i]);
            handler.setNumb(numb[i]);
            model.add(handler);
        }
        ListAdaper listAdaper = new ListAdaper(this,model);
        listView.setAdapter(listAdaper);
    }
}
