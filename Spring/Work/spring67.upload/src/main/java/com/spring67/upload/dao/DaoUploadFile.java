package com.spring67.upload.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring67.upload.inf.IDaoUploadFile;
import com.spring67.upload.model.ModelUploadFile;

@Repository

public class DaoUploadFile implements IDaoUploadFile {
    // SLF4J Logging
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    org.apache.ibatis.session.SqlSession session;
    
    @Override
    public List<ModelUploadFile> getUploadFile(ModelUploadFile file) {
        return session.selectList("mapper.mysql.mapperUpload.getUploadFile",file);
    }

    @Override
    public int insertUploadFile(ModelUploadFile file) {
        session.insert("mapper.mysql.mapperUpload.insertUploadFile",file);
        return file.getUploadFileNo();
    }

    @Override
    public int insertUploadFileList(List<ModelUploadFile> files) {
        return session.insert("mapper.mysql.mapperUpload.insertUploadFileList",files);
    }

    @Override
    public int deleteUploadFile(ModelUploadFile file) {
        return session.insert("mapper.mysql.mapperUpload.deleteUploadFile",file);
    }
}
