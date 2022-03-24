package a61cntt.a61133985.a61133985_bai17;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.a61133985_bai17.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> listData;
    ArrayAdapter adapter;
    Context context;
    TextView textView;
    Button button;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;
        textView = (TextView) findViewById(R.id.tvlist);
        listView = (ListView) findViewById(R.id.lv);
        button = (Button) findViewById(R.id.btnNhap);
        editText = (EditText) findViewById(R.id.edt);
        listData = new ArrayList<>();
        listData.add("Tý");
        listData.add("Tèo");
        listData.add("Bin");
        adapter = new ArrayAdapter(context, android.R.layout.simple_list_item_1, listData);
        listView.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String item = editText.getText().toString();
                listData.add(item);
                adapter.notifyDataSetChanged();
            }
        });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String val = (String) listView.getItemAtPosition(i);
                textView.setText("position: " + i + "\t" + ";" + "\t"  + "value: " + val);
            }
        });

    }
}