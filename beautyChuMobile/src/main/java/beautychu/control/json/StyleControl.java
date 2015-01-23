package beautychu.control.json;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import beautychu.service.MyChuService;
import beautychu.service.ShopService;
import beautychu.service.StylePhotoService;
import beautychu.service.StyleService;

@Controller("json.styleControl")
@RequestMapping("/json/style")
public class StyleControl {
	// static Logger log = Logger.getLogger(ProductControl.class);
	static final int PAGE_DEFAULT_SIZE = 3;

	@Autowired
	StyleService styleService;
	@Autowired
	ShopService shopService;

	@Autowired
	StylePhotoService stylePhotoService;
	@Autowired
	MyChuService myChuService;
	
	@RequestMapping("/list")
	public Object list(@RequestParam(defaultValue = "1") int pageNo,
			@RequestParam(defaultValue = "3") int pageSize) throws Exception {

		if (pageSize <= 0)
			pageSize = PAGE_DEFAULT_SIZE;

		int maxPageNo = styleService.getMaxPageNo(pageSize);

		HashMap<String, Object> resultMap = new HashMap<>();

		if (pageNo <= 0)
			pageNo = 1;
		if (pageNo <= maxPageNo) {
			resultMap.put("status", "success");
			resultMap.put("currPageNo", pageNo);
			resultMap.put("maxPageNo", maxPageNo);
			resultMap.put("styleList", styleService.getList(pageNo, pageSize));
		} else {
			resultMap.put("status", "fail");
		}
		return resultMap;
	}
	
	
	
	@RequestMapping("/styledetail")
	public Object styledetail(int styleNo) throws Exception {

		HashMap<String, Object> resultMap = new HashMap<>();
		resultMap.put("style", styleService.getStyle(styleNo));
		resultMap.put("stylePhotoList", stylePhotoService.getStylePhotoList(styleNo));
		resultMap.put("shop", shopService.getShop(styleNo));
		resultMap.put("myChuCount", styleService.getChuCount(styleNo));
		return resultMap;
	}
}

























