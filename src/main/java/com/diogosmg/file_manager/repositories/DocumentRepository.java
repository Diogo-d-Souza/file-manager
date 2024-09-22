package com.diogosmg.file_manager.repositories;

import com.diogosmg.file_manager.entities.Document;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DocumentRepository extends JpaRepository<Document, UUID> {
}
