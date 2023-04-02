package src.dataAccess.category;

import src.entities.Category;

public class JdbcCategoryDao implements ICategoryDao {

    @Override
    public void addCategory(Category category) {
        System.out.println("Jdbc ile kategori eklendi! -> "+category.getCategoryName());
    }
    
}
