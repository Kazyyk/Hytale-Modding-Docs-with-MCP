# BodyMotionMoveAway

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.movement | Extends: BodyMotionFindWithTarget

public class BodyMotionMoveAway extends BodyMotionFindWithTarget

Flees from a target position using pathfinding and evade steering. Supports configurable flee direction holding, jitter angles for erratic movement, and distance-based erratic behavior escalation.

## Key Fields

- stopDistance | double | Distance at which fleeing stops
- holdDirectionDurationRange | double[] | Duration range for holding a flee direction
- jitterAngle | float | Angular jitter for flee direction variation
- erraticDistanceSquared | double | Distance threshold for erratic movement
