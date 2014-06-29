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
                <div class="col-md-8">
                    <div class="box box-warning">
                        <div class="box-header">
                            <h3 class="box-title">Client Add</h3>
                        </div>
                        <!-- /.box-header -->
                        <div class="box-body">


                            <s:form action="clientAddHandle" method="POST">

                                <div class="form-group">
                                    <label class="control-label">clientId</label>

                                    <div class="controls">
                                        <s:textfield cssClass="form-control large" name="clients.clientId"/>
                                        <span class="help-inline"></span>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="control-label">clientSecret</label>

                                    <div class="controls">
                                        <s:textfield cssClass="form-control large" name="clients.clientSecret"/>
                                        <span class="help-inline"></span>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="control-label">redirectUri</label>

                                    <div class="controls">
                                        <s:textfield cssClass="form-control large" name="clients.redirectUri"/>
                                        <span class="help-inline"></span>
                                    </div>
                                </div>

                                <div class="form-group">
                                    <label class="control-label">clientName</label>

                                    <div class="controls">
                                        <s:textfield cssClass="form-control large" name="clients.clientName"/>
                                        <span class="help-inline"></span>
                                    </div>
                                </div>

                                <div class="form-actions">
                                    <s:submit cssClass="btn btn-info" value="Add" />
                                </div>
                            </s:form>

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