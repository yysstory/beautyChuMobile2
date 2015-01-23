package beautychu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import beautychu.dao.ShopDao;
import beautychu.domain.Shop;

@Service
public class ShopService {
  @Autowired ShopDao shopDao;

	
	public Shop getShop(int styleNumber){
		return shopDao.getShop(styleNumber);
	}
	
}







