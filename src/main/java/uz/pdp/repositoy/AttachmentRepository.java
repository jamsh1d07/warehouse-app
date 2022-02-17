package uz.pdp.repositoy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.pdp.entity.attachment.Attachment;

@Repository
public interface AttachmentRepository extends JpaRepository<Attachment,Integer> {

}
