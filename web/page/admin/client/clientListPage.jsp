<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>GreenOAuth | Application</title>

    <s:include value="../header.jsp"></s:include>
</head>
<body class="skin-blue">
<s:include value="../headerNavbar.jsp"></s:include>
<div class="wrapper row-offcanvas row-offcanvas-left">


    <s:include value="../sideNavbar.jsp"></s:include>

    <!-- Right side column. Contains the navbar and content of the page -->
    <aside class="right-side">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <h1>
                Dashboard
                <small>GreenOAuth</small>
            </h1>
            <ol class="breadcrumb">
                <li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
                <li class="active">Clients</li>
            </ol>
        </section>

        <!-- Main content -->
        <section class="content">

            <div class="row">
                <div class="col-md-12">
                    <div class="box box-warning">
                        <div class="box-header">
                            <h3 class="box-title">Clients List</h3>
                        </div>
                        <!-- /.box-header -->
                        <div class="box-body">

                            <table
                                    class="table table-striped table-bordered table-hover">
                                <thead>
                                <tr>
                                    <th>clientId</th>
                                    <th>clientName</th>
                                    <th>clientSecret</th>
                                    <th>action</th>

                                </tr>
                                </thead>
                                <tbody id="cache_table">
                                <s:iterator value="clientsList" var="client">
                                    <tr align="center">
                                        <th><s:property value="#client.clientId"/></th>
                                        <th><s:property value="#client.clientName"/></th>
                                        <th><s:property value="#client.clientSecret"/></th>
                                        <th>
                                            &nbsp;
                                            <s:a namespace="/admin" action="clientEdit">
                                                <s:param name="clientId" value="#client.clientId"/>
                                                Edit
                                            </s:a>
                                            &nbsp; |&nbsp;
                                            <s:a namespace="/admin" action="clientDelHandle">
                                                <s:param name="clientId" value="#client.clientId"/>
                                                Delete
                                            </s:a>
                                            &nbsp;
                                        </th>
                                    </tr>
                                </s:iterator>
                                </tbody>


                            </table>


                        </div>
                    </div>
                </div>
            </div>


        </section>
        <!-- /.content -->
    </aside>
    <!-- /.right-side -->
</div>
<!-- ./wrapper -->

<s:include value="../footer.jsp"></s:include>


</body>
</html>