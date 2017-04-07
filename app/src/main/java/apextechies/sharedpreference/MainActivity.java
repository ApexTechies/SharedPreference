package apextechies.sharedpreference;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText setvalue;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.getvalue).setOnClickListener(this);
        setvalue = (EditText)findViewById(R.id.setvalue);
        textView = (TextView)findViewById(R.id.textView);
        //get the preference value from the same key

        if (SharedPreference.getPreferences(MainActivity.this,"myvalue").equalsIgnoreCase(""))
        {

        }
        else
        {
            textView.setText(SharedPreference.getPreferences(MainActivity.this,"myvalue"));
        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.getvalue:
                if (setvalue.getText().toString().equalsIgnoreCase(""))
                {
                    textView.setText("Enter something to check shared preference value");
                    break;
                }
                else
                {
                    //set the value in preference with your own key

                    SharedPreference.setPreferences(MainActivity.this,"myvalue",setvalue.getText().toString());
                    textView.setText(SharedPreference.getPreferences(MainActivity.this,"myvalue"));
                }
                break;
        }
    }
}
