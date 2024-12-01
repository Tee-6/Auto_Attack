<img src="logo.png" width="150px">

# Auto Attack
This is an installable modification for the videogame, Minecraft Java Edition.  
Utilizing Java and some JSON, I created a modification to the game's combat system to improve the players' experience.

## Download
View the mod: [(CurseForge)](https://www.curseforge.com/minecraft/mc-mods/t6-auto-attack-mod)

![Demonstration Gif](demo.gif)

## Developer Guide

### To update
- Update the properties from *gradle.properties*. Follow the [Fabric Develop guide](https://fabricmc.net/develop/).
- Increment the mod's version number
- If it's a new Minecraft version, change the version number in */src/main/resources/fabric.mod.json*
- Update the fabric-loom version from *build.gradle*.  
  - If a new gradle version is required to update the Loom version:
    - Update the version number in `gradle/gradle-wrapper.properties`
    - Use ```./gradlew wrapper --gradle-version x.x``` before updating the loom version

### To build
Enter ```./gradlew build``` into the terminal.<br>
The build will appear in the *build/libs* folder

### To release
- Commit changes for the new version
- Navigate to the [release page](https://github.com/Tee-6/Auto_Attack/releases)
- Create new release
- Create a new tag with the version number
- Upload a file of the mod (same file that's uploaded to CurseForge
