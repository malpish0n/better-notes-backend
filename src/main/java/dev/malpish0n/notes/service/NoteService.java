package dev.malpish0n.notes.service;

import dev.malpish0n.notes.model.Note;
import dev.malpish0n.notes.repository.NoteRepository;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

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

