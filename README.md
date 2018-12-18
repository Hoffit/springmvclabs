# CF Code Lab 12 and Lab 13
## Spring RESTful Routing
GET and POST albums in a database, including their songs.

## Challenge
### Feature Tasks
Create an Album model.
An Album has a title, an artist, a songCount, a length (in seconds), and an imageUrl that is a link to that album’s art.
A user should be able to see information about all the albums on the site.
A user should be able to add albums to the site.

Create a Song model.
A Song has a title, a length (in seconds), a trackNumber, and the album on which that song appears.
Ensure that the relationship between Albums and Songs is appropriately set up.
   A user should be able to see information about all the songs on the site.
   A user should be able to view a page with data about one particular album.
   A user should be able to add songs to an album.
   A user should be able to see the songs that belong to an album when looking at that album.

## How to use it
You can run this within IntelliJ. You can start the application server (tomcat) by running the main class SpringmvclabsApplication.
Once that server is running, you can test out the application like this:
localhost:8080/albums
localhost:8080/songs

From there, you can view all the albums currently defined in the database, or add new albums with the form.

You can also run the application server in ubuntu using gradle like this (tested and working):
./gradlew bootRun

From there it's the same to test, by going to localhost in your browser.

There are environment variables required in both cases. You can decide which approach to take, but you'll
need to modify settings in resources/application.properties before running. There are instructions in that file.

## API See javadoc
/javadoc/
