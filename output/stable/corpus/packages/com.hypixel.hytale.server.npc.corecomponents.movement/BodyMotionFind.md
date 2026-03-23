# BodyMotionFind

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.movement | Extends: BodyMotionFindWithTarget

public class BodyMotionFind extends BodyMotionFindWithTarget

Pathfinds to a sensor-provided target position using A* navigation. Core pursue behavior for NPC movement. Configurable distance thresholds control when the NPC considers the goal reached, when to abort, and when to switch from pathfinding to direct steering.

## Key Fields

- distance | double | Goal-reached distance threshold
- reachable | boolean | Whether the target must be reachable
- heightDifferenceMin` / `heightDifferenceMax | double | Vertical range constraints
- abortDistance | double | Distance at which pathfinding aborts
- switchToSteeringDistance | double | Distance at which A* switches to direct steering
