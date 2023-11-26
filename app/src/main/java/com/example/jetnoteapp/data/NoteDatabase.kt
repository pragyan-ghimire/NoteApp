package com.example.jetnoteapp.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.jetnoteapp.model.Note
import com.example.jetnoteapp.util.DateConverter
import com.example.jetnoteapp.util.UUIDConverter

@Database(entities = [Note::class], version = 1, exportSchema = false)
@TypeConverters(DateConverter::class,UUIDConverter::class)
abstract class NoteDatabase: RoomDatabase() {
    abstract fun noteDao():NoteDatabaseDao
}