package ma.sid.mlmecomv1;

import ma.sid.mlmecomv1.dao.CategoryRepository;
import ma.sid.mlmecomv1.dao.ProductRepository;
import ma.sid.mlmecomv1.entities.Category;
import ma.sid.mlmecomv1.entities.Product;
import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.Random;

@SpringBootApplication
public class MlmEcomV1Application implements CommandLineRunner {
 @Autowired
    private ProductRepository productRepository;
   @Autowired
    private CategoryRepository categoryRepository;
@Autowired
    private RepositoryRestConfiguration repositoryRestConfiguration;

    public static void main(String[] args) {
        SpringApplication.run(MlmEcomV1Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repositoryRestConfiguration.exposeIdsFor(Product.class,Category.class);

        categoryRepository.save(new Category(1L,"computers",null,"good Product",null));
        categoryRepository.save(new Category(2L,"Tablets",null,"good Product",null));
        categoryRepository.save(new Category(3L,"Smart phones",null,"good Product",null));
        System.out.println("Application working succesfully");
        Random rnd=new Random();
        categoryRepository.findAll().forEach(c->{
            for (int i=0;i<10 ;i++){
               if(c.getId()==1) {
                   Product p = new Product();
//                RandomString.make(3)
                   p.setName("Computer " + i);
                   p.setCurrentPrice(100 + rnd.nextInt(10000));
                   p.setAvailable(rnd.nextBoolean());
                   p.setPromotion(rnd.nextBoolean());
                   p.setSelected(rnd.nextBoolean());
                   p.setCategory(c);
                   p.setPhotoName("un.png");

                   productRepository.save(p);
               }else if (c.getId()==2){
                   Product p = new Product();
//                RandomString.make(3)
                   p.setName("Tablet " + i);
                   p.setCurrentPrice(100 + rnd.nextInt(10000));
                   p.setAvailable(rnd.nextBoolean());
                   p.setPromotion(rnd.nextBoolean());
                   p.setSelected(rnd.nextBoolean());
                   p.setCategory(c);
                   p.setPhotoName("une.png");
                   productRepository.save(p);
               }
               else if (c.getId()==3){
                   Product p = new Product();
//                RandomString.make(3)
                   p.setName("SmartPhone " + i);
                   p.setCurrentPrice(100 + rnd.nextInt(10000));
                   p.setAvailable(rnd.nextBoolean());
                   p.setPromotion(rnd.nextBoolean());
                   p.setSelected(rnd.nextBoolean());
                   p.setCategory(c);
                   p.setPhotoName("smart.png");
                   productRepository.save(p);
               }
            }
        });



    }


}
