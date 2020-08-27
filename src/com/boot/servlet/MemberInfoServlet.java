package com.boot.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.boot.service.MemberInfoService;
import com.boot.service.impl.MemberInfoServiceImpl;
import com.boot.vo.MemberInfoVO;


@WebServlet("/ajax/member")
public class MemberInfoServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;
   private MemberInfoService miSer = new MemberInfoServiceImpl();
   private Gson aGson = new Gson();
   
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String json = request.getParameter("json");
      MemberInfoVO mi = aGson.fromJson(json, MemberInfoVO.class);
      PrintWriter pw = response.getWriter();
      json = aGson.toJson(miSer.selectMemberInfoList(mi));
      pw.write(json);
      
      
   }


   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
      doGet(request, response);
   }

}