package dev.malpish0n.notes.controller;

import dev.malpish0n.notes.model.Note;
import dev.malpish0n.notes.service.NoteService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@RestController
@RequestMapping("/api/notes")
public class NoteController {

    private final NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @GetMapping
    public List<Note> getAllNotes() {
        return noteService.getAllNotes();
    }
    
    @PostMapping
    public Note createNote(@RequestBody Note note) {
        return noteService.createNote(note);
    }
}
