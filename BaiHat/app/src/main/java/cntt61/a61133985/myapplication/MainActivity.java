package cntt61.a61133985.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    DataAdapter adapter;
    ArrayList<Data> listData;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.lv);
        listData = new ArrayList<>();
        listData.add(new Data("abc","1",R.drawable.ic_launcher_background));
        listData.add(new Data("xyz","2",R.drawable.ic_launcher_background));
        listData.add(new Data("mnp","3",R.drawable.ic_launcher_background));

        adapter = new DataAdapter(this, R.layout.item, listData);
        listView.setAdapter(adapter);
    }
}