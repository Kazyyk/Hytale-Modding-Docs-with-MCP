# CavePrefabPlacement

Type: enum | Package: com.hypixel.hytale.server.worldgen.cave

public enum CavePrefabPlacement

Enumeration of prefab placement strategies within cave nodes: ceiling, floor, or default (center).

## Enum Constants

- `CEILING` -- Places prefabs at the ceiling of a cave node.
- `FLOOR` -- Places prefabs at the floor of a cave node.
- `DEFAULT` -- Places prefabs at the vertical center of a cave node.

## Constants

- int NO_HEIGHT

## Key Methods

- public CavePrefabPlacement.PrefabPlacementFunction getFunction()

Also in this package: Cave, CaveBiomeMaskFlags, CaveBlockPriorityModifier, CaveGenerator, CaveNodeChildEntry, CaveNodeCoverEntry, CaveNodeCoverType, CaveNodeType, CaveType, CaveYawMode, Defaults, Entry, FluidLevel, OrientationModifier, PrefabPlacementFunction

Complete API:
  public CavePrefabPlacement.PrefabPlacementFunction getFunction()

Fields:
public static final int NO_HEIGHT
private final CavePrefabPlacement.PrefabPlacementFunction function
