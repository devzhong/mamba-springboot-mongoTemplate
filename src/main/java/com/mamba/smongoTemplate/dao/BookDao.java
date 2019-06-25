package com.mamba.smongoTemplate.dao;

import com.mamba.smongoTemplate.entity.Book;
import org.springframework.stereotype.Repository;

/**
 * desc:
 * author:devzhong
 * Date:2019/6/25 15:01
 */
@Repository
public class BookDao extends MongoDbDao<Book> {
    @Override
    protected Class<Book> getEntityClass() {
        return Book.class;
    }
}
