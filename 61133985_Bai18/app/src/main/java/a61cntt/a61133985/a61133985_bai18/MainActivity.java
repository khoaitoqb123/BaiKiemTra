package a61cntt.a61133985.a61133985_bai18;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.a61133985_bai18.R;

public class MainActivity extends ListActivity {

    private static final String[] items = {"Intel", "SamSung", "Nokia", "Simen", "AMD", "KIC", "ECD"};
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.tvlist);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        setListAdapter(arrayAdapter);

        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                textView.setText("position: " + i + "\t" + ";" + "\t"  + "value: " + items[i]);
            }
        });
    }
}