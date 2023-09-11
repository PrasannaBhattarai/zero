<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Contact Us</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f0f0f0;
	color: #333;
	margin: 0;
	padding: 0;
}

.navbar {
	background-color: black;
	text-align: center;
}

.navbar a {
	display: inline-block;
	color: #f2f2f2;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}

.navbar a:hover {
	background-color: #ddd;
	color: black;
}

.contact-form {
	max-width: 600px;
	margin: auto;
	background-color: #fff;
	padding: 20px;
	border-radius: 8px;
	box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
}

.form-group {
	margin-bottom: 20px;
}

.form-group label {
	font-weight: bold;
	display: block;
	margin-bottom: 5px;
}

.form-group input, .form-group textarea {
	width: 100%;
	padding: 10px;
	border: 1px solid #ccc;
	border-radius: 4px;
	box-sizing: border-box;
	font-size: 16px;
}

.form-group textarea {
	height: 150px;
}

.submit-btn {
	background-color: #000;
	color: #fff;
	border: none;
	padding: 10px 20px;
	font-size: 16px;
	border-radius: 4px;
	cursor: pointer;
}
</style>
</head>
<body>
	<div class="navbar">
		<a href="/index">Home</a> 
		<a href="/about">About Us</a> 
		<a href="/contact">Contact Us</a>
	</div>
	<div class="contact-form">
		<h2>Contact Us</h2>
		<form action="/submitContact" method="post">
			<div class="form-group">
				<label for="first-name">First Name</label> <input type="text"
					id="first-name" name="first-name" required>
			</div>
			<div class="form-group">
				<label for="last-name">Last Name</label> <input type="text"
					id="last-name" name="last-name" required>
			</div>
			<div class="form-group">
				<label for="phone">Phone Number</label> <input type="tel" id="phone"
					name="phone" required>
			</div>
			<div class="form-group">
				<label for="email">Email Address</label> <input type="email"
					id="email" name="email" required>
			</div>
			<div class="form-group">
				<label for="description">Description</label>
				<textarea id="description" name="description" required></textarea>
			</div>
			<button type="submit" class="submit-btn">Submit</button>
		</form>
	</div>
</body>
</html>
