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
	
	Button but_add=(Button)findViewById(R.id.but_add);
	Button but_minus=(Button)findViewById(R.id.but_minus);
	Button but_multiplied=(Button)findViewById(R.id.but_multiplied);
	Button but_divided=(Button)findViewById(R.id.but_divided);
	
	Button but_equal=(Button)findViewById(R.id.but_equal);
	
	Button but_point=(Button)findViewById(R.id.but_point);
	
	
	private String str="";
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case :
			
			break;

		default:
			break;
		}
	}
    
    

   
}
