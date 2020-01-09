package id.poliban.ac.mi.customlistview;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    private List<food> foods = new ArrayList<>();
    private ListView listView;
    private  BaseAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        foods.addAll(FoodData.getallFoods());

        adapter = new FoodAdapter(foods);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id)->{
            new  AlertDialog.Builder(this)
                    .setTitle("info")
                    .setMessage(foods.get(position).toString())
                    .setPositiveButton("Ok", null).show();
        });
    }
}
