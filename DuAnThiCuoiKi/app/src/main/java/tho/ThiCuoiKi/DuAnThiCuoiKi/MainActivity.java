package tho.thicuoiki.duanthicuoiki;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    private EditText editTextWord;
    private Button buttonSearch;
    private TextView textViewDefinition;
    private DictionaryDatabase dictionaryDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextWord = findViewById(R.id.editTextWord);
        buttonSearch = findViewById(R.id.buttonSearch);
        textViewDefinition = findViewById(R.id.textViewDefinition);
        dictionaryDatabase = new DictionaryDatabase(this);
        dictionaryDatabase.addWord("dog", "Con Chó");
        dictionaryDatabase.addWord("bird", "Con Chim");
        dictionaryDatabase.addWord("hourse", "Con Ngựa");
        dictionaryDatabase.addWord("fly", "Bay");
        dictionaryDatabase.addWord("bee", "Con ong");
        dictionaryDatabase.addWord("cat", " Một Con Mèo");
        dictionaryDatabase.addWord("one", "Số 1");
        dictionaryDatabase.addWord("two", "Số 2");
        dictionaryDatabase.addWord("three", "Số 3");
        dictionaryDatabase.addWord("four", "Số 4");
        dictionaryDatabase.addWord("five", "Số 5");
        dictionaryDatabase.addWord("six", "Số 6");
        dictionaryDatabase.addWord("seven", "Số 7");
        dictionaryDatabase.addWord("eight", "Số 8");
        dictionaryDatabase.addWord("nine", "Số 9");
        dictionaryDatabase.addWord("ten", "Số 10");
        dictionaryDatabase.addWord("eleven", "Số 11");
        dictionaryDatabase.addWord("twelve", "Số 12");
        dictionaryDatabase.addWord("thirteen", "Số 13");
        dictionaryDatabase.addWord("fourteen", "Số 14");
        dictionaryDatabase.addWord("fifteen", "Số 15");
        dictionaryDatabase.addWord("sixteen", "Số 16");
        dictionaryDatabase.addWord("seventeen", "Số 17");
        dictionaryDatabase.addWord("eighteen", "Số 18");
        dictionaryDatabase.addWord("nineteen", "Số 19");
        dictionaryDatabase.addWord("twenty", "Số 20");
        dictionaryDatabase.addWord("twenty-one", "Số 21");
        dictionaryDatabase.addWord("twenty-two", "Số 22");
        dictionaryDatabase.addWord("twenty-three", "Số 23");
        dictionaryDatabase.addWord("twenty-four", "Số 24");
        dictionaryDatabase.addWord("twenty-five", "Số 25");
        dictionaryDatabase.addWord("twenty-six", "Số 26");
        dictionaryDatabase.addWord("twenty-seven", "Số 27");
        dictionaryDatabase.addWord("twenty-eight", "Số 28");
        dictionaryDatabase.addWord("twenty-nine", "Số 29");
        dictionaryDatabase.addWord("thirty", "Số 30");
        dictionaryDatabase.addWord("thirty-one", "Số 31");
        dictionaryDatabase.addWord("thirty-two", "Số 32");
        dictionaryDatabase.addWord("thirty-three", "Số 33");
        dictionaryDatabase.addWord("thirty-four", "Số 34");
        dictionaryDatabase.addWord("thirty-five", "Số 35");
        dictionaryDatabase.addWord("thirty-six", "Số 36");
        dictionaryDatabase.addWord("thirty-seven", "Số 37");
        dictionaryDatabase.addWord("thirty-eight", "Số 38");
        dictionaryDatabase.addWord("thirty-nine", "Số 39");
        dictionaryDatabase.addWord("forty", "Số 40");
        dictionaryDatabase.addWord("forty-one", "Số 41");
        dictionaryDatabase.addWord("forty-two", "Số 42");
        dictionaryDatabase.addWord("forty-three", "Số 43");
        dictionaryDatabase.addWord("forty-four", "Số 44");
        dictionaryDatabase.addWord("forty-five", "Số 45");
        dictionaryDatabase.addWord("forty-six", "Số 46");
        dictionaryDatabase.addWord("forty-seven", "Số 47");
        dictionaryDatabase.addWord("forty-eight", "Số 48");
        dictionaryDatabase.addWord("forty-nine", "Số 49");
        dictionaryDatabase.addWord("fifty", "Số 50");
        dictionaryDatabase.addWord("fifty-one", "Số 51");
        dictionaryDatabase.addWord("fifty-two", "Số 52");
        dictionaryDatabase.addWord("fifty-three", "Số 53");
        dictionaryDatabase.addWord("fifty-four", "Số 54");
        dictionaryDatabase.addWord("fifty-five", "Số 55");
        dictionaryDatabase.addWord("fifty-six", "Số 56");
        dictionaryDatabase.addWord("fifty-seven", "Số 57");
        dictionaryDatabase.addWord("fifty-eight", "Số 58");
        dictionaryDatabase.addWord("fifty-nine", "Số 59");
        dictionaryDatabase.addWord("sixty", "Số 60");
        dictionaryDatabase.addWord("sixty-one", "Số 61");
        dictionaryDatabase.addWord("sixty-two", "Số 62");
        dictionaryDatabase.addWord("sixty-three", "Số 63");
        dictionaryDatabase.addWord("sixty-four", "Số 64");
        dictionaryDatabase.addWord("sixty-five", "Số 65");
        dictionaryDatabase.addWord("sixty-six", "Số 66");
        dictionaryDatabase.addWord("sixty-seven", "Số 67");
        dictionaryDatabase.addWord("sixty-eight", "Số 68");
        dictionaryDatabase.addWord("sixty-nine", "Số 69");
        dictionaryDatabase.addWord("seventy", "Số 70");
        dictionaryDatabase.addWord("seventy-one", "Số 71");
        dictionaryDatabase.addWord("seventy-two", "Số 72");
        dictionaryDatabase.addWord("seventy-three", "Số 73");
        dictionaryDatabase.addWord("seventy-four", "Số 74");
        dictionaryDatabase.addWord("seventy-five", "Số 75");
        dictionaryDatabase.addWord("seventy-six", "Số 76");
        dictionaryDatabase.addWord("seventy-seven", "Số 77");
        dictionaryDatabase.addWord("seventy-eight", "Số 78");
        dictionaryDatabase.addWord("seventy-nine", "Số 79");
        dictionaryDatabase.addWord("eighty", "Số 80");
        dictionaryDatabase.addWord("eighty-one", "Số 81");
        dictionaryDatabase.addWord("eighty-two", "Số 82");
        dictionaryDatabase.addWord("eighty-three", "Số 83");
        dictionaryDatabase.addWord("eighty-four", "Số 84");
        dictionaryDatabase.addWord("eighty-five", "Số 85");
        dictionaryDatabase.addWord("eighty-six", "Số 86");
        dictionaryDatabase.addWord("eighty-seven", "Số 87");
        dictionaryDatabase.addWord("eighty-eight", "Số 88");
        dictionaryDatabase.addWord("eighty-nine", "Số 89");
        dictionaryDatabase.addWord("ninety", "Số 90");
        dictionaryDatabase.addWord("ninety-one", "Số 91");
        dictionaryDatabase.addWord("ninety-two", "Số 92");
        dictionaryDatabase.addWord("ninety-three", "Số 93");
        dictionaryDatabase.addWord("ninety-four", "Số 94");
        dictionaryDatabase.addWord("ninety-five", "Số 95");
        dictionaryDatabase.addWord("ninety-six", "Số 96");
        dictionaryDatabase.addWord("ninety-seven", "Số 97");
        dictionaryDatabase.addWord("ninety-eight", "Số 98");
        dictionaryDatabase.addWord("ninety-nine", "Số 99");
        dictionaryDatabase.addWord("one hundred", "Số 100");




        buttonSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String word = editTextWord.getText().toString().trim();
                String definition = dictionaryDatabase.getDefinition(word);

                if (definition != null) {
                    textViewDefinition.setText(definition);
                } else {
                    textViewDefinition.setText("Definition not found");
                }
            }
        });
    }
}