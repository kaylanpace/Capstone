<%@page contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*,workorder.WorkOrder"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
 
<html>
    <head>
    
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>ConstructionPal - Add Work Order</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    
    <!-- MetisMenu CSS -->
    <link href="bower_components/metisMenu/dist/metisMenu.min.css" rel="stylesheet">

    <!-- DataTables CSS -->
    <link href="bower_components/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.css" rel="stylesheet">

    <!-- DataTables Responsive CSS -->
    <link href="bower_components/datatables/media/css/jquery.dataTables.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/modern-business.css" rel="stylesheet">
    <link href="dist/css/sb-admin-2.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
 
    <body>

    <!-- Page Content -->
    <div class="container">

        <!-- Page Heading/Breadcrumbs -->
        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">Add Work Order</h1>
            </div>
        </div>
        <!-- /.row -->

        <!-- Content Row -->        
        <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            Work order information
                        </div>
                        <div class="panel-body">
                            <div class="row">
                                <div class="col-lg-6">
                                    <form role="form" method="POST" action="workorder">
                                        <!--  
                                        <div class="form-group">
                                            <label>Work Order ID</label>
                                            <input class="form-control" type="number" name="workorderId" placeholder="">
                                        </div>
                                        <div class="form-group">
                                            <label>Building ID</label>
                                            <input class="form-control" type="number" name="buildingId" placeholder="">
                                        </div>
                                        -->
                                        <div class="form-group">
                                            <label>Description</label>
                                            <input class="form-control" type="text" name="description" placeholder="">
                                        </div>
                                        <div class="form-group">
                                            <label>Person of Contact</label>
                                            <input class="form-control" type="text" name="POC" placeholder="">
                                        </div>
                                        <div class="form-group">
                                            <label>Priority Level</label>
                                            <input class="form-control" type="text" name="priorityLevel" placeholder="">
                                        </div>
                                        <div class="form-group">
                                            <label>Status</label>
                                            <input class="form-control" type="text" name="status" placeholder="">
                                        </div>
                                        <button type="submit" value="Add" class="btn btn-default">Submit</button>
                                        <button type="reset" class="btn btn-default">Reset</button>
                                    <!-- <input type="submit" value="Add" /> -->
                                    </form>
                                </div>
                                
                            </div>
                            <!-- /.row (nested) -->
                        </div>
                        <!-- /.panel-body -->
                    </div>
                    <!-- /.panel -->
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            

            <table id="workorderGrid" class="table table-striped table-bordered" cellspacing="0" width="100%">
                <thead>
                    <tr>
                    	<!--  
                        <th>Work Order ID</th>
                        <th>Building ID</th>
                        -->
                        <th>Description</th>
                        <th>Point of Contact</th>
                        <th>Priority Level</th>
                        <th>Status</th>
                    </tr>
                </thead>
                <tfoot>
                    <tr>
                        <!--  
                        <th>Work Order ID</th>
                        <th>Building ID</th>
                        -->
                        <th>Description</th>
                        <th>Point of Contact</th>
                        <th>Priority Level</th>
                        <th>Status</th>
                    </tr>
                </tfoot>
                    <%
                          @SuppressWarnings("unchecked")
                          List<WorkOrder> workorders = (List<WorkOrder>)request.getAttribute("workorders");
                           if (workorders != null) {
                            for (WorkOrder workorder : workorders) {
                          %>
                      <tr>
                            
                            <td>
                                    <%= workorder.getDescription() %>
                            </td>
                            <td>
                                    <%= workorder.getPOC() %>
                            </td>
                            <td>
                                    <%= workorder.getPriorityLevel() %>
                            </td>
                            <td>
                                    <%= workorder.getStatus() %>
                            </td>
                      </tr>
                      <%
                           }
                          %>
                          <%
                           }
                          %>
            </table>

        <hr>

    </div>
    <!-- /.container -->

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>       
        
    <!-- jQuery -->
    <script src="bower_components/jquery/dist/jquery.min.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

    <!-- Metis Menu Plugin JavaScript -->
    <script src="bower_components/metisMenu/dist/metisMenu.min.js"></script>

    <!-- DataTables JavaScript -->
    <script src="bower_components/datatables/media/js/jquery.dataTables.min.js"></script>
    <script src="bower_components/datatables-plugins/integration/bootstrap/3/dataTables.bootstrap.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="dist/js/sb-admin-2.js"></script>

    <!-- Dynamic Table JavaScript -->
    <script>
    $(document).ready(function() {
        $('#workorderGrid').dataTable();
    } );
    </script>
        
    </body>
 </html>