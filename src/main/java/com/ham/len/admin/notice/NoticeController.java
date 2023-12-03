package com.ham.len.admin.notice;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


import com.ham.len.commons.Pager;
import com.ham.len.humanresource.HumanResourceVO;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping("/notice/*")
public class NoticeController {

	@Autowired
	private NoticeService noticeService;
	
	
	
	@GetMapping("detail")
	public void getDetail(NoticeVO noticeVO,Model model) throws Exception{
		noticeVO=noticeService.getDetail(noticeVO);
		model.addAttribute("vo", noticeVO);
	}
	
	@GetMapping("list")
	public void getList(Pager pager,Model model) throws Exception{
		List<NoticeVO> ar=noticeService.getList(pager);
		model.addAttribute("list", ar);
	}
	
	@GetMapping("add")
	public void setAdd(NoticeVO noticeVO) throws Exception{
		
	}
	
	@PostMapping("add")
	public String setAdd(NoticeVO noticeVO,MultipartFile[] files) throws Exception{
		
		int result=noticeService.setAdd(noticeVO,files);
		
		return "redirect:/notice/list";
	}
	
	@GetMapping("update")
	public void setUpdate(NoticeVO noticeVO,Model model) throws Exception{
		noticeVO=noticeService.getDetail(noticeVO);
		
		model.addAttribute("vo", noticeVO);
	}
	
	@PostMapping("update")
	public String setUpdate(NoticeVO noticeVO) throws Exception{
		
		HumanResourceVO humanResourceVO=(HumanResourceVO)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		String id=humanResourceVO.getEmployeeID();
		noticeVO.setEmployeeID(id);
	
		int result=noticeService.setUpdate(noticeVO);
		
		return "redirect:/notice/list";
	}
	
	@PostMapping("delete")
	public String setDelete(@RequestParam(value = "deleteNoList[]",required = false) List<Long> deleteNoList,Model model) throws Exception{
		int result=0;
		if(deleteNoList!=null) {
			for(Long d: deleteNoList) {
				NoticeVO noticeVO=new NoticeVO();
				noticeVO.setNoticeNo(d);;
				result=noticeService.setDelete(noticeVO);
			}
		}
		model.addAttribute("result", result);
		
		return "commons/ajaxResult";
	}
	
	@GetMapping("deleteOne")
	public String setDelete(NoticeVO noticeVO,Model model) throws Exception{
		int result=noticeService.setDelete(noticeVO);
			
		model.addAttribute("result", result);
		
		return "redirect:./list";
	}
	
	@GetMapping("fileDown")
	public String fileDown(AttachmentVO attachmentVO,Model model)throws Exception{
		attachmentVO=noticeService.getFileDetail(attachmentVO);
		model.addAttribute("attachmentVO", attachmentVO);
		
		return "fileDownView";
	}
}
