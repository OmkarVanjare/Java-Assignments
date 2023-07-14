<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
</head>
<body>
	<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Form</title>
    <link rel="stylesheet" href="Form.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
</head>

<body>
    <div class="container">
        <div class="header">Registration Form</div>
        <div class="body">
            <form action="Home.jsp" method="post">
                <div class="row">
                    <div class="body col-6">
                        <input type="text" class="form-control" placeholder="First name" name ="F_name">
                    </div>
                    <div class="body col-6">
                        <input type="text" class="form-control" placeholder="Last name" name ="L_name">
                    </div>
                </div>
                <div class="row">
                    <div class="body col-6">
                        <input type="text" class="form-control" placeholder="Email ID" name="email">
                    </div>
                    <div class="body col-6">
                        <input type="password" class="form-control" placeholder="Password" name = "password">
                    </div>
                </div>

                <div class="row">
                    <div class="body col-6">
                        <label for="inputCity">City</label>
                        <input type="text" class="form-control" id="inputCity">
                    </div>
                    <div class="body col-6">
                        <label for="inputState">State</label>
                        <select name="inputState" class="form-control">
                            <option selected>Choose...</option>
                            <option value = "Maharashtra">Maharashtra</option>
                            <option value = "Delhi">Delhi</option>
                            <option value = "Chennai">Chennai</option>
                            <option value = "Banglore">Banglore</option>
                            <option value = "Punjab">Punjab</option>
                        </select>
                    </div>
                </div>
                <div class="row">
                    <div class="col">
                        <label for="inputHobbies">Hobblies</label>
                        <div class="row">
                            <div class="col-12">
                                <div class="hob col-3">Cricket:<input type="checkbox" name="inputHobbies1" value="Cricket"></div>
                                <div class="hob col-3">Football:<input type="checkbox" name="inputHobbies2"value="Football"></div>
                                <div class="hob col-3">Hockey:<input type="checkbox" name="inputHobbies3"value="Hockey"></div>
                                <div class="hob col-3">Volleyball:<input type="checkbox" name="inputHobbies4"value="Volleyball"></div>
                            </div>
                        </div>
                        
                    </div>
                </div>
                <div class="row">
                    <div class="col">
                        <label for="inputGender">Gender</label>
                        <div class="row">
                            <div class="col-12">
                                <div class="hob col-3">Male:<input type="radio" name="Gender" value="Male"></div>
                                <div class="hob col-3">Female:<input type="radio" name="Gender" value="Female"></div>
                            </div>
                        </div>
                        
                    </div>
                </div>
                <div class="button">
                    <button type="submit" class="btn btn-primary btn-lg ">Submit</button>
                </div>
                
            </form>

        </div>

    </div>

</body>

</html>
	
</body>
</html>