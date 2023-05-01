package sg.edu.np.mad.madpractical;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.example.listactivity.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnFollow = findViewById(R.id.btnFollow);

        btnFollow.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {
                Button button = (Button) view;
                if (UserTest.Followed == false){
                    button.setText("Unfollow");
                    UserTest.Followed = true;
                    Toast.makeText(getApplicationContext(), "Followed", Toast.LENGTH_SHORT).show();
                }

                else {
                    button.setText("Follow");
                    UserTest.Followed = false;
                    Toast.makeText(getApplicationContext(), "Unfollowed", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}