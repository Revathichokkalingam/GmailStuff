Feature: Gmail login

Scenario Outline: gmail login for different user
Given: User launches Chrome Browser and enter gmail URL "https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=AXo7B7WKmhnKXklqHS_4f7xhtpUYUwiojAMyHs3_OeVJWfXj8aH8ZTyZjlUz7wDoCNcSVNUkB8vzMA&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S1762481638%3A1693212430674968"
When : User enters "<email>" and "<password>"
Then: Gmail login  succesful

Examples:
|email|password|
|revacutiee15@gmail.com|poriki|
|ckvasan.qa@gmail.com|LWD24@2023|