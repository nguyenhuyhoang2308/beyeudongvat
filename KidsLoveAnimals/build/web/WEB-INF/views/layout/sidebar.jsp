<%-- 
    Document   : sidebar
    Created on : Jan 4, 2021, 1:30:09 PM
    Author     : NgNha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

    <nav class="navbar fixed-top">
        <div>

            <a href="index.php?dashboard" class="navbar-brand text-center">WELCOME ADMIN</a>

        </div>

        <ul class="nav navbar-right top-nav">

            <li class="nav-item">

                <a class="nav-link" href="index.php?user_profile=<?php echo $admin_id; ?>">

                    <i class="fas fa-user"></i> Admin name

                </a>

            </li>
            
            <li class="nav-item">

                <a class="nav-link" href="logout.php">

                    <i class="fas fa-power-off"></i> Log Out

                </a>

            </li>

        </ul>

        <ul class="navbar-nav float-left side-nav">
            <li class="nav-item">
                <a class="nav-link" href="index.php?dashboard">

                    <i class="fab fa-dashcube"></i> Dashboard

                </a>

            </li>

            <li class="nav-item">
                <a class="nav-link" href="#" data-toggle="collapse" data-target="#products">

                    <i class="fa fa-fw fa-tag"></i> Animals
                    <i class="fa fa-fw fa-caret-down"></i>

                </a>

                <ul id="products" class="collapse">
                    <li><!-- li begin -->
                        <a href="addAnimal"> Add Animal </a>
                    </li>
                    <li>
                        <a href="animal-view.html"> View Animal </a>
                    </li>
                </ul>

            </li>

            <li class="nav-item">
                <a class="nav-link" href="#" data-toggle="collapse" data-target="#p_cat">

                    <i class="fa fa-fw fa-edit"></i> Animal Categories
                    <i class="fa fa-fw fa-caret-down"></i>

                </a>

                <ul id="p_cat" class="collapse"><!-- collapse begin -->
                    <li><!-- li begin -->
                        <a href="index.html?addCategoty"> Add Animal Category </a>
                    </li>
                    <li>
                        <a href="index.html?viewCategory"> View Animal Categories </a>
                    </li>
                </ul>

            </li>

            <li class="nav-item">
                <a class="nav-link" href="#" data-toggle="collapse" data-target="#users">

                    <i class="fa fa-fw fa-users"></i> Users
                    <i class="fa fa-fw fa-caret-down"></i>

                </a>

                <ul id="users" class="collapse"><!-- collapse begin -->
                    <li>
                        <a href="index.html?addUser"> Add User </a>
                    </li>
                    <li>
                        <a href="index.html?viewUser"> View Users </a>
                    </li>
                    <li>
                        <a href="index.html?userProfile=<?php echo $admin_id; ?>"> Edit User Profile </a>
                    </li>
                </ul>

            </li>

        </ul>

    </nav>
