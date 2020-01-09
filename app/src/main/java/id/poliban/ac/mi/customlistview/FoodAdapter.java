package id.poliban.ac.mi.customlistview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import java.util.ArrayList;
import java.util.List;

public class FoodAdapter extends BaseAdapter {
    private List<food> data = new ArrayList<>();

    public  FoodAdapter(List<food> data){
        this.data = data;
    }


    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView img_food;
        TextView tv_food_name;
        TextView tv_food_description;

        convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_food, parent, false);

        img_food = convertView.findViewById(R.id.img_food);
        tv_food_name = convertView.findViewById(R.id.tv_food_name);
        tv_food_description= convertView.findViewById(R.id.tv_food_description);

        Glide.with(parent.getContext()).load(data.get(position).getFood()).apply(new RequestOptions().override(60,60))
                .into(img_food);
        tv_food_name.setText(data.get(position).getFoodName());
        tv_food_description.setText(data.get(position).getFoodDescription());

        return convertView;
    }
}
