package dev.malpish0n.notes.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.malpish0n.notes.model.Note;


@Repository
public
interface NoteRepository extends JpaRepository<Note, Long> {
    
}
