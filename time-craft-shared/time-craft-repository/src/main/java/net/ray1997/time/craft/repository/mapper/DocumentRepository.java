package net.ray1997.time.craft.repository.mapper;

import net.ray1997.time.craft.client.dto.DocumentQuery;
import net.ray1997.time.craft.entity.Document;
import org.apache.ibatis.annotations.*;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;

import java.util.Date;
import java.util.List;

@Mapper
public interface DocumentRepository {

    @Results(id = "DocumentResult",
             value = {
                     @Result(property = "id",
                             column = "id",
                             javaType = Integer.class
                     ),
                     @Result(property = "name",
                             column = "name",
                             javaType = String.class
                     ),
                     @Result(property = "type",
                             column = "type",
                             javaType = String.class
                     ),
                     @Result(property = "group",
                             column = "group",
                             javaType = String.class
                     ),
                     @Result(property = "location",
                             column = "location",
                             javaType = String.class
                     ),
                     @Result(property = "status",
                             column = "status",
                             javaType = Integer.class
                     ),
                     @Result(property = "extension",
                             column = "extension",
                             javaType = String.class
                     ),
                     @Result(property = "gmtCreate",
                             column = "gmtCreate",
                             javaType = Date.class
                     ),
                     @Result(property = "gmtModified",
                             column = "gmtModified",
                             javaType = Date.class
                     )
             }
    )
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    List<Document> list(DocumentQuery query);

    @Select("SELECT * FROM documents WHERE id = #{id}")
    @Results({
            @Result(property = "userSex",
                    column = "user_sex",
                    javaType = String.class
            )
    }
    )
    Document get(Long id);

    @Insert("INSERT INTO documents(name,type,user_sex) VALUES" + "(#{name}, " + "#{type}, #{userSex})"
    )
    void insert(Document document);

    @Update("UPDATE documents SET userName=#{userName},nick_name=#{nickName} "
            + "WHERE id =#{id}"
    )
    void update(Document document);

    @Delete("DELETE FROM documents WHERE id =#{id}")
    void delete(Long id);
}
