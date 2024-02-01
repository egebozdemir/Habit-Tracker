# Habit-Tracker
Spring Boot Framework Demo Project
<br><br>
![appRunOnDockerImageCreatedWithinGithubAction_HabitTracker](https://github.com/egebozdemir/Habit-Tracker/assets/56095796/e0e163e6-eea7-4abe-accd-088543119613)
<br><br>
Basic REST application in Spring Boot which generates the HTTP request that performs CRUD operations on the JSON data.<br> Dockerized and published within github workflow
<br><br>
### :running: How to Run: <br>
```console
 docker pull ghcr.io/egebozdemir/habit-tracker:main<br>
```
```console
 docker run -p 8080:8080 ghcr.io/egebozdemir/habit-tracker:main<br>
```
<br><br>
### :arrow_forward: Example Habit Request (creating a new habit):<br>
```console
 curl -H "Content-Type: application/json" -X POST http://localhost:8080/habits -d "{\"name\": \"make the bed\"}"<br>
```
```console
 curl -H "Content-Type: application/json" -X POST http://localhost:8080/habits -d "{\"name\": \"walk the dog\"}"<br>
```
```console
 curl -H "Content-Type: application/json" -X POST http://localhost:8080/habits -d "{\"name\": \"brush teeth\"}"<br>
```
<br><br>
### :arrow_forward: Example Activity Requests (creating a record that you've done the relevant activity for a habit):<br>
```console
 curl -H "Content-Type: application/json" -X POST http://localhost:8080/activities -d "{\"habitId\": \"1\"}"<br>
```
```console
 curl -H "Content-Type: application/json" -X POST http://localhost:8080/activities -d "{\"habitId\": \"2\"}"<br>
```
<br><br>
### :bulb: To Check created DB Records (H2 in-memory db)<br>
> Go to "localhost:8080/h2-console" in your browser after the application stands up<br>
> Credentials are in "/src/main/resources/application.properties"<br>

<br><br>
:point_right: Credits: @huseyinbabal 
