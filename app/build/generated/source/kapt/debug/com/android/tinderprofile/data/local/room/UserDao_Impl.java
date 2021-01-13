package com.android.tinderprofile.data.local.room;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class UserDao_Impl implements UserDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Result> __insertionAdapterOfResult;

  private final EntityDeletionOrUpdateAdapter<Result> __updateAdapterOfResult;

  public UserDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfResult = new EntityInsertionAdapter<Result>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `user_table` (`user_id`,`phone_number`,`user_status`,`profile_image`,`medium`,`thumbnail`,`first`,`last`,`title`,`age`,`date`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Result value) {
        stmt.bindLong(1, value.getUserID());
        if (value.getPhone() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPhone());
        }
        if (value.getStatus() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getStatus());
        }
        final Picture _tmpPicture = value.getPicture();
        if(_tmpPicture != null) {
          if (_tmpPicture.getLarge() == null) {
            stmt.bindNull(4);
          } else {
            stmt.bindString(4, _tmpPicture.getLarge());
          }
          if (_tmpPicture.getMedium() == null) {
            stmt.bindNull(5);
          } else {
            stmt.bindString(5, _tmpPicture.getMedium());
          }
          if (_tmpPicture.getThumbnail() == null) {
            stmt.bindNull(6);
          } else {
            stmt.bindString(6, _tmpPicture.getThumbnail());
          }
        } else {
          stmt.bindNull(4);
          stmt.bindNull(5);
          stmt.bindNull(6);
        }
        final Name _tmpName = value.getName();
        if(_tmpName != null) {
          if (_tmpName.getFirst() == null) {
            stmt.bindNull(7);
          } else {
            stmt.bindString(7, _tmpName.getFirst());
          }
          if (_tmpName.getLast() == null) {
            stmt.bindNull(8);
          } else {
            stmt.bindString(8, _tmpName.getLast());
          }
          if (_tmpName.getTitle() == null) {
            stmt.bindNull(9);
          } else {
            stmt.bindString(9, _tmpName.getTitle());
          }
        } else {
          stmt.bindNull(7);
          stmt.bindNull(8);
          stmt.bindNull(9);
        }
        final Dob _tmpDob = value.getDob();
        if(_tmpDob != null) {
          stmt.bindLong(10, _tmpDob.getAge());
          if (_tmpDob.getDate() == null) {
            stmt.bindNull(11);
          } else {
            stmt.bindString(11, _tmpDob.getDate());
          }
        } else {
          stmt.bindNull(10);
          stmt.bindNull(11);
        }
      }
    };
    this.__updateAdapterOfResult = new EntityDeletionOrUpdateAdapter<Result>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `user_table` SET `user_id` = ?,`phone_number` = ?,`user_status` = ?,`profile_image` = ?,`medium` = ?,`thumbnail` = ?,`first` = ?,`last` = ?,`title` = ?,`age` = ?,`date` = ? WHERE `user_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Result value) {
        stmt.bindLong(1, value.getUserID());
        if (value.getPhone() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPhone());
        }
        if (value.getStatus() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getStatus());
        }
        final Picture _tmpPicture = value.getPicture();
        if(_tmpPicture != null) {
          if (_tmpPicture.getLarge() == null) {
            stmt.bindNull(4);
          } else {
            stmt.bindString(4, _tmpPicture.getLarge());
          }
          if (_tmpPicture.getMedium() == null) {
            stmt.bindNull(5);
          } else {
            stmt.bindString(5, _tmpPicture.getMedium());
          }
          if (_tmpPicture.getThumbnail() == null) {
            stmt.bindNull(6);
          } else {
            stmt.bindString(6, _tmpPicture.getThumbnail());
          }
        } else {
          stmt.bindNull(4);
          stmt.bindNull(5);
          stmt.bindNull(6);
        }
        final Name _tmpName = value.getName();
        if(_tmpName != null) {
          if (_tmpName.getFirst() == null) {
            stmt.bindNull(7);
          } else {
            stmt.bindString(7, _tmpName.getFirst());
          }
          if (_tmpName.getLast() == null) {
            stmt.bindNull(8);
          } else {
            stmt.bindString(8, _tmpName.getLast());
          }
          if (_tmpName.getTitle() == null) {
            stmt.bindNull(9);
          } else {
            stmt.bindString(9, _tmpName.getTitle());
          }
        } else {
          stmt.bindNull(7);
          stmt.bindNull(8);
          stmt.bindNull(9);
        }
        final Dob _tmpDob = value.getDob();
        if(_tmpDob != null) {
          stmt.bindLong(10, _tmpDob.getAge());
          if (_tmpDob.getDate() == null) {
            stmt.bindNull(11);
          } else {
            stmt.bindString(11, _tmpDob.getDate());
          }
        } else {
          stmt.bindNull(10);
          stmt.bindNull(11);
        }
        stmt.bindLong(12, value.getUserID());
      }
    };
  }

  @Override
  public Object insertUsers(final List<Result> users, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfResult.insert(users);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object updateUser(final Result users, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfResult.handle(users);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public List<Result> getUsers() {
    final String _sql = "SELECT * FROM user_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfUserID = CursorUtil.getColumnIndexOrThrow(_cursor, "user_id");
      final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone_number");
      final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "user_status");
      final int _cursorIndexOfLarge = CursorUtil.getColumnIndexOrThrow(_cursor, "profile_image");
      final int _cursorIndexOfMedium = CursorUtil.getColumnIndexOrThrow(_cursor, "medium");
      final int _cursorIndexOfThumbnail = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbnail");
      final int _cursorIndexOfFirst = CursorUtil.getColumnIndexOrThrow(_cursor, "first");
      final int _cursorIndexOfLast = CursorUtil.getColumnIndexOrThrow(_cursor, "last");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfAge = CursorUtil.getColumnIndexOrThrow(_cursor, "age");
      final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
      final List<Result> _result = new ArrayList<Result>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Result _item;
        final int _tmpUserID;
        _tmpUserID = _cursor.getInt(_cursorIndexOfUserID);
        final String _tmpPhone;
        _tmpPhone = _cursor.getString(_cursorIndexOfPhone);
        final String _tmpStatus;
        _tmpStatus = _cursor.getString(_cursorIndexOfStatus);
        final Picture _tmpPicture;
        if (! (_cursor.isNull(_cursorIndexOfLarge) && _cursor.isNull(_cursorIndexOfMedium) && _cursor.isNull(_cursorIndexOfThumbnail))) {
          final String _tmpLarge;
          _tmpLarge = _cursor.getString(_cursorIndexOfLarge);
          final String _tmpMedium;
          _tmpMedium = _cursor.getString(_cursorIndexOfMedium);
          final String _tmpThumbnail;
          _tmpThumbnail = _cursor.getString(_cursorIndexOfThumbnail);
          _tmpPicture = new Picture(_tmpLarge,_tmpMedium,_tmpThumbnail);
        }  else  {
          _tmpPicture = null;
        }
        final Name _tmpName;
        if (! (_cursor.isNull(_cursorIndexOfFirst) && _cursor.isNull(_cursorIndexOfLast) && _cursor.isNull(_cursorIndexOfTitle))) {
          final String _tmpFirst;
          _tmpFirst = _cursor.getString(_cursorIndexOfFirst);
          final String _tmpLast;
          _tmpLast = _cursor.getString(_cursorIndexOfLast);
          final String _tmpTitle;
          _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
          _tmpName = new Name(_tmpFirst,_tmpLast,_tmpTitle);
        }  else  {
          _tmpName = null;
        }
        final Dob _tmpDob;
        if (! (_cursor.isNull(_cursorIndexOfAge) && _cursor.isNull(_cursorIndexOfDate))) {
          final int _tmpAge;
          _tmpAge = _cursor.getInt(_cursorIndexOfAge);
          final String _tmpDate;
          _tmpDate = _cursor.getString(_cursorIndexOfDate);
          _tmpDob = new Dob(_tmpAge,_tmpDate);
        }  else  {
          _tmpDob = null;
        }
        _item = new Result(_tmpUserID,_tmpPhone,_tmpStatus,_tmpPicture,_tmpName,_tmpDob);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
