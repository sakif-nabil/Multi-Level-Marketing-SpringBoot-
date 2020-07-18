package ma.sid.mlmecomv1.dao;

import ma.sid.mlmecomv1.entities.Category;
import ma.sid.mlmecomv1.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
