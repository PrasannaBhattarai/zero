

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>User Home Page</title>
<style>
body {
	display: flex;
	flex-direction: column;
	min-height: 100vh;
	font-family: Arial, sans-serif;
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

.main-content {
    display: flex;
    justify-content: space-between;
    width: 90%;
    border: none; /* Set border to none */
    margin: 0 auto;
    padding: 20px;
    text-align: center;
    flex-wrap: wrap; /* Wrap to a new line on smaller screens */
}

.sub-div {
    width: 90%;
    box-sizing: border-box;
    border: none;
    margin: 10px auto; /* Center the sub-divs */
}

.section {
    display: flex;
    flex-direction: row;
    justify-content: space-between;
}

.text-box {
    flex: 1;
    padding: 10px;
    box-sizing: border-box;
    background-color: #f0f0f0;
    border-radius: 1vh;
    overflow: hidden;
    word-wrap: break-word; /* Allow long words to wrap */
}


.sub-div img {
    width: 250px; /* Set a fixed width for the image */
    height: 200px; /* Set a fixed height for the image */
    object-fit: cover; /* Ensures the image doesn't stretch */
    display: block;
    margin: 0 auto;
}




.footer {
    background-color: black;
    padding: 20px 0;
    text-align: center;
    color: white;
}

.social-icons {
    font-size: 30px;
    margin: 20px 0;
}

.social-icon {
    display: inline-block;
    margin: 0 20px;
}

.social-icons img {
    border: 5px solid grey;
    max-width: 40px;
    height: auto;
    border-radius: 50%;
}

.social-icons p {
    color: white;
    font-size: 12px;
    margin-top: 5px;
}

.footer-links a {
    color: white;
    margin: 0 10px;
    text-decoration: none;
    font-size: 16px;
}

/* For smaller screens */
@media (max-width: 768px) {
    .social-icons {
        margin: 10px 0;
    }

    .social-icon {
        margin: 0 10px;
    }

    .footer-links a {
        font-size: 14px;
    }
}


</style>
</head>
<body>
	<div class="navbar">
		<a href="/index">Home</a>
		<a href="/about">About Us</a>
		<a href="/contact">Contact Us</a>
	</div>

<div class="main-content">
    <div class="sub-div">
        <div class="section">
            <img src="/images/insta.jpeg" alt="Section 1 Image">
            <div class="text-box">
                <h3>Section 1</h3>
                <p>Sample Text</p>
            </div>
        </div>
    </div>
    <div class="sub-div">
        <div class="section">
            <div class="text-box">
                <h3>Section 2</h3>
                <p>Sample gyaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaat</p>
            </div>
            <img src="/images/fb.jpg" alt="Section 2 Image">
        </div>
    </div>
</div>



	<div class="footer">
		<div class="social-icons">
			<div class="social-icon">
				<a href="https://www.facebook.com"><img src="/images/fb.jpg"
					alt="Facebook"></a>
				<p>www.facebook.com</p>
			</div>
			<div class="social-icon">
				<a href="https://www.instagram.com"><img
					src="/images/insta.jpeg" alt="Instagram"></a>
				<p>www.instagram.com</p>
			</div>
			<div class="social-icon">
				<a href="https://twitter.com/"><img src="/images/phone.jpg"
					alt="Twitter"></a>
				<p>www.twitter.com</p>
			</div>
		</div>

		<p>Follow us on social media</p>

		<div class="footer-links">
			<a href="/contact">Contact Us</a> 
			<a href="/terms">Terms and Conditions</a>
		</div>
	</div>


</body>
</html>
