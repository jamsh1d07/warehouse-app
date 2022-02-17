package uz.pdp.entity.attachment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.entity.Product;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Attachment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Integer size;

    @Column(nullable = false)
    private String contentType;

    @Column(nullable = false)
    private Boolean active;

    @ManyToOne
    private Product product;

    @ManyToOne
    private AttachmentContent attachmentContent;

}
