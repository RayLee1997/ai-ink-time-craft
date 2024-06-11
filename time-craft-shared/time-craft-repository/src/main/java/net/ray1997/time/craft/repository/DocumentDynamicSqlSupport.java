package net.ray1997.time.craft.repository;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class DocumentDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: documents")
    public static final Document document = new Document();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: documents.id")
    public static final SqlColumn<Long> id = document.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: documents.uid")
    public static final SqlColumn<String> uid = document.uid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: documents.name")
    public static final SqlColumn<String> name = document.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: documents.type")
    public static final SqlColumn<String> type = document.type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: documents.group")
    public static final SqlColumn<String> group = document.group;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: documents.location")
    public static final SqlColumn<String> location = document.location;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: documents.status")
    public static final SqlColumn<Integer> status = document.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: documents.creator")
    public static final SqlColumn<String> creator = document.creator;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: documents.gmt_create")
    public static final SqlColumn<Date> gmtCreate = document.gmtCreate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: documents.gmt_modified")
    public static final SqlColumn<Date> gmtModified = document.gmtModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: documents.extensions")
    public static final SqlColumn<String> extensions = document.extensions;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: documents")
    public static final class Document extends AliasableSqlTable<Document> {
        public final SqlColumn<Long> id = column("id", JDBCType.BIGINT);

        public final SqlColumn<String> uid = column("uid", JDBCType.VARCHAR);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> type = column("type", JDBCType.VARCHAR);

        public final SqlColumn<String> group = column("group", JDBCType.VARCHAR);

        public final SqlColumn<String> location = column("location", JDBCType.VARCHAR);

        public final SqlColumn<Integer> status = column("status", JDBCType.INTEGER);

        public final SqlColumn<String> creator = column("creator", JDBCType.VARCHAR);

        public final SqlColumn<Date> gmtCreate = column("gmt_create", JDBCType.TIMESTAMP);

        public final SqlColumn<Date> gmtModified = column("gmt_modified", JDBCType.TIMESTAMP);

        public final SqlColumn<String> extensions = column("extensions", JDBCType.LONGVARCHAR);

        public Document() {
            super("documents", Document::new);
        }
    }
}