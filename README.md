# passport-app-test
Testing Passport Application Using Zerocode Test Framework TDD, BDD
REST API-
Contract Test are meant to test only contract and not actual business logic. 
e.g. Validating Json request,regex pattern over fields, max Length of field, Unrecognised Json properties those are validated in Contract Tests.
#Contract Tests are kept in contract-tests folder

E2EInegrationTest -are meant to test business logic as well as End-To-End Flow. Connectivity with other external entities and response structures.
#E2EIntegrationTest - this folder hold  all success,failure and intergration tests

SOAP API-
SOAP test- for testing any SOAP/WSDL service which we use it within on application. this is just to test SAOP/XML based service
