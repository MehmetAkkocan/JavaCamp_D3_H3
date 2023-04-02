package src.business.category;

import java.util.ArrayList;
import java.util.List;

import src.core.logging.ILogger;
import src.dataAccess.category.ICategoryDao;
import src.entities.Category;

public class CategoryManager implements ICategoryManager {

    public static List<String> categoryList = new ArrayList<>();

    private ICategoryDao categoryDao;
    private ILogger[] loggers;

    public CategoryManager(ICategoryDao categoryDao, ILogger[] loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    @Override
    public void addCategory(Category category) throws Exception {
        for (String element : categoryList) {
            if (category.getCategoryName() == element) {
                throw new Exception("Kurs ismi tekrar edemez!");
            }
        }
        categoryList.add(category.getCategoryName());
        categoryDao.addCategory(category);
        for (ILogger logger : loggers) {
            logger.log(category.getCategoryName());
        }
    }

}
