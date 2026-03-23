# BodyMotionMaintainDistance

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.movement | Extends: BodyMotionBase

public class BodyMotionMaintainDistance extends BodyMotionBase

Maintains a specific distance from a target entity. Combines pursue and evade steering forces to keep the NPC within a configured distance range. Supports configurable approach angles, strafe speeds, and repositioning.

## Key Fields

- initialDesiredDistanceRange | double[] | Target distance range
- moveThreshold | double | Distance deviation before repositioning
- thresholdDistanceRangeSquared | double[] | Squared distance range for threshold checks
