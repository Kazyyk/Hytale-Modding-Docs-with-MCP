# CaveBlockPriorityModifier

Type: class | Package: com.hypixel.hytale.server.worldgen.cave | Implements: BlockPriorityModifier

public class CaveBlockPriorityModifier implements BlockPriorityModifier

Modifies block priority values during cave carving to handle transitions between cave and non-cave blocks.

## Constants

- BlockPriorityModifier INSTANCE

## Key Methods

- public byte modifyCurrent(byte current, byte target)
- public byte modifyTarget(byte current, byte target)

Also in this package: Cave, CaveBiomeMaskFlags, CaveGenerator, CaveNodeChildEntry, CaveNodeCoverEntry, CaveNodeCoverType, CaveNodeType, CavePrefabPlacement, CaveType, CaveYawMode, Defaults, Entry, FluidLevel, OrientationModifier, PrefabPlacementFunction

Complete API:
  public byte modifyCurrent(byte current, byte target)
  public byte modifyTarget(byte current, byte target)

Fields:
public static final BlockPriorityModifier INSTANCE
