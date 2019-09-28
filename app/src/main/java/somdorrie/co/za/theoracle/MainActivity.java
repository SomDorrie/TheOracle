package somdorrie.co.za.theoracle;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    private String[] answersArray = {"I skipped that chapter in school",
            "I bet your guardian angel drinks because of you",
            "Let's discuss further over tacos",
            "I'll get back to you on that one",
            "That sounds like a question an alien would ask",
            "Definitely",
            "You wish",
            "Not on this planet",
            "Did you even try asking your grandmother?",
            "Alright I confess, I lied on my resume",
            "These types of questions are why you have no friends",
            "I don't know",
            "Have you tried consulting a witch?",
            "Look, I failed magic school, ok",
            "Sure, whatever",
            "I'm thinking of a number, what is it? See, it's not so easy",
            "Que sera sera",
            "Maybe",
            "There's a 50/50 chance",
            "Oh come on, I just laid down",
            "I met a guy once, he knew stuff, I'll give you his number",
            "For better results, try rubbing me next time",
            "You're my first, please spread the word",
            "Who told you about my powers?",
            "See this is why I dropped out of genie school",
            "This is too much pressure",
            "Be careful what you ask, I know everything",
            "Maybe its because you're an alien",
            "Ask your ancestors",
            "I've often wondered the same thing",
            "Oh yes oh yes, I know this one but I just can't remember",
            "Oh come on, I'm on a tea break",
            "Do I look like a crystal ball to you?",
            "My mom said I shouldn't talk to strangers",
            "Your questions made my shrink rich"};


    @SuppressLint("SetTextI18n")

    public void ask(View view) {
        EditText editText = findViewById(R.id.editText);
        TextView questionResponse = findViewById(R.id.questionResponse);
        TextView answerResponse = findViewById(R.id.answerResponse);

        int randomNum = new Random().nextInt(answersArray.length);
        if (editText.getText().toString().isEmpty()) {
            questionResponse.setText("Are you sure you have no questions?");
            answerResponse.setText("I am a fountain of wisdom, drink from me.");
        } else {
            questionResponse.setText("YOU ASKED: \n" + editText.getText().toString());
            answerResponse.setText("ANSWER: \n" + answersArray[randomNum]);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}