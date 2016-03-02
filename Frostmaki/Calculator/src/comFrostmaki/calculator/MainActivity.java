package comFrostmaki.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity implements OnClickListener{

	TextView inputText =(TextView)findViewById(R.id.textInput);
	TextView OutputText =(TextView)findViewById(R.id.textOnput);
	
	Button but_zero=(Button)findViewById(R.id.but_zero);
	Button but_one=(Button)findViewById(R.id.but_one);
	Button but_two=(Button)findViewById(R.id.but_two);
	Button but_three=(Button)findViewById(R.id.but_three);
	Button but_four=(Button)findViewById(R.id.but_four);
	Button but_five=(Button)findViewById(R.id.but_five);
	Button but_six=(Button)findViewById(R.id.but_six);
	Button but_seven=(Button)findViewById(R.id.but_seven);
	Button but_eight=(Button)findViewById(R.id.but_eight);
	Button but_nine=(Button)findViewById(R.id.but_nine);
	
	Button but_del=(Button)findViewById(R.id.but_del);
	Button but_clear=(Button)findViewById(R.id.but_clear);
	
	Button but_add=(Button)findViewById(R.id.but_add);//+
	Button but_minus=(Button)findViewById(R.id.but_minus);//-
	Button but_multiplied=(Button)findViewById(R.id.but_multiplied);//*
	Button but_divided=(Button)findViewById(R.id.but_divided);// /
	
	Button but_equal=(Button)findViewById(R.id.but_equal);
	
	Button but_point=(Button)findViewById(R.id.but_point);
	
	public String inputStr;
	public String outputStr;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but_one.setOnClickListener(this);
        but_two.setOnClickListener(this);
        but_three.setOnClickListener(this);
        but_four.setOnClickListener(this);
        but_five.setOnClickListener(this);
        but_six.setOnClickListener(this);
        but_seven.setOnClickListener(this);
        but_nine.setOnClickListener(this);
        but_eight.setOnClickListener(this);
        but_zero.setOnClickListener(this);
        but_point.setOnClickListener(this);
        
        but_del.setOnClickListener(this);
        but_clear.setOnClickListener(this);
        
        but_add.setOnClickListener(this);
        but_minus.setOnClickListener(this);
        but_multiplied.setOnClickListener(this);
        but_divided.setOnClickListener(this);
        
        but_equal.setOnClickListener(this);

    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.but_one:
		case R.id.but_two:
		case R.id.but_three:
		case R.id.but_four:
		case R.id.but_five:
		case R.id.but_six:
		case R.id.but_seven:
		case R.id.but_eight:
		case R.id.but_nine:
		case R.id.but_zero:
		case R.id.but_point:
			
			inputStr=inputStr+((Button)v).getText().toString();
			inputText.setText(inputStr);
			break;
		case R.id.but_add:
		case R.id.but_minus:
		case R.id.but_multiplied:
		case R.id.but_divided:
			inputStr=inputStr+" "+((Button)v).getText().toString()+" ";
			inputText.setText(inputStr);
			break;
		case R.id.but_del:
			inputStr=inputStr.substring(0, inputStr.length()-1);
			inputText.setText(inputStr);
			break;
		case R.id.but_clear:
			inputStr="";
			inputText.setText(inputStr);
			break;
		case R.id.but_equal:
		    OutputText.setText(outputStr);
			break;
		default:
			break;
		}
	}
	
	public void getResult(){
		
	}
    
    

   
}
