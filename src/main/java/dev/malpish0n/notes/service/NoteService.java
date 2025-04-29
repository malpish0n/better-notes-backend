package dev.malpish0n.notes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import dev.malpish0n.notes.model.Note;
import dev.malpish0n.notes.repository.NoteRepository;

@Service
public class NoteService {
    private final NoteRepository noteRepository;

    public NoteService(NoteRepository noteRepository) {
        this.noteRepository = noteRepository;
    }

    public List<Note> getAllNotes() {
        return noteRepository.findAll();
    }

    public Optional<Note> getNoteById(Long id) {
        return noteRepository.findById(id);
    }

    public Note createNote(Note note) {
    if (note.getTitle() == null || note.getTitle().isEmpty() ||
        note.getContent() == null || note.getContent().isEmpty()) {
        throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Title and content must not be empty");
    }
    return noteRepository.save(note);
}

    public void deleteNoteById(Long id) {
        noteRepository.deleteById(id);
    }

    public Note updateNote(Long id, Note updatedNote) {
        return noteRepository.findById(id)
                .map(existingNote -> {
                    existingNote.setTitle(updatedNote.getTitle());
                    existingNote.setContent(updatedNote.getContent());
                    return noteRepository.save(existingNote);
                })
                .orElseGet(() -> {
                    updatedNote.setId(id);
                    return noteRepository.save(updatedNote);
                });
    }
}

