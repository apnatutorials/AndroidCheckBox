package com.apnatutorials.androidcheckbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox chkCustomCricket, chkCustomFootball, chkCustomChess, chkDefaultCricket, chkDefaultFootball, chkDefaultChess;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Custom checkbox initialization
        chkCustomCricket = (CheckBox) findViewById(R.id.chkCustomCricket);
        chkCustomFootball = (CheckBox) findViewById(R.id.chkCustomFootball);
        chkCustomChess = (CheckBox) findViewById(R.id.chkCustomChess);


        // Default checkbox initialization
        chkDefaultCricket = (CheckBox) findViewById(R.id.chkDefaultCricket);
        chkDefaultFootball = (CheckBox) findViewById(R.id.chkDefaultFootball);
        chkDefaultChess = (CheckBox) findViewById(R.id.chkDefaultChess);


    }

    /**
     * called when user click a custom checkbox
     *
     * @param view
     */
    public void customCheckBoxClickHander(View view) {
        CheckBox checkBox = (CheckBox) view;
        boolean isChecked = checkBox.isChecked();
        String clickedButtonStatus = "You clicked " + checkBox.getText() + " isChecked status is : " + isChecked;
        Toast.makeText(MainActivity.this, clickedButtonStatus, Toast.LENGTH_SHORT).show();
            /*
                // You can use this code to perform some operation based on isChecked status and ChekBox id
                switch (view.getId()){
                    case R.id.chkCustomCricket:

                        break;
                    case R.id.chkCustomChess:

                        break;

                    case R.id.chkCustomFootball:

                        break;

                }
             */
    }

    /**
     * Method return all the checkbox options that have been checked inside a wrapper
     *
     * @param view
     */
    public void promptAllCheckedValues(View view) {
        LinearLayout wrapper = (LinearLayout) findViewById(R.id.myCheckBozWrapper);
        StringBuilder sb = new StringBuilder();
        sb.append("Checked values are : ");
        if (wrapper.getChildCount() > 0) {
            for (int i = 0; i < wrapper.getChildCount(); i++) {
                CheckBox ch = (CheckBox) wrapper.getChildAt(i);
                if (ch.isChecked())
                    sb.append("\n" + ch.getText());
            }
        } else {
            sb.append("\nChecked nothing");
        }
        Toast.makeText(MainActivity.this, sb.toString(), Toast.LENGTH_SHORT).show();
    }

    /**
     * Method used to get all checked values of default checkbox
     *
     * @param view
     */
    public void promptAllDefaultCheckedValues(View view) {

        StringBuilder sb = new StringBuilder();
        sb.append("Checked values are : ");
        if (chkDefaultCricket.isChecked())
            sb.append("\n" + chkDefaultCricket.getText());
        if (chkDefaultFootball.isChecked())
            sb.append("\n" + chkDefaultFootball.getText());
        if (chkDefaultChess.isChecked())
            sb.append("\n" + chkDefaultChess.getText());

        Toast.makeText(MainActivity.this, sb.toString(), Toast.LENGTH_SHORT).show();

    }


}
