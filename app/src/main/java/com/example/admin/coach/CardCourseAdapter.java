package com.example.admin.coach;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.admin.coach.R.*;


public class CardCourseAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<CardCourse> dataSet;
    private Context mcontext;
    private View cardL;
    private CardRightHolder cardR;
    public CardCourseAdapter(ArrayList<CardCourse> data,Context context){
        this.dataSet = data;
        this.mcontext = context;
        Log.d("Test-----------------","Testing");

    }
    public class CardLeftHolder extends RecyclerView.ViewHolder {
        public ImageView image;
        public TextView course, IconHolderMultiple, IconHolderSingle;
        public Button m_action1, m_action2, s_action1;


        public CardLeftHolder(View v) {
            super(v);
            image = (ImageView) v.findViewById(id.imageView);
            course = (TextView) v.findViewById(id.textView2);
            IconHolderMultiple = (TextView) v.findViewById(id.textView3);
            IconHolderSingle = (TextView) v.findViewById(id.textView4);
            m_action1 = (Button) v.findViewById(id.imgButton1);
            m_action2 = (Button) v.findViewById(id.imgButton2);
            s_action1 = (Button) v.findViewById(id.imgButton3);
            cardL = v;

        }
    }
    public class CardRightHolder extends RecyclerView.ViewHolder {
        public ImageView image;
        public TextView course, IconHolderMultiple, IconHolderSingle;
        public CardRightHolder(View v,CardLeftHolder carx) {
            super(v);
            image = (ImageView) v.findViewById(id.imageView1);
            course = (TextView) v.findViewById(id.textView31);
            CardView card1 = (CardView) v.findViewById(id.card2);
            IconHolderMultiple = (TextView) v.findViewById(id.textView32);
            IconHolderSingle = (TextView) v.findViewById(id.textView41);
            ConstraintLayout constraintLayoutM = v.findViewById(R.id.constraintR);
            ConstraintSet conset = new ConstraintSet();
            //get the card here
            Log.d("Layout",Integer.toString(card1.getId()));
            Log.d("Layout",Integer.toString(cardL.findViewById(id.card1).getId()));
           //conset.connect(card1.getId(),conset.START,carx.findViewById(id.card1).getId(),conset.START);




        }
    }






    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Log.d("TestviewHolder0",Integer.toString(viewType));
        View itemView = LayoutInflater.from(parent.getContext()).inflate(layout.cardslayout,parent,false);
        CardLeftHolder cardLx = new  CardLeftHolder(itemView);
        View itemView1 = LayoutInflater.from(parent.getContext()).inflate(layout.cardslayoutright,parent,false);
        return new CardRightHolder(itemView1,cardLx);
       /* switch(viewType) {
            case 0 :
                View itemView = LayoutInflater.from(parent.getContext()).inflate(layout.cardslayout,parent,false);
                return new CardLeftHolder(itemView);

            case 1 :
                View itemView1 = LayoutInflater.from(parent.getContext()).inflate(layout.cardslayoutright,parent,false);
                return new CardRightHolder(itemView1);

        }*/
        //return null;
    }


    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        CardCourse resObject = this.dataSet.get(position);
        Log.d("BidView",Integer.toString(position));
        /*switch(holder.getItemViewType()) {
            case 0:
                CardLeftHolder cardx = (CardLeftHolder)holder;
                //set the props here
                ConstraintSet con1 = new ConstraintSet();

                cardx.image.setImageResource(resObject.getImageIcon());
                cardx.course.setText(resObject.getCourseText());
               cardx.IconHolderMultiple.setCompoundDrawables(mcontext.getResources().getDrawable(resObject.getSingleIcon()),null,null,null);
                cardx.IconHolderSingle.setCompoundDrawables(mcontext.getResources().getDrawable(resObject.getSingleIcon()),null,null,null);
                cardx.m_action1.setText("PEEK");
                cardx.m_action2.setText("PLAN");
                cardx.s_action1.setText("BOOK");
                break;
            case 1:
                CardRightHolder cardy = (CardRightHolder) holder;
                ConstraintSet conset = new ConstraintSet();
                Log.d("SDD ------------",Integer.toString(holder.getAdapterPosition()));
                //conset.connect();
                cardy.image.setImageResource(resObject.getImageIcon());
                cardy.course.setText(resObject.getCourseText());
                cardy.IconHolderMultiple.setCompoundDrawables(mcontext.getResources().getDrawable(resObject.getSingleIcon()),null,null,null);
                cardy.IconHolderSingle.setCompoundDrawables(mcontext.getResources().getDrawable(resObject.getSingleIcon()),null,null,null);
                break;


        }*/

    }



    @Override
    public int getItemCount() {
        return this.dataSet.size();
    }

    @Override
    public int getItemViewType(int position) {
        Log.i("Coach",Integer.toString(position));
        return position % 2;
    }
}


