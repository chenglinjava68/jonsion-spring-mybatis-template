View Code 

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>SiteMesh example: <sitemesh:write property='title'/></title>

    <style type='text/css'>

      /* Some CSS */

      /*body { font-family: arial, sans-serif; background-color: #ffffcc; }

      h1, h2, h3, h4 { text-align: center; background-color: #ccffcc; border-top: 1px solid #66ff66; }

      .mainBody { padding: 10px; border: 1px solid #555555; }

      .disclaimer { text-align: center; border-top: 1px solid #cccccc; margin-top: 40px; color: #666666; font-size: smaller; }
	  */
    </style>

    <sitemesh:write property='head'/>

  </head>

  <body>



    <h1 class='title'>SiteMesh example site: <sitemesh:write property='title'/></h1>



    <div class='mainBody'>

      <sitemesh:write property='body'/>

    </div>



    <div class='disclaimer'>Site disclaimer. This is an example.</div>



  </body>

</html>