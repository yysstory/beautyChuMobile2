package beautychu.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import beautychu.dao.StyleDao;
import beautychu.dao.StyleDetailDao;
import beautychu.domain.Style;
import beautychu.domain.StyleDetail;

@Service
public class StyleService {
  @Autowired StyleDao styleDao;
  @Autowired StyleDetailDao styleDetailDao;


	public List<?> getList(int pageNo, int pageSize) {
		HashMap<String, Object> paramMap = new HashMap<>();
		paramMap.put("startIndex", ((pageNo - 1) * pageSize));
		paramMap.put("pageSize", pageSize);

		return styleDao.getList(paramMap);
	}
	public int getMaxPageNo(int pageSize) {
		int totalSize = styleDao.totalSize();
		int maxPageNo = totalSize / pageSize;
		if ((totalSize % pageSize) > 0)
			maxPageNo++;
		return maxPageNo;
	}

	
	public Style getStyle(int styleNumber){
		return styleDao.getStyle(styleNumber);
	}
	
	
	public int getChuCount(int styleNumber){
		return styleDao.getChuCount(styleNumber);
	}
	
	public int getReviewCount(int styleNumber){
		return styleDao.getReviewCount(styleNumber);
	}
	
	public List<?> sytleReviewList(int styleNumber){
		return styleDao.sytleReviewList(styleNumber);
	}
	
}







