package id.apps.resto;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class OrderActivity extends Activity {
	
	private TextView txtObjDateOrder;
	private Calendar objCalendar;
	private DateFormat format;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_order);
		
		objCalendar = Calendar.getInstance();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");  
		txtObjDateOrder = (TextView) findViewById(R.id.txtObjDateOrder);
		txtObjDateOrder.setText(format.format(objCalendar.getTime()));
	}

	
}
