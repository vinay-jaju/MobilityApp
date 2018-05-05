package com.deloitte.vjaju.mobilityapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.wajahatkarim3.easyflipview.EasyFlipView;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Dashboard extends AppCompatActivity {
    EasyFlipView easyFlipView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        RecyclerView rv = (RecyclerView) findViewById(R.id.mainPage_rv);

        DashItemsAdapter ca = new DashItemsAdapter(createDashboardList());
        rv.setAdapter(ca);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rv.setLayoutManager(llm);

        rv.addOnItemTouchListener(new RecyclerItemListener(getApplicationContext(), rv,
                new RecyclerItemListener.RecyclerTouchListener() {
                    public void onClickItem(View v, int position) {
                        //Toast.makeText(Dashboard.this, String.valueOf(position), Toast.LENGTH_SHORT).show();
                        switch (position){
                            case 0://open dashboard activity
                                startActivity(new Intent(Dashboard.this,Dashboard_KPIs.class));

                                break;
                            case 1:
                                startActivity(new Intent(Dashboard.this,KPI.class));
                                break;
                            case 2:
                                startActivity(new Intent(Dashboard.this,Notification.class));
                                break;
                        }
                    }

                    public void onLongClickItem(View v, int position) {
                       //System.out.println("On Long Click Item interface");
                    }
                }));


//        easyFlipView =  findViewById(R.id.easyFlipView1);
//
//        pleaseFlip(easyFlipView);
    }
//    public static void pleaseFlip(final EasyFlipView e){
//        e.flipTheView();
//        Handler handler = new Handler();
//        handler.postDelayed(new Runnable() {
//            public void run() {
//                // yourMethod();
//                pleaseFlip(e);
//            }
//        }, 3000);   //5 seconds
//
//
//    }


    public static List<DashItems> createDashboardList(){
        List<DashItems> items=new ArrayList<>();
        DashItems items1=new DashItems(R.drawable.dashboard_mydashboard,"Dashboard","Choose the KPI's for your business purpose");
        DashItems items2=new DashItems(R.drawable.dasboard_kpi,"KPIs","Get the insights and Gauge the performance");
        DashItems items3=new DashItems(R.drawable.dashboard_notifs,"Notifications","Get Notified with alerts on the selected KPI's");
        items.add(items1);
        items.add(items2);
        items.add(items3);
        return items;
    }
}
