package pl.alx.webowy.osoby;

import jakarta.ws.rs.Produces;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/osoby/grzegorz")
public class Grzegorz {

	@GET
	@Produces("text/html;charset=UTF-8")
	public String getHtml() {
		return """
		<!DOCTYPE html>
		<html>
		<head>
		  <title>Grzegorz</title>
		</head>
		<body>
		<p><strong>Grzegorz</stong></p>
		</body>
		</html>
		""";
	}
}
