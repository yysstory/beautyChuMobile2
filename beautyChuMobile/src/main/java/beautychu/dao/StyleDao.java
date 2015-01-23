package beautychu.dao;

import java.util.List;
import java.util.Map;

import beautychu.domain.Style;

public interface StyleDao {
	
	  List<?> getList(Map<String,Object> params);
	  Style getStyle(int styleNumber);
	  int getChuCount(int no);
	  int totalSize();

	}