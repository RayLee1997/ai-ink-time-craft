package net.ray1997.time.craft.repository;

import static net.ray1997.time.craft.repository.DocumentPODynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

import jakarta.annotation.Generated;
import java.util.List;
import java.util.Optional;
import net.ray1997.time.craft.repository.entity.DocumentPO;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.CommonCountMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonDeleteMapper;
import org.mybatis.dynamic.sql.util.mybatis3.CommonUpdateMapper;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface DocumentPOMapper extends CommonCountMapper, CommonDeleteMapper, CommonUpdateMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: document")
    BasicColumn[] selectList = BasicColumn.columnList(id, uid, name, type, group, location, status, creator, gmtCreate, gmtModified, extensions);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: document")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="row.id", before=false, resultType=Long.class)
    int insert(InsertStatementProvider<DocumentPO> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: document")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="DocumentPOResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="uid", property="uid", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.VARCHAR),
        @Result(column="group", property="group", jdbcType=JdbcType.VARCHAR),
        @Result(column="location", property="location", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER),
        @Result(column="creator", property="creator", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_create", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_modified", property="gmtModified", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="extensions", property="extensions", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<DocumentPO> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: document")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("DocumentPOResult")
    Optional<DocumentPO> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: document")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, documentPO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: document")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, documentPO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: document")
    default int deleteByPrimaryKey(Long id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: document")
    default int insert(DocumentPO row) {
        return MyBatis3Utils.insert(this::insert, row, documentPO, c ->
            c.map(uid).toProperty("uid")
            .map(name).toProperty("name")
            .map(type).toProperty("type")
            .map(group).toProperty("group")
            .map(location).toProperty("location")
            .map(status).toProperty("status")
            .map(creator).toProperty("creator")
            .map(gmtCreate).toProperty("gmtCreate")
            .map(gmtModified).toProperty("gmtModified")
            .map(extensions).toProperty("extensions")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: document")
    default int insertSelective(DocumentPO row) {
        return MyBatis3Utils.insert(this::insert, row, documentPO, c ->
            c.map(uid).toPropertyWhenPresent("uid", row::getUid)
            .map(name).toPropertyWhenPresent("name", row::getName)
            .map(type).toPropertyWhenPresent("type", row::getType)
            .map(group).toPropertyWhenPresent("group", row::getGroup)
            .map(location).toPropertyWhenPresent("location", row::getLocation)
            .map(status).toPropertyWhenPresent("status", row::getStatus)
            .map(creator).toPropertyWhenPresent("creator", row::getCreator)
            .map(gmtCreate).toPropertyWhenPresent("gmtCreate", row::getGmtCreate)
            .map(gmtModified).toPropertyWhenPresent("gmtModified", row::getGmtModified)
            .map(extensions).toPropertyWhenPresent("extensions", row::getExtensions)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: document")
    default Optional<DocumentPO> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, documentPO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: document")
    default List<DocumentPO> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, documentPO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: document")
    default List<DocumentPO> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, documentPO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: document")
    default Optional<DocumentPO> selectByPrimaryKey(Long id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: document")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, documentPO, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: document")
    static UpdateDSL<UpdateModel> updateAllColumns(DocumentPO row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(uid).equalTo(row::getUid)
                .set(name).equalTo(row::getName)
                .set(type).equalTo(row::getType)
                .set(group).equalTo(row::getGroup)
                .set(location).equalTo(row::getLocation)
                .set(status).equalTo(row::getStatus)
                .set(creator).equalTo(row::getCreator)
                .set(gmtCreate).equalTo(row::getGmtCreate)
                .set(gmtModified).equalTo(row::getGmtModified)
                .set(extensions).equalTo(row::getExtensions);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: document")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(DocumentPO row, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(uid).equalToWhenPresent(row::getUid)
                .set(name).equalToWhenPresent(row::getName)
                .set(type).equalToWhenPresent(row::getType)
                .set(group).equalToWhenPresent(row::getGroup)
                .set(location).equalToWhenPresent(row::getLocation)
                .set(status).equalToWhenPresent(row::getStatus)
                .set(creator).equalToWhenPresent(row::getCreator)
                .set(gmtCreate).equalToWhenPresent(row::getGmtCreate)
                .set(gmtModified).equalToWhenPresent(row::getGmtModified)
                .set(extensions).equalToWhenPresent(row::getExtensions);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: document")
    default int updateByPrimaryKey(DocumentPO row) {
        return update(c ->
            c.set(uid).equalTo(row::getUid)
            .set(name).equalTo(row::getName)
            .set(type).equalTo(row::getType)
            .set(group).equalTo(row::getGroup)
            .set(location).equalTo(row::getLocation)
            .set(status).equalTo(row::getStatus)
            .set(creator).equalTo(row::getCreator)
            .set(gmtCreate).equalTo(row::getGmtCreate)
            .set(gmtModified).equalTo(row::getGmtModified)
            .set(extensions).equalTo(row::getExtensions)
            .where(id, isEqualTo(row::getId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", comments="Source Table: document")
    default int updateByPrimaryKeySelective(DocumentPO row) {
        return update(c ->
            c.set(uid).equalToWhenPresent(row::getUid)
            .set(name).equalToWhenPresent(row::getName)
            .set(type).equalToWhenPresent(row::getType)
            .set(group).equalToWhenPresent(row::getGroup)
            .set(location).equalToWhenPresent(row::getLocation)
            .set(status).equalToWhenPresent(row::getStatus)
            .set(creator).equalToWhenPresent(row::getCreator)
            .set(gmtCreate).equalToWhenPresent(row::getGmtCreate)
            .set(gmtModified).equalToWhenPresent(row::getGmtModified)
            .set(extensions).equalToWhenPresent(row::getExtensions)
            .where(id, isEqualTo(row::getId))
        );
    }
}