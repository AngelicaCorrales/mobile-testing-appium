# Mobile Automation with Appium Challenge

## Scenarios ✅
#### 1. Automate the following test case:
- Given the application IMDB 
- Click On Skip Login 
- When Search for a movie 
- And click on the first result 
- Then the overview must match with an existing overviewed text

#### 2. Automate the following test case:
- Given the application IMDB 
- Login into the application
- Search for a movie
- And click on any result 
- And click on Add to watch list
- Click on you global navigation option
- Click on your watchlist
- Then the watch list must contain the previous movie selected

#### 3. Automate the following test case:
- Given the application IMDB 
- Login Into the application
- Search for a movie
- And click on the first result
- Scroll down to User reviews
- Click on rate
- And select a rate
- Then a saved message must be displayed

## Required items 🧰
- **Android Studio Device Manager** to emulate an Android device.
- **IDE Intellij** to build the test framework.
- **Appium**, which is a mobile automation testing tool.
- **Appium Inspector**, a tool that helps streamline the process of creating and inspecting automation scripts for mobile apps.
- **IMDb App** installed on the Android device.

## Project Structure ⚙️
- src/main contains screens and their user interactions, and capabilities related files to start a session.
- src/test contains test cases and test data related files.

## Important note ℹ️
- src/test/resources/TestData/testData.json contains valid user credentials to sign in with IMDb. You should pre-create an account and use your credentials to run the tests.


