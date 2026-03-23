# BodyMotionFindWithTarget

Type: class | Package: com.hypixel.hytale.server.npc.corecomponents.movement | Extends: BodyMotionFindBase<AStarWithTarget>

public abstract class BodyMotionFindWithTarget extends BodyMotionFindBase<AStarWithTarget>

Extension of `BodyMotionFindBase` that tracks a target entity reference. Monitors target movement and triggers path recomputation when the target moves beyond configured thresholds. Supports adjusting range by hitbox size.

## Key Fields

- minMoveDistanceWait | double | Target movement distance before waiting
- minMoveDistanceRecompute | double | Target movement distance triggering recompute
- minMoveDistanceReproject | double | Target movement distance triggering reproject
- adjustRangeByHitboxSize | boolean | Whether to adjust goal range by target bounding box
