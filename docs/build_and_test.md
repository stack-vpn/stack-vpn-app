# Build and Test Instructions

## Building the Project

To build this project:

1. Open in Android Studio
2. Wait for Gradle sync to complete
3. Build → Build Bundle(s) / APK(s) → Build APK

## Testing the Project

The project includes unit tests and instrumentation tests:

- Unit tests: Located in `app/src/test/`
- Instrumentation tests: Located in `app/src/androidTest/`

To run tests:
```
./gradlew test
./gradlew connectedAndroidTest
```

## Project Status

This project is currently a template/boilerplate implementation. To create a fully functional APK that can be penetration tested, you would need to:

1. Complete the implementation of the VPN protocol engines
2. Set up a proper build environment with Android SDK
3. Implement the actual VPN functionality