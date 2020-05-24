package its.com.authDemo.repositories;

import its.com.authDemo.models.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, String> {
    @Override
    void delete(Product deleted);
}