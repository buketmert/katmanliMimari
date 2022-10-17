package dataAccess.hibernate;

import dataAccess.CategoryDao;
import entities.Category;


public class CategoryHibernateDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Kategori Hibernate ile veritabanina eklendi");
    }
}
