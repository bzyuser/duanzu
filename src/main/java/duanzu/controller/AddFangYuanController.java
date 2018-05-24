package duanzu.controller;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import duanzu.service.AddFangyuanService;
import duanzu.util.FileHandleUtil;
import duanzu.util.NoteUtil;


@Controller
@RequestMapping("/pages/hotel/addfangyuan")
@SuppressWarnings("all")
public class AddFangYuanController {
	@Autowired
	private AddFangyuanService addFangyuanService;
	
	//上传房源
	@RequestMapping("/uploadFile.do")
	@ResponseBody
	public Map<String,Object> uploadFile(@RequestParam MultipartFile file,String houseId,String picType){
		String fileOldName = null;
        String fileNewName = null;
        Map map = new HashMap();
        try {
            if(file != null) {
                fileOldName = file.getOriginalFilename();
                //生成图爿新名称+文件扩展名
                fileNewName = NoteUtil.createId()+"."+ FilenameUtils.getExtension(fileOldName);
            }
            //调用工具类保存文件
            FileHandleUtil.uploadSpringMVCFile(file, "attachmentFile", fileNewName);
            //调用service并保存到数据库中
           boolean b = addFangyuanService.saveHousePicture(houseId, fileNewName,picType);
            /*if(b){
                map.put("result","上传成功");
            } else {
                map.put("result","上传失败");
            }*/
        } catch (Exception e) {
           System.out.println("上传失败");
           e.printStackTrace();
        }

        return map;
	}
	
	//保存房源基本信息
	@RequestMapping("/commit.do")
	@ResponseBody
	private Map<String,Object> commit(String weiyu,@RequestParam Map<String,Object> map){
		 Map<String,Object> resultMap = new HashMap();
		 map.put("facility", weiyu);
		 try {
			 resultMap = addFangyuanService.saveHouseInfo(map);
		} catch (SQLException e) {
			System.out.println("添加房屋信息失败，数据库异常");
			e.printStackTrace();
		}
		return resultMap;
	}
}
