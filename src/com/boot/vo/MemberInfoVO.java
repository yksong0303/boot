package com.boot.vo;

import lombok.Data;

@Data
public class MemberInfoVO {
   private int rNum;
   private int miNum;
   private String miName;
   private String miId;
   
   private int startRowNum;
   private int endRowNum;
   private int page;

}