package mariam.hashash.popup;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity{
ConstraintLayout c;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c=(ConstraintLayout)findViewById(R.id.Co);
    }

    public void Popup_menu(View view) {
        PopupMenu popupMenu = new PopupMenu(MainActivity.this,view);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
            if (item.getItemId() == R.id.red_id){
                    c.setBackgroundColor(Color.RED);
            }else  if (item.getItemId() == R.id.green_id){
                c.setBackgroundColor(Color.GREEN);
            } else if (item.getItemId() == R.id.blue_id){
                c.setBackgroundColor(Color.BLUE);
                }
                return false;
            }

        });
        popupMenu.inflate(R.menu.main_menu);
        popupMenu.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);

        MenuItem item=menu.findItem(R.id.green_id);
        item.setVisible(false);
        return super.onCreateOptionsMenu(menu);
    }
}
