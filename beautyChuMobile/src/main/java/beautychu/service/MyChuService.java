package beautychu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import beautychu.dao.MyChuDao;

@Service
public class MyChuService {
  @Autowired MyChuDao myChuDao;
/*	
	public int getChuCount(int styleNumber){
		return myChuDao.getChuCount(styleNumber);
	}*/
	
}







