package kg.web_scm.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column Long id;
    @Column(name="product_name",nullable = false)
    private String name;
    @Column(name="price",nullable = false)
    private Integer price;
    @Column(name="bill_of_materials")
    private List<RawMaterials> rawMaterials;

}
