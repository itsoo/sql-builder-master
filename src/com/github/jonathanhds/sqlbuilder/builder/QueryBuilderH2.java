package com.github.jonathanhds.sqlbuilder.builder;

import com.github.jonathanhds.sqlbuilder.DataBase;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class QueryBuilderH2 extends QueryBuilder {

    public QueryBuilderH2(Connection connection) {
        super(DataBase.H2, connection);
    }

    public QueryBuilderH2(DataSource dataSource) throws SQLException {
        super(DataBase.H2, dataSource);
    }
}
