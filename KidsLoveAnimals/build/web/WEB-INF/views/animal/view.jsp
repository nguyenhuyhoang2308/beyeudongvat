<%-- 
    Document   : list
    Created on : Jan 4, 2021, 9:53:15 AM
    Author     : NgNha
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:import url="../layout/header.jsp"></c:import>
<div class="row">
    <div class="col-lg-12">
        <ol class="breadcrumb">
            <li class="active">
                
                <i class="fa fa-dashboard"></i> Dashboard / View Animals
                
            </li>
        </ol>
    </div>
</div>

<div class="row">
    <div class="col-lg-12">
        <div class="card">
            <div class="card-header">
               <h3 class="card-title">
               
                   <i class="fa fa-tags"></i>  View Animals
                
               </h3>
            </div>
            
            <div class="card-block">
                <div class="table-responsive">
                    <table class="table table-striped table-bordered table-hover">
                        
                        <thead>
                            <tr>
                                <th> Animal ID: </th>
                                <th> Animal Name: </th>
                                <th> Animal Category </th>
                                <th> Animal Image: </th>
                                <th> Animal Video: </th>
                                <th> Animal Audio: </th>
                                <th> Product Delete: </th>
                                <th> Product Edit: </th>
                            </tr>
                        </thead>
                        
                        <tbody>
                            
<!--                            <tr>
                                <td>  </td>
                                <td>  </td>
                                <td>  </td>
                                <td>  <img src="" width="60" height="60"></td>
                                <td>  </td>
                                <td>  </td>
                                <td> 

                                     <a href="index.html?deleteAnimal=<?php echo $pro_id; ?>">

                                        <i class="fa fa-trash-o"></i> Delete

                                     </a> 

                                </td>
                                <td> 

                                     <a href="index.html?editAnimal=<?php echo $pro_id; ?>">

                                        <i class="fa fa-pencil"></i> Edit

                                     </a> 

                                </td>
                            </tr>-->
                            
                        </tbody>
                        
                    </table>
                    
                </div>
                
            </div>
            
        </div>
        
    </div>
    
</div>

<c:import url="../layout/footer.jsp"></c:import>
