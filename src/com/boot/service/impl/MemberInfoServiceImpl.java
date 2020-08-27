package com.boot.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.boot.dao.MemberInfoDAO;
import com.boot.dao.impl.MemberInfoDAOImpl;
import com.boot.service.MemberInfoService;
import com.boot.servlet.InitServlet;
import com.boot.vo.MemberInfoVO;

public class MemberInfoServiceImpl implements MemberInfoService {
   private MemberInfoDAO miDao = new MemberInfoDAOImpl();
   
   public Map<String, Object> selectMemberInfoList(MemberInfoVO mi) {
      int page = mi.getPage();
      int startRowNum = (page-1)*10+1;
      int endRowNum = startRowNum + (10-1);
      mi.setStartRowNum(startRowNum);
      mi.setEndRowNum(endRowNum);
      
      List<MemberInfoVO> memberList = miDao.selectMemberInfoList(mi);
      int totalCount = miDao.selectTotalCount(mi);
      
      Map<String,Object> rMap = new HashMap<>();
      rMap.put("list", memberList);
      rMap.put("totalcnt", totalCount);
      return rMap;
   }
public static void main(String[] args) {
   InitServlet is = new InitServlet();
   is.init();
   MemberInfoService miSer = new MemberInfoServiceImpl();
   MemberInfoVO miVO = new MemberInfoVO();
   miVO.setPage(3);
   System.out.println(miSer.selectMemberInfoList(miVO));
}
}