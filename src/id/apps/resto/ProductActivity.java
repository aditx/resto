package id.apps.resto;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

public class ProductActivity extends Activity {
	
    private CardArrayAdapter cardArrayAdapter;
    private ListView listView;
    private EditText edtQty;
    private int tempQty;

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
        card = new Card("Ayam Bakar", "10000", R.drawable.ayam_goreng, 0);
        cardArrayAdapter.add(card);
        card = new Card("Ayam Suwir", "7000", R.drawable.ayam_goreng, 0);
        cardArrayAdapter.add(card);
        card = new Card("Kebab Turki", "13000", R.drawable.kebab, 0);
        cardArrayAdapter.add(card);
        card = new Card("Ala Padang", "16000", R.drawable.ayam_goreng, 0);
        cardArrayAdapter.add(card);
        card = new Card("Burger", "25000", R.drawable.ayam_goreng, 0);
        cardArrayAdapter.add(card);
        card = new Card("Sop Buntut", "35000", R.drawable.ayam_goreng, 0);
        cardArrayAdapter.add(card);
        card = new Card("Pizza", "50000", R.drawable.ayam_goreng, 0);
        cardArrayAdapter.add(card);
        
        listView.setAdapter(cardArrayAdapter);
	}

}
