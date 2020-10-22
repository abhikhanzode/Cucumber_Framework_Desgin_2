Feature: White Box Testing Of Brandintelle Application
Scenario: White Box Testing 
  Given launch the browser and application
  When Login with valid username: "Sanyuktaa" and Password: "Tt@123456"
  Then click on login button and user will be on dashboard
  Then Go to BTL JOB module 
  And check app opeing and download supporting documents and Job_bill report
  Then Go to BTL Bill module 
  And  Check app opening and Download supporting documents
  Then Go to Marketing Purchase Order module
  And Check app opening and donwload supporting documents and download PO report
  Then Go to ATL Estimate 
  And Check app opening, creatives and download supporting documents
  Then Go to ATL FMS 
  And Check FMS View, creatives and download supporting documents
  Then Go to Creatives
  And Check create and add new creative details
