package dataAccess.jdbc;

import dataAccess.CategoryDao;
import entities.Category;

public class CategoryJdbcDao implements CategoryDao {
	public void add(Category category) {
		System.out.println("Kategori JDBC ile veritabanina eklendi");
	}
}
