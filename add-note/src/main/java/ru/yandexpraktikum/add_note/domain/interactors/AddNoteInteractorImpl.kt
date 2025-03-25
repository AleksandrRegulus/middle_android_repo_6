package ru.yandexpraktikum.add_note.domain.interactors

import jakarta.inject.Inject
import ru.yandexpraktikum.core.domain.model.Note
import ru.yandexpraktikum.core.domain.repository.NotesRepository

class AddNoteInteractorImpl @Inject constructor(
    private val repository: NotesRepository
): AddNoteInteractor {
    override suspend fun invoke(note: Note) {
        repository.insertNote(note)
    }
}