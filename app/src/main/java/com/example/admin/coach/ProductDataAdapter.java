package com.example.admin.coach;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.zip.Inflater;

public class ProductDataAdapter extends RecyclerView.Adapter<BaseViewHolder> {
    private List<? extends BaseDataModel> dataSet;
    private LayoutInflater mInflator;
    private Context context;
    ProductDataAdapter(List<? extends BaseDataModel> item, Context context) {
        dataSet = item;
        mInflator = LayoutInflater.from(context);
        context = context;
    }
    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull final ViewGroup parent, int viewType) {
        //based on the type of the object return the viewholder
        final View inflateView;
        switch(viewType) {

            case 1:
                //this is an advert with no scrolls
                inflateView =mInflator.inflate(R.layout.advertlayout, parent, false);
                return new AdvertViewHolder(inflateView);

            case 2 :
                inflateView = mInflator.inflate(R.layout.horizontalscrolls,parent,false);
                int width = Resources.getSystem().getDisplayMetrics().widthPixels;
                int height = Resources.getSystem().getDisplayMetrics().heightPixels;
                inflateView.getLayoutParams().width = width -4;
                inflateView.getLayoutParams().height = 400;
                Log.d("View objecRR",inflateView.toString());
                return new ScrollViewHolder(inflateView);
            case 21 :
                inflateView = mInflator.inflate(R.layout.horizontalscrolls,parent,false);
                Log.d("View objecRR",inflateView.toString());
                width = Resources.getSystem().getDisplayMetrics().widthPixels/2;
                height = Resources.getSystem().getDisplayMetrics().heightPixels;
                inflateView.getLayoutParams().width = width - 4;
                inflateView.getLayoutParams().height =200;
                return new ScrollViewHolder(inflateView);
            case 3 :
                inflateView =mInflator.inflate(R.layout.horizontalrecyleditems,parent,false);
                Log.d("View object",inflateView.toString());
                return new ScrollListHolder(inflateView);
            case 4 :
                inflateView = mInflator.inflate(R.layout.cards,parent,false);
                Log.d("View object",inflateView.toString());
                return new CardViewHolder(inflateView);
            case 5 :
                inflateView = mInflator.inflate(R.layout.gridrecyclerview,parent,false);
                return new CardGridHolder(inflateView);
            case 60 :
                inflateView = mInflator.inflate(R.layout.cardsgrid,parent,false);
                //staggered layout changes here
                inflateView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                    @Override
                    public boolean onPreDraw() {
                        ViewGroup.LayoutParams lp = inflateView.getLayoutParams();
                        if (lp instanceof StaggeredGridLayoutManager.LayoutParams) {
                            StaggeredGridLayoutManager.LayoutParams sglp = (StaggeredGridLayoutManager.LayoutParams) lp;
                            sglp.setFullSpan(false);
                            sglp.height = 400;
                            sglp.width = inflateView.getWidth();
                            inflateView.setLayoutParams(sglp);
                            StaggeredGridLayoutManager lm = (StaggeredGridLayoutManager)((RecyclerView) parent).getLayoutManager();
                            lm.invalidateSpanAssignments();
                            inflateView.getViewTreeObserver().removeOnPreDrawListener(this);
                        }
                        return true;
                    }
                });
                return new CardGridItemHolder(inflateView);
            case 61 :
                inflateView = mInflator.inflate(R.layout.cardsgrid,parent,false);
                inflateView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                    @Override
                    public boolean onPreDraw() {
                        ViewGroup.LayoutParams lp = inflateView.getLayoutParams();
                        if (lp instanceof StaggeredGridLayoutManager.LayoutParams) {
                            StaggeredGridLayoutManager.LayoutParams sglp = (StaggeredGridLayoutManager.LayoutParams) lp;
                            sglp.setFullSpan(false);
                            sglp.height = 200;
                            //sglp.width = inflateView.getWidth()/2;
                            inflateView.setLayoutParams(sglp);
                            StaggeredGridLayoutManager lm = (StaggeredGridLayoutManager)((RecyclerView) parent).getLayoutManager();
                            lm.invalidateSpanAssignments();
                            inflateView.getViewTreeObserver().removeOnPreDrawListener(this);
                        }
                        return true;
                    }
                });
                return new CardGridItemHolder(inflateView);
            case 7 :
                inflateView = mInflator.inflate(R.layout.cardsgrid,parent,false);
                inflateView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                    @Override
                    public boolean onPreDraw() {
                        ViewGroup.LayoutParams lp = inflateView.getLayoutParams();
                        if (lp instanceof StaggeredGridLayoutManager.LayoutParams) {
                            StaggeredGridLayoutManager.LayoutParams sglp = (StaggeredGridLayoutManager.LayoutParams) lp;
                            sglp.setFullSpan(false);
                            sglp.height = 200;
                            //sglp.width = inflateView.getWidth()/2;
                            inflateView.setLayoutParams(sglp);
                            StaggeredGridLayoutManager lm = (StaggeredGridLayoutManager)((RecyclerView) parent).getLayoutManager();
                            lm.invalidateSpanAssignments();
                            inflateView.getViewTreeObserver().removeOnPreDrawListener(this);
                        }
                        return true;
                    }
                });
                return new CardGridItemHolder(inflateView);
            case 71 :
                inflateView = mInflator.inflate(R.layout.cardsgrid,parent,false);
                inflateView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                    @Override
                    public boolean onPreDraw() {
                        ViewGroup.LayoutParams lp = inflateView.getLayoutParams();
                        if (lp instanceof StaggeredGridLayoutManager.LayoutParams) {
                            StaggeredGridLayoutManager.LayoutParams sglp = (StaggeredGridLayoutManager.LayoutParams) lp;
                            sglp.setFullSpan(false);
                            sglp.height = 400;
                            //sglp.width = inflateView.getWidth()/2;
                            inflateView.setLayoutParams(sglp);
                            StaggeredGridLayoutManager lm = (StaggeredGridLayoutManager)((RecyclerView) parent).getLayoutManager();
                            lm.invalidateSpanAssignments();
                            inflateView.getViewTreeObserver().removeOnPreDrawListener(this);
                        }
                        return true;
                    }
                });
                return new CardGridItemHolder(inflateView);
        }
    return null;
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder holder, int position) {
        holder.bind(dataSet.get(position));
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }
    @Override
    public int getItemViewType(int position){
       return dataSet.get(position).getViewType();

    }
    public  class AdvertViewHolder extends BaseViewHolder<AdvertDataModel> {
        private ImageView img;
        private TextView text;
        private Context context;
        private TextView descView;
        public AdvertViewHolder(View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.advertID);
            text = (TextView) itemView.findViewById(R.id.advertText);
            descView = (TextView) itemView.findViewById(R.id.Headingdesc);
            context = itemView.getContext();
        }

        @Override
        public void bind(AdvertDataModel Object) {
            text.setText(Object.getText());
            //img.setImageResource(Object.getImage());
           // img.setImageResource(getResources().getDrawable(R.drawable.cheese_1));
           img.setImageResource(Object.getImage());
           descView.setText(Object.getDescription());
        }
    }
    public  class ScrollListHolder extends BaseViewHolder<ScrollDataList> {

        private RecyclerView rView;
        private TextView descView;
        private Context context;
        public ScrollListHolder(View itemView) {
            super(itemView);


            rView = (RecyclerView) itemView.findViewById(R.id.recyle_test);
            descView = (TextView) itemView.findViewById(R.id.Headingdesc);
            context = itemView.getContext();
            //recyledView = itemView;
        }

        @Override
        public void bind(ScrollDataList Object) {
            //create an adatper here for the horizontal scrolls her

            rView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL,false));
            SnapHelper helper;

            if (Object.getPagerType().equals("Linear")) {
                helper = new LinearSnapHelper();
            } else {
                helper = new PagerSnapHelper();
            }
            if (Object.getItemsPerScreenWidth() > 1 ) {

            } else {
                rView.setOnFlingListener(null);
                helper.attachToRecyclerView(rView);
            }


            //add decorations to the recylerview, addng margins
            if (Object.getItemsPerScreenWidth() > 1) {
                rView.addItemDecoration(new RecylerViewDecoration( 20));
            } else {
                rView.addItemDecoration(new RecylerViewDecoration( 10));
            }

            ProductDataAdapter adapter = new ProductDataAdapter(Object.getAllElements(),context);
            rView.setAdapter(adapter);
            //set the header text here
            descView.setText(Object.getDescription());
        }
        public class RecylerViewDecoration extends RecyclerView.ItemDecoration {

            private int margin;
            RecylerViewDecoration(int mars) {

                margin = mars;
            }
            @Override
            public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
                int position = parent.getChildAdapterPosition(view);
                final int itemCount = state.getItemCount();
                //set right margin to all
                outRect.right = margin;
                //outRect.left = 5;
                if (position% itemCount==0) {
                    //outRect.left = 5;
                    //outRect.right = 5;
                }

                //set bottom margin to all
               // outRect.bottom = margin;
                //we only add top margin to the first row
                /*if (position <columns) {
                    outRect.top = margin;
                }
                //add left margin only to the first column
                if(position%columns==0){
                    outRect.left = margin;
                }*/
            }

            }
        }

    public  class ScrollViewHolder extends BaseViewHolder<ScrollDataModel> {
        private ImageView img;
        //private TextView text;

        public ScrollViewHolder(View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.scollimgID);

            //text = (TextView) itemView.findViewById(R.id.scrolltext);
        }

        @Override
        public void bind(ScrollDataModel Object) {
            //text.setText(Object.getText());
            img.setImageResource(Object.getImage());

           //DisplayMetrics displayMetrics = new DisplayMetrics();
            //int width = Resources.getSystem().getDisplayMetrics().widthPixels/Object.getItems();

           /* if (Object.getItems() > 1) {
                img.getLayoutParams().height = 250;

            }*/
            //Assuming 4dp margins to each side
            //img.getLayoutParams().width = width- 4;

        }
    }
    public  class CardViewHolder extends BaseViewHolder<CardDataModel> {
        private ImageView img;
        private TextView planet;
        private TextView distance;
        private TextView gravity;
        private TextView weight;

        public CardViewHolder(View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.planetImg);
            planet = (TextView) itemView.findViewById(R.id.txtName);
            distance = (TextView) itemView.findViewById(R.id.txtDistance);
            gravity = (TextView) itemView.findViewById(R.id.txtGravity);
            weight = (TextView) itemView.findViewById(R.id.txtDiameter);
        }

        @Override
        public void bind(CardDataModel Object) {
            planet.setText(Object.getPlanet());
            distance.setText(Object.getDistance());
            gravity.setText(Object.getGravity());
            weight.setText(Object.getWeight());
            img.setImageResource(Object.getImg());
        }
    }
    public  class CardGridHolder extends BaseViewHolder<CardGridList> {

        private RecyclerView rView;
        private TextView descView;
        private Context context;
        public CardGridHolder(View itemView) {
            super(itemView);


            rView = (RecyclerView) itemView.findViewById(R.id.recycleGrids);
            descView = (TextView) itemView.findViewById(R.id.Headingdesc) ;

            context = itemView.getContext();
            //recyledView = itemView;
        }

        @Override
        public void bind(CardGridList Object) {

            rView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
            ProductDataAdapter adapter = new ProductDataAdapter(Object.getAllElements(),context);
            rView.setHasFixedSize(true);
            rView.setAdapter(adapter);
            descView.setText(Object.getDescription());
        }
    }
    public  class CardGridItemHolder extends BaseViewHolder<CardsGridModel> {
        private ImageView img;
        //private TextView text;


        public CardGridItemHolder(View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.imagegrid);
            //text = (TextView) itemView.findViewById(R.id.textgrid);

        }

        @Override
        public void bind(CardsGridModel Object) {
            //text.setText(Object.getText());
            img.setImageResource(Object.getImage());
        }
    }
}
