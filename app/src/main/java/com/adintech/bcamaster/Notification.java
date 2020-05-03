package com.adintech.bcamaster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Notification extends AppCompatActivity {
    ListView list;

    String[] maintitle ={
            "RTMNU Exam Shedule","MCA-CET 2020 Entrance"
    };

    String[] subtitle ={
            "RTMNU announced that exam will be conducted after 2 May due to spread of Covid-19 " +
                    "support Lock down and Stay at home. ","MHT-CET 2020 Exam which was scheduled on 30th April" +
            "2020 was postponed till further orders. kindly visit to official website for more information. "
    };

    Integer[] imgid={
            R.drawable.notification,R.drawable.notification
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

            final MyListAdapter adapter=new MyListAdapter(this, maintitle, subtitle,imgid);
            list=(ListView)findViewById(R.id.list);
            list.setAdapter(adapter);


            list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Toast.makeText(Notification.this, "Thank You !! ", Toast.LENGTH_SHORT).show();
                }
            });

        }

    }


