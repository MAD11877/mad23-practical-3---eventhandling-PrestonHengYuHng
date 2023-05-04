package sg.edu.np.mad.madpractical;
import android.content.DialogInterface;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import java.util.Random;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import com.example.listactivity.R;

public class ListActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);


            ImageView image = findViewById(R.id.clickImage);
            image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(ListActivity.this);
                builder.setTitle("Profile");
                builder.setMessage("MADness");
                builder.setCancelable(true);
                builder.setNegativeButton("CLOSE", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {

                    }
                });
                builder.setPositiveButton("VIEW", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                        Random random = new Random();
                        int randomNumber = random.nextInt(90000000) + 10000000;
                        Intent view = new Intent(ListActivity.this, MainActivity.class);
                        view.putExtra("Random Number", randomNumber);
                        startActivity(view);

                    }
                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });





    }

}
