package com.xiang.dynamiccontropoject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.ToggleButton;
public class MainActivity extends AppCompatActivity {
    ToggleButton toggleButton;
    Switch aSwitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleButton = (ToggleButton) findViewById(R.id.toggle);
        aSwitch = (Switch) findViewById(R.id.swither);
        final   LinearLayout linerLayout = (LinearLayout) findViewById(R.id.linerLayout);
        CompoundButton.OnCheckedChangeListener listener = new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                    toggleButton.setChecked(true);
                    aSwitch.setChecked(true);
                    linerLayout.setOrientation(LinearLayout.VERTICAL);
                } else {
                    toggleButton.setChecked(false);
                    aSwitch.setChecked(false);
                    linerLayout.setOrientation(LinearLayout.HORIZONTAL);
                }
            }
        };
        toggleButton.setOnCheckedChangeListener(listener);
        aSwitch.setOnCheckedChangeListener(listener);
    }
}
