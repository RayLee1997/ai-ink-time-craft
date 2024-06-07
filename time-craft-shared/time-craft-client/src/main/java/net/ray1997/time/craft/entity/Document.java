package net.ray1997.time.craft.entity;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * document entity
 */
@Builder
@Data
public class Document implements Serializable {

    private Integer id;
    private String name;

    private String type;
    private String group;

    /**
     * file location
     */
    private String location;
    private Integer status;

    /**
     * json map
     */
    private String extension;
    private Date gmtCreate;
    private Date gmtModified;
}
