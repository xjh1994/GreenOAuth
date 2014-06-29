<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s" %>
<!-- Left side column. contains the logo and sidebar -->
<aside class="left-side sidebar-offcanvas">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
        <!-- Sidebar user panel -->
        <div class="user-panel">
            <div class="pull-left image">
                <img src="/assets/img/avatar3.png" class="img-circle" alt="User Image"/>
            </div>
            <div class="pull-left info">
                <p>Hello, ZTS</p>

                <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
            </div>
        </div>
        <!-- search form -->
        <%--<form Action="#" method="get" class="sidebar-form">--%>
        <%--<div class="input-group">--%>
        <%--<input type="text" name="q" class="form-control" placeholder="Search..."/>--%>
        <%--<span class="input-group-btn">--%>
        <%--<button type='submit' name='seach' id='search-btn' class="btn btn-flat"><i--%>
        <%--class="fa fa-search"></i></button>--%>
        <%--</span>--%>
        <%--</div>--%>
        <%--</form>--%>
        <!-- /.search form -->
        <!-- sidebar menu: : style can be found in sidebar.less -->
        <ul class="sidebar-menu">
            <li class="active">
                <a href="<s:action namespace="/admin" name="index"></s:action> ">

                    <i class="fa fa-dashboard"></i> <span>Dashboard</span>
                </a>
            </li>

            <li class="treeview">
                <a href="#">
                    <i class="fa fa-bar-chart-o"></i>
                    <span>Clients</span>
                    <i class="fa fa-angle-left pull-right"></i>
                </a>
                <ul class="treeview-menu">
                    <li><a href="<s:url namespace="/admin" action="clientList"/>">
                        <i class="fa fa-angle-double-right"></i>Client List</a>
                    </li>
                    <li>
                        <s:a namespace="/admin" action="clientAdd">
                            <i class="fa fa-angle-double-right"></i>Add Client
                        </s:a>

                    </li>
                    <li><a href="charts/inline.html"><i class="fa fa-angle-double-right"></i> Inline charts</a></li>
                </ul>
            </li>


        </ul>
    </section>
    <!-- /.sidebar -->
</aside>
