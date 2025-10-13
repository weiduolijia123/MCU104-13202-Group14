package com.example.homework2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // 宣告全域變數
    private TextView txtShow;
    private Button btnZero, btnOne, btnTwo, btnThree, btnFour;
    private Button btnFive, btnSix, btnSeven, btnEight, btnNine, btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 取得資源類別檔中的介面元件
        txtShow = (TextView) findViewById(R.id.txtShow);
        btnZero = (Button) findViewById(R.id.btnZero);
        btnOne = (Button) findViewById(R.id.btnOne);
        btnTwo = (Button) findViewById(R.id.btnTwo);
        btnThree = (Button) findViewById(R.id.btnThree);
        btnFour = (Button) findViewById(R.id.btnFour);
        btnFive = (Button) findViewById(R.id.btnFive);
        btnSix = (Button) findViewById(R.id.btnSix);
        btnSeven = (Button) findViewById(R.id.btnSeven);
        btnEight = (Button) findViewById(R.id.btnEight);
        btnNine = (Button) findViewById(R.id.btnNine);
        btnClear = (Button) findViewById(R.id.btnClear);

        // 設定 button 元件 Click 事件共用   myListner
        btnZero.setOnClickListener(myListner);
        btnOne.setOnClickListener(myListner);
        btnTwo.setOnClickListener(myListner);
        btnThree.setOnClickListener(myListner);
        btnFour.setOnClickListener(myListner);
        btnFive.setOnClickListener(myListner);
        btnSix.setOnClickListener(myListner);
        btnSeven.setOnClickListener(myListner);
        btnEight.setOnClickListener(myListner);
        btnNine.setOnClickListener(myListner);
        btnClear.setOnClickListener(myListner);
    }

    // 定義  onClick() 方法
    public View.OnClickListener myListner = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String s = txtShow.getText().toString();
            int id = v.getId(); // 先取得 ID

            if (id == R.id.btnZero) {
                txtShow.setText(s + "0");
            } else if (id == R.id.btnOne) {
                txtShow.setText(s + "1");
            } else if (id == R.id.btnTwo) {
                txtShow.setText(s + "2");
            } else if (id == R.id.btnThree) {
                txtShow.setText(s + "3");
            } else if (id == R.id.btnFour) {
                txtShow.setText(s + "4");
            } else if (id == R.id.btnFive) {
                txtShow.setText(s + "5");
            } else if (id == R.id.btnSix) {
                txtShow.setText(s + "6");
            } else if (id == R.id.btnSeven) {
                txtShow.setText(s + "7");
            } else if (id == R.id.btnEight) {
                txtShow.setText(s + "8");
            } else if (id == R.id.btnNine) {
                txtShow.setText(s + "9");
            } else if (id == R.id.btnClear) {
                txtShow.setText("電話號碼：");
            }
        }

    };
}
