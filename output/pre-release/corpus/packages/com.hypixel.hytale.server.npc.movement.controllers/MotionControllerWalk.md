# MotionControllerWalk

Type: class | Package: com.hypixel.hytale.server.npc.movement.controllers | Extends: MotionControllerBase

public class MotionControllerWalk extends MotionControllerBase

Ground-based walking motion controller. Handles gravity, jumping, climbing over blocks, step-up logic, fluid interaction, hover oscillation, ground snapping, and fall damage. Uses 2D pathfinding (the Y axis is projected out of distance calculations via `is2D() = true`).

Built from JSON configuration via BuilderMotionControllerWalk with the type string `"Walk"`.

## Constants

- TYPE | String | "Walk" | Controller type identifier
- CLIMB_FORWARD_DISTANCE | double | 0.1 | Forward distance during climb step
- JUMP_FORWARD_DISTANCE | double | 0.5 | Forward distance during jump
- COLLISION_MATERIALS | int | 4 | Collision material mask (passive)
- WALKING_MATERIALS | int | 5 | Walking material mask (active)
- WALKING_MATERIALS_RELAXED | int | 13 | Relaxed walking material mask

## Key Fields

- minHorizontalSpeed | double | Minimum walking speed
- maxVerticalSpeed | double | Maximum fall speed
- acceleration | double | Acceleration rate
- maxRotationSpeed | double | Maximum rotation speed (radians/s)
- maxClimbHeight | double | Maximum height the NPC can climb over
- jumpHeight | double | Jump height above climb height
- jumpForce | double | Upward force multiplier for jumps
- maxDropHeight | double | Maximum safe drop height
- minHover` / `maxHover | double | Hover height range (0 = no hover)
- hoverFreq | double | Hover oscillation frequency
- fenceBlockSet | int | Block set index for unclimbable blocks
- onGround | boolean | Current ground contact state
- inWater | boolean | Current fluid contact state
- belowBlockType | BlockType | Block type directly below the NPC

## Constructor


public MotionControllerWalk(BuilderMotionControllerWalk builder, BuilderSupport builderSupport)

## Key Behaviors

### Ground Movement

The controller computes horizontal translation by accelerating toward the steering target speed, clamping to `maxMoveTurnAngle`, and applying heading rotation limits. When the turn angle exceeds `maxMoveTurnAngle`, horizontal speed is zeroed (the NPC turns in place).

### Climbing

When the NPC encounters an obstacle taller than step-up height but within `maxClimbHeight`, it enters the `ASCENDING` motion kind. Climb speed follows the formula: `climbSpeedConst + climbSpeedMult * walkSpeed ^ climbSpeedPow`.

### Jumping

Jumps trigger when the obstacle exceeds `minJumpHeight` and the distance exceeds `minJumpDistance`. The jump trajectory is shaped by `jumpForce`, `jumpBlending` (0 = curved, 1 = linear ascent), and `jumpDescentBlending` / `jumpDescentSteepness` for the descent arc.

### Hover

When `maxHover > 0`, the NPC hovers above ground with a sinusoidal oscillation between `minHover` and `maxHover` at `hoverFreq` Hz. Hover height adjusts during climbing (contracts) and dropping (expands). If `floatsDown` is true, the NPC gently descends; otherwise gravity applies normally.

### Descent

Descent animation is controlled by `descentAnimationType` (Walk, Fall, or Idle) and triggers when the predicted fall height exceeds `minDescentAnimationHeight`. Descent steepness and blending shape the forward motion curve during descent.

## Overrides

- getType() | "Walk" | Type identifier
- is2D() | true | Uses 2D projected pathfinding
- canRestAtPlace() | true | Can idle on ground
- getWanderVerticalMovementRatio() | 0.0 | No vertical wandering
- onGround() | boolean | Ground contact from footing probe
- inWater() | boolean | Fluid contact state

## Inner Enums

### DescentAnimationType


public static enum DescentAnimationType { Walk, Fall, Idle }

Controls which animation plays when the NPC walks downward over terrain.

### AscentAnimationType


public static enum AscentAnimationType { Walk, Jump, Climb, Fly, Idle }

Controls which animation plays when the NPC climbs upward over terrain.
