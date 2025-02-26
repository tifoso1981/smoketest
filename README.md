[![WebApplicationTesting - DEV ENV](https://github01.gao.gov/GAO-ISTS/eaag-qasmoketest-testautomation/actions/workflows/web_app_testing_build_main_DEV.yml/badge.svg)](https://github01.gao.gov/GAO-ISTS/eaag-qasmoketest-testautomation/actions/workflows/web_app_testing_build_main_DEV.yml)
[![WebApplicationTesting - QA ENV](https://github01.gao.gov/GAO-ISTS/eaag-qasmoketest-testautomation/actions/workflows/web_app_testing_build_main_QA.yml/badge.svg)](https://github01.gao.gov/GAO-ISTS/eaag-qasmoketest-testautomation/actions/workflows/web_app_testing_build_main_QA.yml)
[![WebApplicationTesting - PROD ENV](https://github01.gao.gov/GAO-ISTS/eaag-qasmoketest-testautomation/actions/workflows/web_app_testing_build_main_PROD.yml/badge.svg)](https://github01.gao.gov/GAO-ISTS/eaag-qasmoketest-testautomation/actions/workflows/web_app_testing_build_main_PROD.yml)
[![WebApplicationTesting - STAGE ENV](https://github01.gao.gov/GAO-ISTS/eaag-qasmoketest-testautomation/actions/workflows/web_app_testing_build_main_STAGE.yml/badge.svg)](https://github01.gao.gov/GAO-ISTS/eaag-qasmoketest-testautomation/actions/workflows/web_app_testing_build_main_STAGE.yml)

### Allure Report 
https://pages.github01.gao.gov/GAO-ISTS/eaag-qasmoketest-testautomation/

# Automation Framework for Smoke Testing
#/opt/gherunner/creds
Smoke test framework using TestNG, selenium and Allure report.

### List of Container Applications:
* CCS
* Docs
* EMS
* EMS-Data
* EMS-Sync
* EVS
* FedRules
* GCTrack PL
* GCTrack Audit
* My Locator
* PS
* RPS
* PDS
* PubDB
* Refdata
* USOrg Manager
* USOrg 3.0
* USOrg Webstart
* BI Services
* ISTS Procurement
* PS-conversion
* FRAUDNET
* LTM


### List of RAD Applications:
* KPI
* BI Analytics
* Greenbook - (using SSO login)
* BI-Manager
* Pentaho - EDM
* Liferay-RAD
* Counseling Services
* E-310
* Flexible work application
* ePM
* Field Office Staff Listing
* GAO Grow
* GAO Honor Awards
* GAO Orders
* My PBC
* Leave Audit
* PDP Interviews
* PRI
* Reasonable Accommodations
* 2nd Partner Concurrence Tool
* Student Loan Repayment Program
* VOLTRAN
* Work Schedule
* WFP Web 
* WFP NFC
* WFP Salary & Benefits
* Pentaho 
* Transit application

## Setup

### Prerequisites

Install Java SDK version 11
* [Java](https://openjdk.java.net/install/) - Compilation

Install Maven version 3.6.3
* [Maven](https://maven.apache.org/) - Dependency Management

This project is using WebDriverManager
* [Selenium WebDriver](https://bonigarcia.dev/webdrivermanager/) - Library 

Other tools are made available automatically via the maven POM 

### clone repository

git clone git@github01.gao.gov:GAO-ISTS/eaag-qasmoketest-testautomation.git
 
### GitHub Workflow (Executing automation framework using GHA reusable workflow)

The source folder of the reusable workflow location: [eaag-md-github-actions/.github/workflows/ReusableWorkflowForSeleniumProjects.yml](https://github01.gao.gov/GAO-ISTS/eaag-md-github-actions/blob/main/.github/workflows/ReusableWorkflowForSeleniumProjects.yml)

The target workflow location: eaag-qatesting-REPOSITORY_NAME/.github/workflows/web_app_testing_build_main.yml
 
## Running Tests 

mvn test 

### Report

Allure report is generated from mvn test command. The Allure report is located at

```
allure-results
```
