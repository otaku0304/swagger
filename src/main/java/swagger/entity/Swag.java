package swagger.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "SAVE_SWAG")
public class Swag implements Serializable {
    @Id
    private String id;
    private String swagContent;
    private String user;
    private GenericDetails genericDetails;
}
