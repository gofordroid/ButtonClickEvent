package softs.hnt.com.buttonclickevent;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener{
    Button button2, button3, button4, button5, button6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
	//find view-elements
        button2 = (Button)findViewById(R.id.btn2);
        button3 = (Button)findViewById(R.id.btn3);
        button4 = (Button)findViewById(R.id.btn4);
        button5 = (Button)findViewById(R.id.btn5);
        button6 = (Button)findViewById(R.id.btn6);

        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);

	 //Apply an instance of OnClickListener directly on  button,
        // When the button is clicked, the listener reacts and runs the code from onClick method.
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Button2 is clicked", Toast.LENGTH_SHORT ).show();
            }
        });

        button3.setOnClickListener(onClickButton3);
    }

    //The View passed into the method is a reference to the widget that was clicked.
    //The name of the method must be the same with the name is assigned to Button1 in main.xml.	
    public void onClickButton1(View v)
    {
        Toast.makeText(this,"Button1 is clicked", Toast.LENGTH_SHORT ).show();
    }

	
    View.OnClickListener onClickButton3 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this,"Button3 is clicked", Toast.LENGTH_LONG ).show();
        }
    };


    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btn4:
                Toast.makeText(MainActivity.this,"Button4 is clicked", Toast.LENGTH_SHORT ).show();
                break;
            case R.id.btn5:
                Toast.makeText(MainActivity.this,"Button5 is clicked", Toast.LENGTH_SHORT ).show();
                break;
            case R.id.btn6:
                Toast.makeText(MainActivity.this,"Button6 is clicked", Toast.LENGTH_SHORT ).show();
                break;
        }
    }
}
