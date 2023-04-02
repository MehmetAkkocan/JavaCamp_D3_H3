package src.dataAccess.category;

import src.entities.Category;

public class HibernateCategoryDao implements ICategoryDao{

    @Override
    public void addCategory(Category category) {
        System.out.println("Hibernate ile kategory eklendi! ->" + category.getCategoryName());
    }
    
}
