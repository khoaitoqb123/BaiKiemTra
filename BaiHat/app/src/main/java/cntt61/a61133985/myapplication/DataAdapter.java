package cntt61.a61133985.myapplication;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DataAdapter extends BaseAdapter {
    private Activity activity;
    private List<Data> items;

    public DataAdapter(Activity activity, int item, List<Data> items) {
        this.activity = activity;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = activity.getLayoutInflater();

        view = inflater.inflate(R.layout.item, null);

        TextView tvBH = (TextView) view.findViewById(R.id.tenBH);
        TextView tvCS = (TextView) view.findViewById(R.id.tenCS);
        tvBH.setText(items.get(i).tenBH);
        tvCS.setText(items.get(i).tenCS);
        ImageView imageView = (ImageView) view.findViewById(R.id.img);
        imageView.setImageResource(items.get(i).HinhAnh);

        return view;
    }
}
