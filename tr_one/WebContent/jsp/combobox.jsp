<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
   
</head>
<body>
  <div style="margin:20px 0;">
        <a href="javascript:void(0)" class="easyui-linkbutton" onclick="$('#language').combobox('reload', 'combobox_data1.json')">LoadData</a>
    </div>
 
    <div class="easyui-panel" style="width:100%;max-width:400px;padding:30px 60px;">
        <div style="margin-bottom:20px">
            <input id="language" class="easyui-combobox" name="language" style="width:100%;" data-options="
                    valueField: 'id',
                    textField: 'text'
                    ">
        </div>
    </div>
</body>
</html>