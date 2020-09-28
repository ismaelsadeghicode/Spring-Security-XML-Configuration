<%@page import="net.dpco.crm.core.client.service.BaseAsyncCallback"%>
<%@page pageEncoding="UTF-8"%>
<html>
<script type="text/javascript">
	function goMainView()
	{
		var url = window.location.href;
		window.location.href = url.replace("403.jsp", "");
	}
</script>
<body onload="setTimeout(goMainView,5000);">
	<div>
	<h1><%=BaseAsyncCallback.MSG_403%></h1>
	<h2>برای دسترسی به این بخش، لطفاً وارد سامانه شوید</h2>
	</div>
</body>
</html>