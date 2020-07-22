<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->
<style>
.login-box
		{
			height: 60%;
			width: 30%;
			border: 1px solid grey;
			margin-left: 35%;
			margin-top: 10%;
			position: relative;
      		box-shadow: 21px 12px 24px 10px rgba(0, 0, 0, .5);
      		background: #dadada;
		}
		.login-header
		{
			text-align: center;
			font-family: "vardhana",cursive;
			font-size: 35px;
			background: linear-gradient(to bottom, #00bfff 0%, #0000ff 100%);
			color:#fff;
			position: relative;
      		box-shadow: 1px 3px 14px  rgba(0, 0, 0, .5);
		}
		.login-body
		{
			padding: 20px;
			line-height: 2;
		}

</style>
<div class="login-box" >
	<div class="login-header"></div>
	<div class="login-body">
		<form class="form-group" action="submit.odc" method="post">
			<label>MailID</label>
			<input type="text" class="form-control" name="mail">
			<label>Subject</label>
			<input type="text" class="form-control" name="subject">
			<label>Body</label>
			<input type="text" class="form-control" name="body"><br>
			<input type="submit" value="Submit" class="form-control btn btn-success " name="">
		</form>
		
		<%-- <h2>${message}</h2> --%>
	</div>
</div>