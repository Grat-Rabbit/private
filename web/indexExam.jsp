<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->

</head>

<body>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="row">
    <div id="left" class="col-md-6">
        <form action="<c:url value='/ExamServlet'/>" method="post">
            <input type="hidden" name="method" value="selectExam" id="studyFrom"/>

            <h2 style="margin-left:140px">欢迎同学们登录汇编程序在线考试系统</h2>
            <table border="0" width="70%" align="center">
                <tr>
                    <td>考场规则：</td>
                </tr>
                <tr height="15px"></tr>
                <tr>
                    <td>1.本套题总共有三种题型，有选择，有判断，有填空，有程序题，考试提交后马上可以得出客观题分数，至于程序题，待老师打分</td>
                </tr>
                <tr height="15px"></tr>
                <tr>
                    <td>2.遵循诚信考试的原则，希望同学们文明考试</td>
                </tr>
                <tr height="15px"></tr>
                <tr>
                    <td>3.题目并不难，希望同学们考出好成绩</td>
                </tr>
                <tr height="15px"></tr>
                <tr>
                    <td><input type="button" value="开始考试" onclick="start()"/></td>
                </tr>
            </table>
        </form>
        <script type="text/javascript">
            function start() {
                $("#studyFrom").submit();
            }
        </script>
    </div>

    <div id="right" class="col-md-6">
            <form action="<c:url value='/ExamServlet'/>" method="post" id="examFrom">
                <input type="hidden" name="method" value="selectExam"/>

                <h2 style="margin-left:140px">欢迎同学们登录汇编程序在线考试系统</h2>
                <table border="0" width="70%" align="center">
                    <tr>
                        <td>考场规则：</td>
                    </tr>
                    <tr height="15px"></tr>
                    <tr>
                        <td>1.本套题总共有三种题型，有选择，有判断，有填空，有程序题，考试提交后马上可以得出客观题分数，至于程序题，待老师打分</td>
                    </tr>
                    <tr height="15px"></tr>
                    <tr>
                        <td>2.遵循诚信考试的原则，希望同学们文明考试</td>
                    </tr>
                    <tr height="15px"></tr>
                    <tr>
                        <td>3.题目并不难，希望同学们考出好成绩</td>
                    </tr>
                    <tr height="15px"></tr>
                    <tr>
                        <td><input type="button" value="开始考试" onclick="start()"/></td>
                    </tr>
                </table>
            </form>
            <script type="text/javascript">
                function start() {
                    $('#examFrom').submit();
                }
            </script>
        </div>
</div>
</body>
</html>
