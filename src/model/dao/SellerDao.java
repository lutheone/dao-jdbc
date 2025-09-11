package model.dao;

import model.entities.Seller;

import java.util.List;

public interface SellerDao {

    void insert(model.entities.Seller obj);

    void update(model.entities.Seller obj);

    void deleteById(Integer id);

    Seller findById(Integer id);

    List<model.entities.Seller> findAll();
}
