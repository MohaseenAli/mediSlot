<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>MediSlot</title>
<link href="assets/image/icon.png" rel="icon">
<!-- Bootstrap CSS -->
<link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet" />
<!-- Font Awesome for eye icon -->
<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" rel="stylesheet">
<!-- Custom CSS -->
<style>
body {
    background-color: #eaf0f6; /* Light blue background */
    padding-top: 40px;
}

.form-container {
    max-width: 400px;
    margin: auto;
    background-color: rgba(255, 255, 255, 0.8);
    /* Semi-transparent white form background */
    padding: 40px;
    border-radius: 10px;
    box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
}

.form-container h2 {
    color: #007bff; /* Blue header text */
    text-align: center;
    margin-bottom: 15px;
}

.form-container .form-group label {
    color: #007bff; /* Blue label text */
    font-weight: bold;
}

.form-container .btn-primary {
    background-color: #007bff; /* Blue button background */
    border-color: #007bff;
    font-weight: bold;
    transition: background-color 0.3s;
}

.form-container .btn-primary:hover {
    background-color: #0056b3; /* Darker blue on hover */
    border-color: #0056b3;
}

.login-link {
    text-align: center;
    margin-top: 20px;
}

.login-link a {
    color: #007bff; /* Blue login link text */
    text-decoration: none;
    font-weight: bold;
    transition: color 0.3s;
}

.login-link a:hover {
    color: #0056b3; /* Darker blue on hover */
}
</style>
</head>
<body>
    <div class="container">
        <div class="form-container">
            <h2>Patient Login</h2>
            <% String error = (String) session.getAttribute("loginError"); if (error != null) { %>
            <p style="color: red; display: flex; justify-content: center"><%=error%></p>
            <% session.removeAttribute("loginError"); } %>
            <form method="post" action="patientLogin">
                <div class="form-group">
                    <label for="phone">Phone Number</label> <input type="tel" class="form-control" id="phone" name="phone" pattern="[1-9]{1}[0-9]{9}" placeholder="Enter your phone number (10 digits)" required />
                </div>
                <div class="form-group">
                    <label for="password">Password</label>
                    <div class="input-group">
                        <input type="password" class="form-control" id="password" name="password" pattern=".{5,}" placeholder="Enter your password (min. 6 characters)" required />
                        <div class="input-group-append">
                            <span class="input-group-text" id="togglePassword">
                                <i class="fa fa-eye-slash" aria-hidden="true"></i>
                            </span>
                        </div>
                    </div>
                </div>
                <button type="submit" class="btn btn-primary btn-block">
                    Login
                </button>
            </form>
            <div class="login-link">
                <p>
                    Don't have an account? <a href="patient_regestration.jsp">Register here</a>
                </p>
            </div>
        </div>
    </div>

    <!-- JavaScript to toggle password visibility -->
    <script>
        const togglePassword = document.querySelector('#togglePassword');
        const password = document.querySelector('#password');

        togglePassword.addEventListener('click', function (e) {
            // toggle the type attribute
            const type = password.getAttribute('type') === 'password' ? 'text' : 'password';
            password.setAttribute('type', type);
            // toggle the eye slash icon
            this.querySelector('i').classList.toggle('fa-eye-slash');
            this.querySelector('i').classList.toggle('fa-eye');
        });
    </script>
</body>
</html>
