# CaveBiomeMaskFlags

Type: class | Package: com.hypixel.hytale.server.worldgen.cave

public class CaveBiomeMaskFlags

Bit-flag constants for cave biome masks controlling generation, population, and continuation permissions.

## Constants

- Int2FlagsCondition DEFAULT_ALLOW
- Int2FlagsCondition DEFAULT_DENY
- int GENERATE
- int POPULATE
- int CONTINUE
- int DEFAULT_RESULT
- int DISALLOW_ALL
- int ALLOW_ALL

## Key Methods

- public static boolean canGenerate(int value)
- public static boolean canPopulate(int value)
- public static boolean canContinue(int value)
- public static boolean test(int value, int flag)
