package id.apps.resto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class ProductActivity extends Activity {
	
    private CardArrayAdapter cardArrayAdapter;
    private ListView listView;
    private EditText edtQty;
    private int tempQty;
    private SubMenu mItem;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_product);
		
		listView = (ListView) findViewById(R.id.card_listView);

//        listView.addHeaderView(new View(this));
//        listView.addFooterView(new View(this));
		
//		edtQty = (EditText) findViewById(R.id.edtQty);
//		tempQty = Integer.parseInt(edtQty.getText().toString());
        
        cardArrayAdapter = new CardArrayAdapter(getApplicationContext(), R.layout.list_item_card);

        Card card = new Card("Soto Ayam", "5000", R.drawable.soto, 0);
        cardArrayAdapter.add(card);
        card = new Card("Ayam Goreng", "15000", R.drawable.ayam_goreng, 0);
        cardArrayAdapter.add(card);
        card = new Card("Ayam Bakar", "10000", R.drawable.ayam_bakar, 0);
        cardArrayAdapter.add(card);
        card = new Card("Nasi Padang", "17000", R.drawable.nasi_padang, 0);
        cardArrayAdapter.add(card);
        card = new Card("Kebab Turki", "13000", R.drawable.kebab, 0);
        cardArrayAdapter.add(card);
        card = new Card("Nasi Pecel", "16000", R.drawable.nasi_pecel, 0);
        cardArrayAdapter.add(card);
        card = new Card("Burger", "25000", R.drawable.burger, 0);
        cardArrayAdapter.add(card);
        card = new Card("Sop Buntut", "35000", R.drawable.sop_buntut, 0);
        cardArrayAdapter.add(card);
        card = new Card("Pizza", "50000", R.drawable.pizza, 0);
        cardArrayAdapter.add(card);
        
        listView.setAdapter(cardArrayAdapter);
	}
	
	public boolean onCreateOptionsMenu(Menu menu) {
		mItem = menu.addSubMenu(0, R.style.AppTheme, 0, null);
		//mItem.add("View Cart");
		mItem.setIcon(R.drawable.cart);
		mItem.getItem().setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS | MenuItem.SHOW_AS_ACTION_WITH_TEXT);
		return true;
	}
	
	public boolean onOptionsItemSelected(MenuItem item) {
		switch(item.getItemId()) {
			case R.style.AppTheme:
				//Toast.makeText(getBaseContext(), "Clicked", Toast.LENGTH_SHORT).show();
				Intent i_intent = new Intent(ProductActivity.this, OrderActivity.class);
				startActivity(i_intent);
				break;
		}
		
		return true;	
	}

}
