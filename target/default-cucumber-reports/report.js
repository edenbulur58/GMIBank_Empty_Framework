$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/api.feature");
formatter.feature({
  "name": "API Test",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@api"
    }
  ]
});
formatter.scenario({
  "name": "TC01_kullanici apinin calistini kontrol eder",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@api"
    }
  ]
});
formatter.step({
  "name": "kullanici kendisine verilen token ile apiye baglanir",
  "keyword": "Given "
});
formatter.match({
  "location": "gmibank.stepdefinitions.ApiStepDefinitions.kullanici_kendisine_verilen_token_ile_apiye_baglanir()"
});
formatter.result({
  "status": "passed"
});
});