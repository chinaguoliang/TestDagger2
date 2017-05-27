package com.testas.chen.testdagger2;

import android.app.Activity;
import android.app.Dialog;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.testas.chen.testdagger2.test.dialog.fragment.MyDialogFragment;

import javax.inject.Inject;


public class MainActivity extends FragmentActivity {
    @Inject
    Pot pot;

    @Inject
    Pot pot2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 这个类是重新编译后Dagger2自动生成的，所以写这行代码之前要先编译一次
        // Build --> Rebuild Project

        DaggerMainActivityComponent.builder().potComponent(DaggerPotComponent.builder().flowerComponent(DaggerFlowerComponent.create()).build()).build().inject(this);

        String show = pot.show();
        Toast.makeText(MainActivity.this, show, Toast.LENGTH_SHORT).show();

        showDialog();
    }


    private void showDialog() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        MyDialogFragment editNameDialog = new MyDialogFragment();
        editNameDialog.show(fragmentManager,"");
    }
}
