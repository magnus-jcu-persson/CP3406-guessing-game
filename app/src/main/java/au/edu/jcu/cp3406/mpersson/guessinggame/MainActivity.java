package au.edu.jcu.cp3406.mpersson.guessinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Game game;
    private EditText vEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vEditText = (EditText) findViewById(R.id.editText);

        game = new Game();
    }

    public void checkGuess(View view) {
        int guess = Integer.getInteger(vEditText.getText().toString());
        boolean correct = game.check(guess);

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence text = "Incorrect! Try again.";
        if (correct){
            text = "Correct! YOU WIN!";
        }

        Toast.makeText(context, text, duration).show();

    }
}
