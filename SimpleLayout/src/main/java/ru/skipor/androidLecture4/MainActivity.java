package ru.skipor.androidLecture4;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {


    private EditText editText;
    private TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.edit_text_top);
        textView = (TextView) findViewById(R.id.text_view);

    }


    public void setText(View view) {
        textView.setText(editText.getText());

    }

    public void clearText(View view) {
        CharSequence charSequence = editText.getText();
        int subSuquenceLehgth = charSequence.length() - 1 < 0? 0 : charSequence.length() - 1;
        editText.setText(charSequence.subSequence(0, subSuquenceLehgth));

        charSequence = textView.getText();
        subSuquenceLehgth = charSequence.length() - 1 < 0? 0 : charSequence.length() - 1;
        textView.setText(charSequence.subSequence(0, subSuquenceLehgth));

    }

    public void clearAllText(View view) {
        editText.setText("");
        textView.setText("");

    }








    
}
