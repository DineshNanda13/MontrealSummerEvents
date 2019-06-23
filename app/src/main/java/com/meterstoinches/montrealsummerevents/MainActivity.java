package com.meterstoinches.montrealsummerevents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    int images[] = {R.drawable.posterone, R.drawable.postertwo, R.drawable.posterthree, R.drawable.posterfour
    ,R.drawable.posterfive};

     String names[] = {"Formula 1 grandprix","Jazz Festival","Beer Festival","Circus Festival",
     "Backstreet Boys"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView =(ListView) findViewById(R.id.listView);

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                intent.putExtra("images",images[position]);
                intent.putExtra("names",names[position]);
                startActivity(intent);

            }
        });
    }
    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.customlayout,null);

            ImageView imageView = convertView.findViewById(R.id.imageView1);
            TextView textView_name = convertView.findViewById(R.id.textview_name);

            imageView.setImageResource(images[position]);
            textView_name.setText(names[position]);

            return convertView;
        }
    }
}
