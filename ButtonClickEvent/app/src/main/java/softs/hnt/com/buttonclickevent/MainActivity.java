package softs.hnt.com.buttonclickevent;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


//(4)implement OnclickListener interface cho MainActivity
//implements View.OnClickListener chỉ được thêm vào khi thực hiện cách 4.
public class MainActivity extends Activity implements View.OnClickListener{
    Button button2, button3, button4, button5, button6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button2 = (Button)findViewById(R.id.btn2);
        button3 = (Button)findViewById(R.id.btn3);
        button4 = (Button)findViewById(R.id.btn4);
        button5 = (Button)findViewById(R.id.btn5);
        button6 = (Button)findViewById(R.id.btn6);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);


        //(2) Khởi tạo OnClickListener interface trực tiếp ngay sau khi gán sự kiện setOnClickListener vào button2
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: do something here
                Toast.makeText(MainActivity.this,"Button2 is clicked", Toast.LENGTH_SHORT ).show();
            }
        });

        //(3) Button3 sẽ thực thi các câu lệnh được khai báo trong biến onClickButton3
        button3.setOnClickListener(onClickButton3);
    }

    //(1) Phương thức này sẽ liên kết với TÊN đã được gán vào sự kiện onClick cho button1 từ file xml để thực thi sự kiên click
    public void onClickButton1(View v)
    {
        //TODO: do something here
        Toast.makeText(this,"Button1 is clicked", Toast.LENGTH_SHORT ).show();
    }

    //(3) Kết hợp với  button3.setOnClickListener(onClickButton3) để thực thi sự kiện Click
    View.OnClickListener onClickButton3 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //TODO: do something here
            Toast.makeText(MainActivity.this,"Button3 is clicked", Toast.LENGTH_LONG ).show();
        }
    };

    //(4) Cài dặt thực thi phương thưc onClick đi kem với OnCLicklistenner interface
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
