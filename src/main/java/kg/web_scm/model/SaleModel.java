package kg.web_scm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaleModel {
    private Integer productQuantity;
    private Long productId;
    private Long userId;
}
