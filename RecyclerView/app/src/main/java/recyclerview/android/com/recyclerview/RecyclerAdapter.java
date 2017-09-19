package recyclerview.android.com.recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Collections;
import java.util.List;

/**
 * Created by JackReacher on 9/15/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>  {
    List<Information>  data = Collections.EMPTY_LIST;;
    LayoutInflater mLayoutInflator;
    public RecyclerAdapter(Context context,List<Information>  data){
        mLayoutInflator=LayoutInflater.from(context);
        this.data=data;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mView =mLayoutInflator.inflate(R.layout.recycler_view_design,null);

        MyViewHolder myViewHolder=new MyViewHolder(mView);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Information currentObject=data.get(position);
        holder.mTxtVu.setText(currentObject.title);
        holder.imgVu.setImageResource(currentObject.image);

    }

    @Override
    public int getItemCount() {
        return data.size();
    }
    class MyViewHolder extends RecyclerView.ViewHolder{
        TextView mTxtVu;
        ImageView imgVu;

        public MyViewHolder(View itemView) {
            super(itemView);
            mTxtVu= (TextView) itemView.findViewById(R.id.my_text_view);
            imgVu=(ImageView)itemView.findViewById(R.id.img_vu);
        }
    }
}