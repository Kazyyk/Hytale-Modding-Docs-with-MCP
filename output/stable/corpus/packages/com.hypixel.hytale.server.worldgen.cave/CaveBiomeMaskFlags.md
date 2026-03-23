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

Also in this package: Cave, CaveBlockPriorityModifier, CaveGenerator, CaveNodeChildEntry, CaveNodeCoverEntry, CaveNodeCoverType, CaveNodeType, CavePrefabPlacement, CaveType, CaveYawMode, Defaults, Entry, FluidLevel, OrientationModifier, PrefabPlacementFunction

Complete API:
  public static boolean canGenerate(int value)
  public static boolean canPopulate(int value)
  public static boolean canContinue(int value)
  public static boolean test(int value, int flag)

Fields:
public static final Int2FlagsCondition DEFAULT_ALLOW
public static final Int2FlagsCondition DEFAULT_DENY
public static final int GENERATE
public static final int POPULATE
public static final int CONTINUE
