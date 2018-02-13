<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match='/'>
	<html>
		<head>
			<title>Parks &amp; Recreation Department, Pawnee</title>
		</head>
		<body>
			<h3 style="margin-top: 10vh; text-align: center;">Parks &amp; Recreation Department, Pawnee</h3>
			<table cellspacing="0" border="1" align="center" style="margin-top: 10vh;">
				<tr>
					<th>Character</th>
					<th>Cast</th>
				</tr>
				<xsl:for-each select="PR/employee">
					<tr>
						<td><xsl:value-of select="character"/></td>
						<td><xsl:value-of select="cast"/></td>
					</tr>
				</xsl:for-each>
			</table>
		</body>
	</html>
    </xsl:template>
</xsl:stylesheet>
