package com.example.calc1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener {

	private EditText number;
	private Button dele;
	private Button btn7;
	private Button btn8;
	private Button btn9;
	private Button btnc;
	private Button btn4;
	private Button btn5;
	private Button btn6;
	private Button btnx;
	private Button btn1;
	private Button btn2;
	private Button btn3;
	private Button btnj;
	private Button btnp;
	private Button btn0;
	private Button btd;
	private Button btn_j;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		str_ff = new StringBuffer();
		// Êý×Ö¼ü
		btn7 = (Button) findViewById(R.id.bt7);
		btn8 = (Button) findViewById(R.id.bt8);
		btn9 = (Button) findViewById(R.id.bt9);
		btn4 = (Button) findViewById(R.id.bt4);
		btn5 = (Button) findViewById(R.id.bt5);
		btn6 = (Button) findViewById(R.id.bt6);
		btn1 = (Button) findViewById(R.id.bt1);
		btn2 = (Button) findViewById(R.id.bt2);
		btn3 = (Button) findViewById(R.id.bt3);
		btn0 = (Button) findViewById(R.id.bt0);

		// ¹¦ÄÜ¼ü
		btnc = (Button) findViewById(R.id.btn_c);
		btnx = (Button) findViewById(R.id.bt_x);
		btn_j = (Button) findViewById(R.id.bt_j);
		btnj = (Button) findViewById(R.id.btn_j);

		number = (EditText) findViewById(R.id.number);
		dele = (Button) findViewById(R.id.dele);
		btnp = (Button) findViewById(R.id.btp);
		btd = (Button) findViewById(R.id.btd);

		btn0.setOnClickListener(this);
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
		btn3.setOnClickListener(this);
		btn4.setOnClickListener(this);
		btn5.setOnClickListener(this);
		btn6.setOnClickListener(this);
		btn7.setOnClickListener(this);
		btn8.setOnClickListener(this);
		btn9.setOnClickListener(this);

		btnc.setOnClickListener(this);
		btnx.setOnClickListener(this);
		btn_j.setOnClickListener(this);
		btnj.setOnClickListener(this);

		number.setOnClickListener(this);
		btnp.setOnClickListener(this);
		dele.setOnClickListener(this);
		btd.setOnClickListener(this);
	}

	private StringBuffer str_ff;
	private String oper;

	@Override
	public void onClick(View v) {
		switch (v.getId()) {

		case R.id.dele:
			str_ff = new StringBuffer("");
			number.setText("0");
			break;
		case R.id.bt0:
			str_ff.append(btn0.getText().toString());
			number.setText(str_ff);
			break;
		case R.id.bt1:
			str_ff.append(btn1.getText().toString());
			number.setText(str_ff);
			break;
		case R.id.bt2:
			str_ff.append(btn2.getText().toString());
			number.setText(str_ff);
			break;
		case R.id.bt3:
			str_ff.append(btn3.getText().toString());
			number.setText(str_ff);
			break;
		case R.id.bt4:
			str_ff.append(btn4.getText().toString());
			number.setText(str_ff);
			break;
		case R.id.bt5:
			str_ff.append(btn5.getText().toString());
			number.setText(str_ff);
			break;
		case R.id.bt6:
			str_ff.append(btn6.getText().toString());
			number.setText(str_ff);
			break;
		case R.id.bt7:
			str_ff.append(btn7.getText().toString());
			number.setText(str_ff);
			break;
		case R.id.bt8:
			str_ff.append(btn8.getText().toString());
			number.setText(str_ff);
			break;
		case R.id.bt9:
			str_ff.append(btn9.getText().toString());
			number.setText(str_ff);
			break;
		case R.id.btp:
			str_ff.append(btnp.getText().toString());
			number.setText(str_ff);
			break;
		case R.id.btn_j:
			oper = "+";
			str_ff.append(btnj.getText().toString());
			number.setText(str_ff);
			break;
		case R.id.bt_j:
			oper = "-";
			str_ff.append(btn_j.getText().toString());
			number.setText(str_ff);
			break;
		case R.id.bt_x:
			oper = "*";
			str_ff.append(btnx.getText().toString());
			number.setText(str_ff);
			break;
		case R.id.btn_c:
			oper = "/";
			str_ff.append(btnc.getText().toString());
			number.setText(str_ff);
			break;

		case R.id.btd:
			if (oper.equals("+")) {
				System.out.println("---------->" + str_ff.toString());
				String str = str_ff.toString();
				if (str.contains("+")) {
					String[] split = str.split("[+]");
					double num1 = Double.parseDouble(split[0]);
					double num2 = Double.parseDouble(split[1]);
					double num3 = num1 + num2;
					number.setText(num3 + "");
				}

			} else if (oper.equals("-")) {
				System.out.println("---------->" + str_ff.toString());
				String str = str_ff.toString();
				if (str.contains("-")) {
					String[] split = str.split("[-]");
					double num1 = Double.parseDouble(split[0]);
					double num2 = Double.parseDouble(split[1]);
					double num3 = num1 - num2;
					number.setText(num3 + "");
				}

			} else if (oper.equals("*")) {
				System.out.println("---------->" + str_ff.toString());
				String str = str_ff.toString();
				if (str.contains("*")) {
					String[] split = str.split("[*]");
					double num1 = Double.parseDouble(split[0]);
					double num2 = Double.parseDouble(split[1]);
					double num3 = num1 * num2;
					number.setText(num3 + "");
				}

			} else if (oper.equals("/")) {
				System.out.println("---------->" + str_ff.toString());
				String str = str_ff.toString();
				if (str.contains("/")) {
					String[] split = str.split("[/]");
					double num1 = Double.parseDouble(split[0]);
					double num2 = Double.parseDouble(split[1]);
					double num3 = num1 / num2;
					number.setText(num3 + "");
				}

			}
			str_ff = new StringBuffer("");
			break;
		}

	}
}
