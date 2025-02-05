package com.example.mynoteskeepingapp.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Notes_Database")
public class Notes {
    @PrimaryKey(autoGenerate = true)
    public int id;
    @ColumnInfo(name = "notes_title")
    public String notesTitle;
    @ColumnInfo(name = "notes_subtitle")
    public String notesSubTitle;
    @ColumnInfo(name = "notes_date")
    public String notesDate;
    @ColumnInfo(name = "notes")
    public String notes;
    @ColumnInfo(name = "notes_priority")
    public String notesPriority;

//    public Notes() {
//    }
//
//    public Notes(String notesTitle, String notesSubTitle, String notesDate, String notes, String notesPriority) {
//        this.notesTitle = notesTitle;
//        this.notesSubTitle = notesSubTitle;
//        this.notesDate = notesDate;
//        this.notes = notes;
//        this.notesPriority = notesPriority;
//    }
}
