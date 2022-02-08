package com.example.springboot_ms_sql_con.repository;

import com.example.springboot_ms_sql_con.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by yeasin ali on 08/Feb/20.
 */

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}
