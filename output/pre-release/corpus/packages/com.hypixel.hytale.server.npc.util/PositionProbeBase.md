# PositionProbeBase

Type: class | Package: com.hypixel.hytale.server.npc.util

public class PositionProbeBase

Base class for NPC position probing that evaluates the collision state at a world position. Tracks ground contact, ceiling contact, water state, ground/water/surface levels, and height measurements.

## Key Methods

- public boolean isValidPosition()
- public boolean isTouchCeil()
- public boolean isOnGround()
- public boolean isInWater()
- public int getGroundLevel()
- public int getWaterLevel()
- public int getHeightOverGround()
- public int getHeightOverSurface()
- public int getDepthBelowSurface()
- public int getHeightOverWater()
- public String toString()
