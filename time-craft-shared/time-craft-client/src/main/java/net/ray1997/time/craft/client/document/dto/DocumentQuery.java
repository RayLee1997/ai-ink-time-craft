package net.ray1997.time.craft.client.document.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Builder
@Data
public class DocumentQuery implements Serializable {

    private String name;

    private String status;

}
