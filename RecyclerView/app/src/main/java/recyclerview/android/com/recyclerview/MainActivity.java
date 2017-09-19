package recyclerview.android.com.recyclerview;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import adapter.MyAdapter;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView)findViewById(R.id.recycler_view);
        recyclerAdapter=new RecyclerAdapter(MainActivity.this,getData());
        recyclerView.setAdapter(recyclerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }
    public List<Information> getData(){
        List<Information> myRecyclerData=new ArrayList<>();
        int[] images={R.drawable.jaana_ve,R.drawable.ae_dil,R.drawable.darkasht,R.drawable.tere_mere};
        String[] songNames={"Jaana ve","Ae Dil","Darkhast","Tere Mere"};
        for (int i=0;i<images.length && i<songNames.length;i++){
        Information currentObject=new Information();
            currentObject.image=images[i];
            currentObject.title=songNames[i];
            myRecyclerData.add(currentObject);
        }
        return myRecyclerData;
    }
}
