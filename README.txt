# SliceBread Conversion Mod

This mod allows for the conversion of SliceBread added by both More Delight and Egg Delight. It is created for personal use, and there are no plans for maintenance.
You are free to modify and use this mod as you wish.

## Compatibility

- **Minecraft Version:** 1.20.1
- **Forge Version:** 1.20.1-47.3.0
- **More Delight Version:** 24.09.27-1.20
- **Egg Delight Version:** 1.2

Compatibility with other versions is unknown. The jar file compatible with the above versions is released as v1.0.0.

## Building the Source Code

To build the source code, follow these steps:

1. Create a directory named `lib` in the root directory of the project.
2. Place the corresponding versions of Farmer's Delight, More Delight, and Egg Delight into the `lib` directory.

## Source Installation Information for Modders

This code follows the Minecraft Forge installation methodology. It will apply some small patches to the vanilla MCP source code, giving you and it access to some of the data and functions you need to build a successful mod.

Note also that the patches are built against "un-renamed" MCP source code (aka SRG Names) - this means that you will not be able to read them directly against normal code.

### Setup Process

1. Open your command-line and browse to the folder where you extracted the zip file.
2. Choose your preferred IDE:

   **Eclipse:**
   - Run the following command: `./gradlew genEclipseRuns`
   - Open Eclipse, Import > Existing Gradle Project > Select Folder 
   - Alternatively, run `gradlew eclipse` to generate the project.

   **IntelliJ:**
   - Open IDEA, and import project.
   - Select your `build.gradle` file and have it import.
   - Run the following command: `./gradlew genIntellijRuns`
   - Refresh the Gradle Project in IDEA if required.

If at any point you are missing libraries in your IDE, or you've run into problems, you can run `gradlew --refresh-dependencies` to refresh the local cache. Run `gradlew clean` to reset everything (this does not affect your code) and then start the process again.

### Mapping Names

By default, the MDK is configured to use the official mapping names from Mojang for methods and fields in the Minecraft codebase. These names are covered by a specific license. All modders should be aware of this license. If you do not agree with it, you can change your mapping names to other crowdsourced names in your `build.gradle`. For the latest license text, refer to the mapping file itself, or the reference copy here: [Mojang.md](https://github.com/MinecraftForge/MCPConfig/blob/master/Mojang.md)

### Additional Resources

- **Community Documentation:** [Forge Documentation](https://docs.minecraftforge.net/en/1.20.1/gettingstarted/)
- **LexManos' Install Video:** [YouTube Video](https://youtu.be/8VEdtQLuLO0)
- **Forge Forums:** [Forge Forums](https://forums.minecraftforge.net/)
- **Forge Discord:** [Forge Discord](https://discord.minecraftforge.net/)
