package net.ray1997.time.craft.repository;

import jakarta.annotation.Generated;
import java.sql.JDBCType;
import java.util.Date;
import org.mybatis.dynamic.sql.AliasableSqlTable;
import org.mybatis.dynamic.sql.SqlColumn;

public final class DocumentPODynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: document")
    public static final DocumentPO documentPO = new DocumentPO();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: document.id")
    public static final SqlColumn<Long> id = documentPO.id;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: document.uid")
    public static final SqlColumn<String> uid = documentPO.uid;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: document.name")
    public static final SqlColumn<String> name = documentPO.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: document.type")
    public static final SqlColumn<String> type = documentPO.type;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: document.group")
    public static final SqlColumn<String> group = documentPO.group;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: document.location")
    public static final SqlColumn<String> location = documentPO.location;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: document.status")
    public static final SqlColumn<Integer> status = documentPO.status;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: document.creator")
    public static final SqlColumn<String> creator = documentPO.creator;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: document.gmt_create")
    public static final SqlColumn<Date> gmtCreate = documentPO.gmtCreate;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: document.gmt_modified")
    public static final SqlColumn<Date> gmtModified = documentPO.gmtModified;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source field: document.extensions")
    public static final SqlColumn<String> extensions = documentPO.extensions;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: document")
    public static final class DocumentPO extends AliasableSqlTable<DocumentPO> {
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

        public DocumentPO() {
            super("document", DocumentPO::new);
        }
    }
}