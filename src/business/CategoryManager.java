package business;


import java.util.ArrayList;
import java.util.List;

import dataAccess.CategoryDao;
import entities.Category;
import log.BaseLogger;

public class CategoryManager {
    private CategoryDao categoryDao;

    private BaseLogger[] loggers;
    private List<Category> categories = new ArrayList<Category>();



    public CategoryManager(CategoryDao categoryDao, BaseLogger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }
    public void add(Category category) throws Exception {
        for (Category category1 : categories) {
            if (category1.getCategoryName().equals(category.getCategoryName())) {
                throw new Exception(
                        "Girdiginiz kategori mevcut. Lutfen farkli bir kategori giriniz");
            }
        }
        categories.add(category);
        categoryDao.add(category);

        for (BaseLogger logger : loggers) {
            logger.log(category.getCategoryName());
        }

    }


}
