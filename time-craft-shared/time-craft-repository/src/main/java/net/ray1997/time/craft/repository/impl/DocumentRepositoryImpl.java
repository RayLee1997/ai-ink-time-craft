package net.ray1997.time.craft.repository.impl;

import jakarta.annotation.Resource;
import net.ray1997.time.craft.repository.DocumentRepository;
import net.ray1997.time.craft.repository.entity.Document;
import net.ray1997.time.craft.repository.mapper.DocumentMapper;
import org.springframework.stereotype.Repository;

@Repository
public class DocumentRepositoryImpl implements DocumentRepository {

    @Resource
    private DocumentMapper documentMapper;

    @Override
    public void save(Document document) {

    }
}
