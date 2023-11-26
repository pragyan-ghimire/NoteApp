package com.example.jetnoteapp.data

import com.example.jetnoteapp.model.Note

class NotesDataSource{

    fun loadNotes(): List<Note>{
        //dummy data
        return listOf(
            Note(
                title = "Do it",
                description = "You have always done things that you should be proud of. Hakuna Matata!"
            ),
            Note(
                title = "Power",
                description = "Power is one of the thing that you need the most. You should believe in yourself. You are worthy of your place."
            ),
            Note(
                title = "Consistency",
                description = "Consistency is one of the key to success. It resembles persistence. You will win when you try. You can do everything when you have will to do so."
            ),
        )
    }
}