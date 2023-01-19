import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="imfc.db";
    public static final String TABLE_NAME="user_registeration";
    public static final String COL_1="ID";
    public static final String COL_2="username";
    public static final String COL_3="password";
    public static final String COL_4="cnfpassword";
    public static final String COL_5="phno";
    public static final String COL_6="email";

    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE user_registeration(ID INTEGER PRIMARY KEY ,username TEXT, password TEXT,cnfpassword TEXT,phno TEXT,email TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(" DROP TABLE IF EXISTS "+ TABLE_NAME);
        onCreate(db);
    }
    public int addUser(String userid ,String username, String password, String cnfpassword,String phno,String mail){
        SQLiteDatabase db= this.getWritableDatabase();
        ContentValues c=new ContentValues();
        c.put("userid",userid);
        c.put("username",username);
        c.put("password",password);
        c.put("cnfpassword",cnfpassword);
        c.put("phno",phno);
        c.put("email",mail);
        long res= db.insert("user_registeration",null, c);
        if(res==-1)
            return 0;
        else
            return 1;

    }
    public boolean checkUser(String userid, String password){
        String columns=(COL_1);
        SQLiteDatabase db= getReadableDatabase();
        String  selection= COL_2 + "+?" + "and " + COL_3+"=?";
        String[] selectionArgs={userid,password};
        Cursor cursor=db.query(TABLE_NAME, new String[]{columns},selection,selectionArgs,null,null,null);
        int count=cursor.getCount();
        cursor.close();
        db.close();
        if(count>0)
            return true;
        else
            return false;
    }
    public boolean checkemail(String email) {
        SQLiteDatabase SDB = this.getReadableDatabase();
        Cursor cursor = SDB.rawQuery("select * from user_registeration where email=?", new String[]{email});
        if (cursor.getCount() > 0) {
            return false;
        } else return true;
    }
}
