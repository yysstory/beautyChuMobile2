package beautychu.control.json;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

@Controller("json.fileUploadControl")
@RequestMapping("/json")
public class FileUploadControl {
	@RequestMapping(value = "/uploadFile", method = RequestMethod.POST)
	@ResponseBody
	public String handleFileUpload(MultipartHttpServletRequest request)	throws Exception {
		Iterator<String> itrator = request.getFileNames();
	
		//파일이 여러개일 경우를 생각해서 itrator로 돌림
		while(itrator.hasNext()){
			
			MultipartFile multiFile = null;
			multiFile = request.getFile(itrator.next()); 
			try {
				//파일을 저장하는 코드
				String fileName = multiFile.getOriginalFilename();
				String fileuploadRealPath = request.getServletContext().getRealPath("/fileupload");
				System.out.println(fileName);
				System.out.println(fileuploadRealPath);
				byte[] bytes = multiFile.getBytes();
				File file = new File(fileuploadRealPath + "/"+System.currentTimeMillis()+fileName);
				BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream(file));
				stream.write(bytes);
				stream.close();
				
				//파일이름을 디비에 넣는 코드
				
			} catch (Exception e) {
				e.printStackTrace();
				throw new Exception("Error while loading the file");
			}
		}
		return "success";
	}
}


