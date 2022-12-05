package mall.domain;

import mall.domain.OrderPlaced;
import mall.고객Application;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Order_table")
@Data

public class Order  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private Integer qty;

    @PostPersist
    public void onPostPersist(){


        OrderPlaced orderPlaced = new OrderPlaced(this);
        orderPlaced.publishAfterCommit();

    }

    public static OrderRepository repository(){
        OrderRepository orderRepository = 고객Application.applicationContext.getBean(OrderRepository.class);
        return orderRepository;
    }






}
