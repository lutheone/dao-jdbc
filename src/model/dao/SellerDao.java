package model.dao;

import model.entities.Seller;
import model.entities.Department;

import java.util.List;

public interface SellerDao {

    void insert(model.entities.Seller obj);

    void update(model.entities.Seller obj);

    void deleteById(Integer id);

    Seller findById(Integer id);

    List<Seller> findAll();

    List<Seller> findByDepartment(model.entities.Department department);
}
