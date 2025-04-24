package dev.malpish0n.repository;
import dev.malpish0n.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
interface NoteRepository extends JpaRepository<Note, Long> {
    
}
