package kg.web_scm.service;

import kg.web_scm.entity.OrderPurchase;
import kg.web_scm.model.PurchaseModel;

import java.util.List;

public interface OrderPurchaseService {
    List<OrderPurchase> getAll();

    OrderPurchase getById(Long id);

    OrderPurchase create(PurchaseModel purchaseModel);

    OrderPurchase update(OrderPurchase orderPurchase);

    OrderPurchase deleteById(Long id);
}

