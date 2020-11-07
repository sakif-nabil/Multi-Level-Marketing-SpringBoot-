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
        String a="hello1234";

    }

    @Override
    public void run(String... args) throws Exception {
        repositoryRestConfiguration.exposeIdsFor(Product.class,Category.class);

        categoryRepository.save(new Category(1L,"Computers",null,"good Product",null));
        categoryRepository.save(new Category(2L,"Tablets",null,"good Product",null));
        categoryRepository.save(new Category(3L,"Smart phones",null,"good Product",null));
        categoryRepository.save(new Category(4L,"Accessoires",null,"good Product",null));
        categoryRepository.save(new Category(5L,"Cartables",null,"good Product",null));
        categoryRepository.save(new Category(6L,"T-shirts",null,"good Product",null));
        categoryRepository.save(new Category(7L,"Chaussures",null,"good Product",null));
        categoryRepository.save(new Category(8L,"Chemises",null,"good Product",null));
        categoryRepository.save(new Category(9L,"Parfum",null,"good Product",null));
        categoryRepository.save(new Category(10L,"Produits cosmetique",null,"good Product",null));
        categoryRepository.save(new Category(11L,"Enfants",null,"good Product",null));
        System.out.println("Application working succesfully");
        Random rnd=new Random();
        categoryRepository.findAll().forEach(c->{
            for (int i=0;i<9 ;i++){
               if(c.getId()==1) {
                   Product p = new Product();
//                RandomString.make(3)
                   p.setName("Computer " + i);
                   p.setCurrentPrice(100 + rnd.nextInt(10000));
                   p.setAvailable(rnd.nextBoolean());
                   p.setPromotion(rnd.nextBoolean());
                   p.setSelected(rnd.nextBoolean());
                   p.setCategory(c);
                   p.setPhotoName("Computer.png");

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
                   p.setPhotoName("Tablet.png");
                   productRepository.save(p);
               }
               else if (c.getId()==3){
                   Product p = new Product();
//                RandomString.make(3)
                   p.setName("Phone " + i);
                   p.setCurrentPrice(100 + rnd.nextInt(10000));
                   p.setAvailable(rnd.nextBoolean());
                   p.setPromotion(rnd.nextBoolean());
                   p.setSelected(rnd.nextBoolean());
                   p.setCategory(c);
                   p.setPhotoName("phone.png");
                   productRepository.save(p);
               }
               else if (c.getId()==4){
                   Product p = new Product();
//                RandomString.make(3)
                   p.setName("Accessoire " + i);
                   p.setCurrentPrice(100 + rnd.nextInt(10000));
                   p.setAvailable(rnd.nextBoolean());
                   p.setPromotion(rnd.nextBoolean());
                   p.setSelected(rnd.nextBoolean());
                   p.setCategory(c);
                   p.setPhotoName("Acces.png");
                   productRepository.save(p);
               }
               else if (c.getId()==5){
                   Product p = new Product();
//                RandomString.make(3)
                   p.setName("Cartable " + i);
                   p.setCurrentPrice(100 + rnd.nextInt(10000));
                   p.setAvailable(rnd.nextBoolean());
                   p.setPromotion(rnd.nextBoolean());
                   p.setSelected(rnd.nextBoolean());
                   p.setCategory(c);
                   p.setPhotoName("Cartable.png");
                   productRepository.save(p);
               }
               else if (c.getId()==6){
                   Product p = new Product();
//                RandomString.make(3)
                   p.setName("T-shirt " + i);
                   p.setCurrentPrice(100 + rnd.nextInt(10000));
                   p.setAvailable(rnd.nextBoolean());
                   p.setPromotion(rnd.nextBoolean());
                   p.setSelected(rnd.nextBoolean());
                   p.setCategory(c);
                   p.setPhotoName("shirt.png");
                   productRepository.save(p);
               }
               else if (c.getId()==7){
                   Product p = new Product();
//                RandomString.make(3)
                   p.setName("Chaussure " + i);
                   p.setCurrentPrice(100 + rnd.nextInt(10000));
                   p.setAvailable(rnd.nextBoolean());
                   p.setPromotion(rnd.nextBoolean());
                   p.setSelected(rnd.nextBoolean());
                   p.setCategory(c);
                   p.setPhotoName("Chaus.png");
                   productRepository.save(p);
               }
               else if (c.getId()==8){
                   Product p = new Product();
//                RandomString.make(3)
                   p.setName("Chemise " + i);
                   p.setCurrentPrice(100 + rnd.nextInt(10000));
                   p.setAvailable(rnd.nextBoolean());
                   p.setPromotion(rnd.nextBoolean());
                   p.setSelected(rnd.nextBoolean());
                   p.setCategory(c);
                   p.setPhotoName("Chemise.png");
                   productRepository.save(p);
               }
               else if (c.getId()==9){
                   Product p = new Product();
//                RandomString.make(3)
                   p.setName("Parfum " + i);
                   p.setCurrentPrice(100 + rnd.nextInt(10000));
                   p.setAvailable(rnd.nextBoolean());
                   p.setPromotion(rnd.nextBoolean());
                   p.setSelected(rnd.nextBoolean());
                   p.setCategory(c);
                   p.setPhotoName("Parfum.png");
                   productRepository.save(p);
               }
               else if (c.getId()==10){
                   Product p = new Product();
//                RandomString.make(3)
                   p.setName("cosmetique " + i);
                   p.setCurrentPrice(100 + rnd.nextInt(10000));
                   p.setAvailable(rnd.nextBoolean());
                   p.setPromotion(rnd.nextBoolean());
                   p.setSelected(rnd.nextBoolean());
                   p.setCategory(c);
                   p.setPhotoName("cosme.png");
                   productRepository.save(p);
               }
               else if (c.getId()==11){
                   Product p = new Product();
//                RandomString.make(3)
                   p.setName("Enfant " + i);
                   p.setCurrentPrice(100 + rnd.nextInt(10000));
                   p.setAvailable(rnd.nextBoolean());
                   p.setPromotion(rnd.nextBoolean());
                   p.setSelected(rnd.nextBoolean());
                   p.setCategory(c);
                   p.setPhotoName("Enfant.png");
                   productRepository.save(p);
               }
            }
        });



    }


}
