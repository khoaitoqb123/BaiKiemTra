package a61cntt.a61133985.a61133985_bai19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.a61133985_bai19.R;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    TextView textView;
    String[] item = {"Hà nội", "huế", "spa", "côn sơn", "vũng tàu", "đà nẵng"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.tvlist);

        listView = (ListView) findViewById(R.id.lv);

        DataAdapter adapter = new DataAdapter(this, item);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                textView.setText("position: " + i + "\t" + ";" + "\t"  + "value: " + item[i]);
            }
        });
    }
}