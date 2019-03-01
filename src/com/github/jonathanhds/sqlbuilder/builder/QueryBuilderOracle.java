package com.github.jonathanhds.sqlbuilder.builder;

import com.github.jonathanhds.sqlbuilder.DataBase;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class QueryBuilderOracle extends QueryBuilder {

    public QueryBuilderOracle(Connection connection) {
        super(DataBase.ORACLE, connection);
    }

    public QueryBuilderOracle(DataSource dataSource) throws SQLException {
        super(DataBase.ORACLE, dataSource);
    }
}
