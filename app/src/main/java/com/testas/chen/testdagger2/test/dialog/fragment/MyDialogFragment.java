package com.testas.chen.testdagger2.test.dialog.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;

import com.testas.chen.testdagger2.R;

/**
 * Created by chen on 2017/5/27.
 */

public class MyDialogFragment extends DialogFragment {
    public MyDialogFragment() {
        super();
    }

    private void initDialogParams() {
        getDialog().getWindow().setGravity(Gravity.BOTTOM);
        final Window window = getDialog().getWindow();
        window.setBackgroundDrawableResource(android.R.color.transparent);
        window.getDecorView().setPadding(0, 0, 0, 0);
    }

    @Override
    public void onResume() {
        super.onResume();
        getDialog().getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(DialogFragment.STYLE_NO_TITLE,0);//设置样式
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        return super.onCreateDialog(savedInstanceState);
    }

    @Override
    public void onCancel(DialogInterface dialog) {
        super.onCancel(dialog);
    }

    @Override
    public void onDismiss(DialogInterface dialog) {
        super.onDismiss(dialog);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.dialog_layout,container);
        LinearLayout ll = (LinearLayout)v.findViewById(R.id.dialog_layout_ll);
        ViewGroup.LayoutParams params = ll.getLayoutParams();
        int height = getScreenHeight();
        params.height = (height * 1) / 3;
        ll.setLayoutParams(params);
        initDialogParams();
        return v;
    }

    private int getScreenHeight() {
        WindowManager wm = this.getActivity().getWindowManager();

        int width = wm.getDefaultDisplay().getWidth();
        int height = wm.getDefaultDisplay().getHeight();
        return height;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }


}
