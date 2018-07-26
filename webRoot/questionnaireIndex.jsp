<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%> 

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>



<!DOCTYPE html>
<html lang="zh-cn" class="no-js">
	<head>
		<meta charset="UTF-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"> 
		<meta name="viewport" content="width=device-width, initial-scale=1.0"> 
		<title>问卷调查</title>
		<meta name="description" content="A Collection of Page Transitions with CSS Animations" />
		<meta name="keywords" content="page transition, css animation, website, effect, css3, jquery" />
		<meta name="author" content="Codrops" />
		<link rel="shortcut icon" href="../favicon.ico"> 
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/default.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/multilevelmenu.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/component.css" />
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/animations.css" />
		<script src="${pageContext.request.contextPath}/js/modernizr.custom.js"></script>
		<script src="${pageContext.request.contextPath}/css/init.css"></script>
		<!-- <link rel="stylesheet" href="http://dreamsky.github.io/main/blog/common/init.css"> -->
		<script src="${pageContext.request.contextPath}/assets/js/jquery-1.8.1.min.js"></script>
		<!-- <script src="http://dreamsky.github.io/main/blog/common/jquery.min.js"></script> -->
		<!-- <script src="http://dreamsky.github.io/main/blog/common/init.js"></script> -->	
		<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/newstylecss.css"/>
		
		
		<script type="text/javascript">
		
		function answerCheck(cursel){
			
			curselPagenum = cursel;
		}
	
		
		
		</script>
		
	</head>
	<body>	

		<div class="pt-triggers">
			<button id="next_station" class="pt-touch-button">开始答题</button>
			<div id="dl-menu" class="dl-menuwrapper">
				<div class="footer-banner" style="position:absolute;bottom:-350px;left:-200px;width:728px; margin:30px auto"></div>
			</div><!-- /dl-menu-wrapper-->
		</div><!-- /triggers -->

		<form id="answerForm" action="${pageContext.request.contextPath }/answer/save" method="post" style="height: 100%;width: 100%">
		
			<div id="pt-main" class="pt-perspective">
				<div class="pt-page pt-page-1"><h1><span>A collection of</span>页面切换效果</h1>
					<div style="width: 100%;height: 100%">
					
						<div style="text"  class="clssweb"><h3> 声明:</h3></div>
						<div style="text"  class="clssweb2">您好：<br> &nbsp;&nbsp;&nbsp;&nbsp;非常感谢您在百忙之中填写问卷，请您根据自己的实际感受如实填写，本均采用可选匿名形式.
							<br>(本问卷共${fn:length(problemList)}题)！！<br><br>&nbsp;&nbsp;&nbsp;&nbsp;祝您身体健康，工作胜利!!
						</div>
						
					</div>
				</div>
				
					<c:forEach items="${problemList}" var="problem" varStatus="status">
						<div class="pt-page pt-page-${(status.index + 1)%6+1}"><h1><span>A collection of</span>页面切换效果</h1>
							<div style="text"  class="clssweb"><h3> 问题 ${status.index+1}：</h3></div><br>
				
							<div style="text"  class="clssweb2" >
								${problem.question}<br /><br /> 
								<label><input name="answerList[${status.index}].answer" title='${fn:split(problem.aanswer, "&&")[1]}' checked="checked" type="radio" value="a" />${fn:split(problem.aanswer, "&&")[0]}</label><br> 
								<label><input name="answerList[${status.index}].answer" title='${fn:split(problem.banswer, "&&")[1]}' type="radio" value="b" />${fn:split(problem.banswer, "&&")[0]} </label> <br>
								<label><input name="answerList[${status.index}].answer" title='${fn:split(problem.canswer, "&&")[1]}' type="radio" value="c" />${fn:split(problem.canswer, "&&")[0]}</label> <br>
								<c:if test="problem.danswer != null">
									<label><input name="answerList[${status.index}].answer" title='${fn:split(problem.danswer, "&&")[1]}' type="radio" value="d" />${fn:split(problem.danswer, "&&")[0]} </label> 
								</c:if>
								<input type="hidden" name="answerList[${status.index}].qaid" value="${qaids[status.index]}">
								<input type="hidden" name="answerList[${status.index}].uid" value="1">
								<input type="hidden" name="answerList[${status.index}].age" value="25">
								<input type="hidden" name="answerList[${status.index}].sex" value="0">
								<input type="hidden" name="answerList[${status.index}].openId" value="${openId }">
								
							</div>
				
						</div>
					</c:forEach>
					
 			
			<!--
				<div class="pt-page pt-page-4"><h1><span>A collection of</span>页面切换效果</h1></div>
				<div class="pt-page pt-page-5"><h1><span>A collection of</span>页面切换效果</h1></div>
				<div class="pt-page pt-page-6"><h1><span>A collection of</span>页面切换效果</h1></div>
 			-->				 
				 
			</div>
		
		</form>
		
		<div class="pt-message">
			<p>亲，你的浏览器不支持 CSS 动画，请使用 Chrome,Firefox,Safari 等浏览器浏览.</p>
		</div>
		<script src="${pageContext.request.contextPath}/js/jquery.dlmenu.js"></script>
		<script src="${pageContext.request.contextPath}/js/pagetransitions.js"></script>

	</body>
</html>
