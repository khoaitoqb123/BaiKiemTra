package a61cntt1.a61133985.a61133985_bai16;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] listData;
    ArrayAdapter<String> adapter;
    Context context;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;
        textView = (TextView) findViewById(R.id.tvlist);
        listView = (ListView) findViewById(R.id.lv);
        listData = context.getResources().getStringArray(R.array.listview1);
        adapter = new ArrayAdapter<>(context, android.R.layout.simple_list_item_1, listData);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                textView.setText("position: " + i + "\t" + ";" + "\t" + "value: " + listData[i]);
            }
        });
    }
}