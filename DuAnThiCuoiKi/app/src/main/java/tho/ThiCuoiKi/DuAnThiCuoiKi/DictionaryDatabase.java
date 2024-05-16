package tho.ThiCuoiKi.DuAnThiCuoiKi;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DictionaryDatabase extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "dictionary.db";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_NAME = "dictionary";
    private static final String COLUMN_ID = "_id";
    private static final String COLUMN_WORD = "word";
    private static final String COLUMN_DEFINITION = "definition";

    public DictionaryDatabase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_NAME + " (" +
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_WORD + " TEXT, " +
                COLUMN_DEFINITION + " TEXT)";

        db.execSQL(query);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    public void addWord(String word, String definition) {
        SQLiteDatabase db = this.getWritableDatabase();
        addWord(db, word, definition);
        db.close();
    }

    private void addWord(SQLiteDatabase db, String word, String definition) {
        ContentValues values = new ContentValues();
        values.put(COLUMN_WORD, word);
        values.put(COLUMN_DEFINITION, definition);

        db.insert(TABLE_NAME, null, values);
    }

    public String getDefinition(String word) {
        SQLiteDatabase db = this.getReadableDatabase();

        String[] columns = {COLUMN_DEFINITION};
        String selection = COLUMN_WORD + " = ?";
        String[] selectionArgs = {word};

        Cursor cursor = db.query(TABLE_NAME, columns, selection, selectionArgs, null, null, null);

        if (cursor != null && cursor.moveToFirst()) {
            int columnIndex = cursor.getColumnIndex(COLUMN_DEFINITION);
            if (columnIndex >= 0) {
                String definition = cursor.getString(columnIndex);
                cursor.close();
                return definition;
            }
            cursor.close();
        }

        return null;
    }

    public String lookupWord(String word) {
        String definition = getDefinition(word);
        if (definition != null) {
            return "Definition of " + word + ": " + definition;
        } else {
            return "No definition found for " + word;
        }
    }
}