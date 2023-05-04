package sg.edu.np.mad.madpractical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.listactivity.R;

public class MessageGroup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message_group);

        Button grp1Button = findViewById(R.id.Grp1);
        grp1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.Grp1){
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame, new Group1Fragment()).commit();
                }
            }
        });

        Button grp2Button = findViewById(R.id.Grp2);
        grp2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.Grp2){
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame, new Group2Fragment()).commit();
                }
            }
        });


    }
}