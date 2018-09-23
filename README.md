# FlickerFeed

Flicker Feed application displays public photo feeds. The app uses Flicker URL "https://api.flickr.com/services/feeds/photos_public.gne?lang=en-us&format=json&nojsoncallback=1"
The fetched list is displayed as image gallery in list form and on click of item detail view shows relevant info on feed.

# Application Architecture.
- Application uses MVVVM architecture & CLEAN architecture & principles of SOLID programming.
- Dagger 2 is used for Dependency Injection and ButterKnife for View Injections.
- Retrofit is used for Network layer.
- RxJava2 is used for Background/Asychronous operations like Network call/ response transformation.
- GSON library is used for parsing of data
- Glide is used to fetch/resize images.
- Application uses Mockito for Junit test cases.
- Repository and Use case concept of Clean architecture makes code modular and testable.
- Recylcer view is used to display list of feeds

# Pre-Requiste
- Android studio . Java 1.8

# Run/Test
- App has been tested on device S5 and emulator Nexus API 23
- App unit test covers Viewmodel and Usecase.

# Techincal Debt
- Add persistence to save response using any DB(Realm/ORM/SQLite)
- Add more test coverage.
- UI code on fragments

# Known bug
- TBD persistence
