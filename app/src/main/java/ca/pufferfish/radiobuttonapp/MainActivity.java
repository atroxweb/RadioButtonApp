package ca.pufferfish.radiobuttonapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioGroup rg;
    RadioButton radioButton;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg = findViewById(R.id.radioGr);
        radioButton = findViewById(R.id.radioButton1);
        textView = findViewById(R.id.textView);
    }

    public void onClickShow(View v)
    {
        int id;

        id = rg.getCheckedRadioButtonId();
        radioButton = findViewById(id);
        textView.setText(radioButton.getText());

    }

}
