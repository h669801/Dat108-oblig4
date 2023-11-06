<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="no">
<head>
	<link href="css/simple.css" rel="stylesheet" type="text/css" />
	<title>Paamelding</title>
	<script>
		function validateForm() {
			var fornavn = document.forms["pamelding"]["fornavn"].value;
			var etternavn = document.forms["pamelding"]["etternavn"].value;
			var mobil = document.forms["pamelding"]["mobil"].value;
			var passord = document.forms["pamelding"]["passord"].value;
			var passordRepetert = document.forms["pamelding"]["passordRepetert"].value;
			var kjonn = document.querySelector('input[name="kjonn"]:checked');

			// Enkel validering
			if (fornavn === "" || etternavn === "" || mobil.length !== 8 || passord === "" || passordRepetert === "" || kjonn === null) {
				alert("Vennligst fyll ut alle feltene korrekt.");
				return false;
			}

			// Sjekk om passordene samsvarer
			if (passord !== passordRepetert) {
				alert("Passordene stemmer ikke overens.");
				return false;
			}
		}
	</script>
</head>