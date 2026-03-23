# MotionControllerBase

Type: class | Package: com.hypixel.hytale.server.npc.movement.controllers | Implements: MotionController

public abstract class MotionControllerBase implements MotionController

Abstract base class for all motion controllers. Provides shared infrastructure for collision detection, force/velocity management, heading interpolation, movement state updates, bounding box handling, and debug mode support. The three concrete subclasses are MotionControllerWalk, MotionControllerFly, and MotionControllerDive.

Built from JSON configuration via BuilderMotionControllerBase.

## Constants

- FORCE_SCALE | double | 5.0 | Multiplier applied to external forces
- BISECT_DIST | double | 0.05 | Binary search convergence threshold for position bisection
- FILTER_COEFFICIENT | double | 0.7 | Low-pass filter coefficient for speed smoothing
- DOT_PRODUCT_EPSILON | double | 0.001 | Epsilon for dot-product comparisons
- DEFAULT_BLOCK_DRAG | double | 0.82 | Default block surface drag coefficient

## Key Fields

- entity | NPCEntity | The owning NPC entity component
- type | String | Controller type string
- position | Vector3d | Current position (mutable working copy)
- collisionBoundingBox | Box | Collision bounding box
- collisionResult | CollisionResult | Reusable collision result buffer
- forceVelocity | Vector3d | Externally applied velocity
- appliedVelocities | List<AppliedVelocity> | List of stacked applied velocities
- navState | NavState | Current pathfinding navigation state
- motionKind | MotionKind | Current motion animation kind
- moveSpeed | double | Current horizontal move speed
- effectHorizontalSpeedMultiplier | double | Speed multiplier from movement effects
- maxHorizontalSpeed | double | Configured maximum horizontal speed
- gravity | double | Gravity constant
- inertia | double | Mass/inertia factor
- knockbackScale | double | Knockback force multiplier

## Constructor


public MotionControllerBase(BuilderSupport builderSupport, BuilderMotionControllerBase builder)

Reads the entity from builder support and initializes all base parameters from the builder configuration including epsilon values, speed limits, force velocity damping, and head rotation speed.

## Abstract Methods

Subclasses must implement:

- double computeMove(Ref<EntityStore>, Role, Steering, double, Vector3d, ComponentAccessor<EntityStore>) | Computes the movement translation vector for one tick
- double executeMove(Ref<EntityStore>, Role, double, Vector3d, ComponentAccessor<EntityStore>) | Executes collision-checked movement
- boolean isFastMotionKind(double speed) | Determines whether the current speed qualifies as "fast" (running vs walking)

## Key Methods

- void readEntityPosition(Ref<EntityStore>, ComponentAccessor<EntityStore>) | Copies entity transform into working fields
- void moveEntity(Ref<EntityStore>, double, ComponentAccessor<EntityStore>) | Writes working position/rotation back to entity
- void updateMovementState(...) | Maps `MotionKind` to `MovementStates` flags for animation
- boolean touchesWater(boolean, ComponentAccessor<EntityStore>) | Checks fluid presence at the entity's feet
- double bisect(Vector3d, Vector3d, T, BiPredicate, Vector3d) | Binary search between valid and invalid positions to find the last valid point

## Movement State Mapping

The base class maps `MotionKind` values to `MovementStates` animation flags:

- `FLYING` -> `flying=true`, walking/running based on speed
- `SWIMMING` / `SWIMMING_TURNING` -> `swimming=true`, walking/running based on speed
- `ASCENDING` -> delegated to subclass (Jump, Walk, Climb, Fly, or Idle)
- `MOVING` -> standard walk/run with hover check
- `DESCENDING` -> delegated to subclass (Walk, Fall, or Idle based on height)
- `DROPPING` -> `falling=true`
- `STANDING` -> `idle=true`, all locomotion flags false

## Inner Classes

### AppliedVelocity

Tracks a single externally applied velocity with its `VelocityConfig`, a `canClear` flag, and `ignoreDamping` option. Multiple applied velocities are accumulated during force resolution.
