# Elton Kola


*Prerequisites*: to run on iOS and Android, you should have "Kotlin Multiplatform Mobile" plugin installed either 
                 in Android Studio or in AppCode with [installed CocoaPods](https://kotlinlang.org/docs/native-cocoapods.html).


## How to run 

To run on iOS device, please correct `iosApp/Configuration/TeamId.xcconfig` with your Apple Team ID. 
Alternatively, you may setup signing within XCode opening `iosApp/iosApp.xcworkspace` and then 
using "Signing & Capabilities" tab of `iosApp` target.

Then choose **iosApp** configuration in IDE and run it. 

## Run on desktop via Gradle

`./gradlew desktopApp:run`

## Run JS in browser with WebAssembly Skia via Gradle

`./gradlew jsApp:jsBrowserDevelopmentRun`

if you have js errors, run
./gradlew  kotlinUpgradeYarnLock

## Run Ios Simulator
Run from android studio or this cmd, with your updated paths
/Applications/Xcode.app/Contents/Developer/usr/bin/xcodebuild -workspace /Users/elton/Documents/GitHub/eltonkola/eltonkola/./iosApp/iosApp.xcworkspace -scheme iosApp -configuration Debug OBJROOT=/Users/elton/Documents/GitHub/eltonkola/eltonkola/build/ios SYMROOT=/Users/elton/Documents/GitHub/eltonkola/eltonkola/build/ios -sdk iphonesimulator -arch arm64 -allowProvisioningDeviceRegistration -allowProvisioningUpdates


## How to build
This is how we can make debug and release binaries for every platform

### Web

`./gradlew jsApp:jsBrowserDistribution`
web to publish:
eltonkola/jsApp/build/distributions

### Android

`./gradlew androidApp:assembleDebug`
apk on path:
eltonkola/androidApp/build/outputs/apk/debug/androidApp-debug.apk

### IOS
open xcode, and go to 'Product' > 'Archive'
exported file will be on a similar path:
/Users/elton/Library/Developer/Xcode/Archives/2023-05-04/iosApp 5-4-23, 7.17 PM.xcarchive

### MacOs
`./gradlew desktopApp:packageDmg`
dmg path:
eltonkola/desktopApp/build/compose/binaries/main/dmg/EltonKola-1.0.0.dmg

### Linux
deb path: ek.deb
`./gradlew desktopApp:packageDeb`

### Windows
deb path: ek.exe
`./gradlew desktopApp:packageExe`
