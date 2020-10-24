package com.kodilla.ecommercee.service;

import com.kodilla.ecommercee.GenericEntity;
import com.kodilla.ecommercee.dao.CartDao;
import com.kodilla.ecommercee.dao.OrderDao;
import com.kodilla.ecommercee.dao.ProductDao;
import com.kodilla.ecommercee.dao.UserDao;
import com.kodilla.ecommercee.domain.Cart;
import com.kodilla.ecommercee.domain.Order;
import com.kodilla.ecommercee.domain.Product;
import com.kodilla.ecommercee.domain.User;
import com.kodilla.ecommercee.repository.GenericEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DbService {
    @Autowired
    CartDao cartDao;

    @Autowired
    ProductDao productDao;

    @Autowired
    UserDao userDao;

    @Autowired
    OrderDao orderDao;

    @Autowired
    private GenericEntityRepository repository;

    public Cart saveCart(Cart cart) {
        return cartDao.save(cart);
    }

    public Order saveOrder(Order order) {
        return orderDao.save(order);
    }

    public Optional<List<Product>> getProductsByCartId(long cartId) {
        return productDao.findByCart_Id(cartId);
    }

    public Optional<User> findUserById(long userid) {
        return userDao.findById(userid);
    }

    public Optional<Cart> findCartById(long cartId) {
        return cartDao.findById(cartId);
    }

    public Product saveProduct(Product product) {
        return productDao.save(product);
    }

    public List<Product> getAllProducts() {
        return productDao.findAll();
    }
    public Optional<Product> getProduct (final Long id){
        return productDao.findById(id);
    }

    public void deleteProduct(final Long id){
        productDao.deleteById(id);
    }


}
