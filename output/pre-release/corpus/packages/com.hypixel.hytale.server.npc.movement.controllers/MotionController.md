# MotionController

Type: interface | Package: com.hypixel.hytale.server.npc.movement.controllers | Extends: DebugSupport.DebugFlagsChangeListener

public interface MotionController extends DebugSupport.DebugFlagsChangeListener

Root interface for all NPC motion controllers. Defines the contract for steering, movement probing, collision queries, velocity estimation, position validation, and movement state management. The three concrete implementations are MotionControllerWalk, MotionControllerFly, and MotionControllerDive, all via MotionControllerBase.

## Methods

### Identity & Lifecycle

- String getType() | Returns the controller type string (e.g. `"Walk"`, `"Fly"`, `"Dive"`)
- Role getRole() | Returns the owning `Role
- void setRole(Role var1) | Sets the owning `Role
- void spawned() | Called once after the NPC entity has been spawned
- void activate() | Called when this controller becomes the active controller
- void deactivate() | Called when this controller is deactivated

### Movement Computation

- double steer(Ref<EntityStore>, Role, Steering, Steering, double, ComponentAccessor<EntityStore>) | Main steering entry point -- computes movement for a tick
- double probeMove(Ref<EntityStore>, Vector3d, Vector3d, ProbeMoveData, ComponentAccessor<EntityStore>) | Probes whether a move from a position in a direction is valid
- double probeMove(Ref<EntityStore>, ProbeMoveData, ComponentAccessor<EntityStore>) | Probes movement using pre-configured ProbeMoveData
- void constrainRotations(Role, TransformComponent) | Applies rotation constraints after movement
- void updateMovementState(Ref<EntityStore>, MovementStates, Steering, Vector3d, ComponentAccessor<EntityStore>) | Updates the entity's `MovementStates` flags
- boolean estimateVelocity(Steering, Vector3d) | Estimates the velocity vector for the current state
- void beforeInstructionSensorsAndActions(double) | Pre-tick hook before sensors/actions evaluate
- void beforeInstructionMotion(double) | Pre-tick hook before motion is applied

### Speed & State Queries

- double getMaximumSpeed() | Maximum possible speed for this controller
- double getCurrentSpeed() | Current movement speed
- double getCurrentMaxBodyRotationSpeed() | Maximum body rotation speed in radians/second
- double getCurrentTurnRadius() | Current turn radius based on speed and rotation limits
- boolean isInProgress() | Whether the controller is mid-action (climbing, descending, etc.)
- boolean isObstructed() | Whether the last move hit a collision
- boolean inAir() | Whether the NPC is airborne
- boolean inWater() | Whether the NPC is submerged
- boolean onGround() | Whether the NPC is on solid ground
- boolean standingOnBlockOfType(int) | Whether the NPC stands on a specific block type
- boolean canAct(Ref<EntityStore>, ComponentAccessor<EntityStore>) | Whether the NPC can perform voluntary movement

### Navigation

- double waypointDistance(Vector3d, Vector3d) | Distance between two positions in the controller's coordinate space
- double waypointDistanceSquared(Vector3d, Vector3d) | Squared distance variant
- double waypointDistance(Ref<EntityStore>, Vector3d, ComponentAccessor<EntityStore>) | Distance from entity to a position
- double waypointDistanceSquared(Ref<EntityStore>, Vector3d, ComponentAccessor<EntityStore>) | Squared distance from entity to position
- NavState getNavState() | Current navigation state
- void setNavState(NavState, double, double) | Sets the navigation state with throttle and target delta
- void setForceRecomputePath(boolean) | Forces the pathfinder to recompute
- boolean isForceRecomputePath() | Whether a path recompute is pending
- boolean canRestAtPlace() | Whether the NPC can idle at its current position
- boolean is2D() | Whether pathfinding is projected onto 2D (Walk = true, Fly/Dive = false)

### Physics & Forces

- double getGravity() | Gravity constant
- void setInertia(double) | Sets the inertia (mass) factor
- void setKnockbackScale(double) | Sets the knockback multiplier
- void addForce(Vector3d, VelocityConfig) | Applies an external force
- Vector3d getForce() | Returns the current accumulated force
- void forceVelocity(Vector3d, VelocityConfig, boolean) | Directly sets velocity
- void updatePhysicsValues(PhysicsValues) | Synchronizes physics parameters

### Model & Bounding Box

- void updateModelParameters(Ref<EntityStore>, Model, Box, ComponentAccessor<EntityStore>) | Updates collision bounding box from model
- Vector3d getComponentSelector() | Returns the axis mask for distance calculations
- Vector3d getPlanarComponentSelector() | Returns the planar axis mask
- void setComponentSelector(Vector3d) | Sets the axis mask
- Vector3d getWorldNormal() | Returns the world up direction
- Vector3d getWorldAntiNormal() | Returns the world down direction
- float getMaxClimbAngle() | Maximum climbable slope angle in radians
- float getMaxSinkAngle() | Maximum sinkable slope angle in radians
- boolean translateToAccessiblePosition(Vector3d, Box, double, double, ComponentAccessor<EntityStore>) | Adjusts a position to be reachable

### Altitude & Vertical Control

- MotionController.VerticalRange getDesiredVerticalRange(Ref<EntityStore>, ComponentAccessor<EntityStore>) | Computes the desired altitude band
- double getWanderVerticalMovementRatio() | Vertical movement ratio during wander behavior
- double getDesiredAltitudeWeight() | How strongly the NPC seeks its desired altitude (0..1)
- double getHeightOverGround() | Current height above ground surface

### Overrides

- void requirePreciseMovement(Vector3d) | Enables precise movement toward a target
- void requireDepthProbing() | Enables depth probing for the next tick
- void enableHeadingBlending(double, Vector3d, double) | Enables smooth heading interpolation
- void enableHeadingBlending() | Enables heading blending with defaults
- void setRelaxedMoveConstraints(boolean) | Relaxes collision constraints
- void setAvoidingBlockDamage(boolean) | Sets block damage avoidance
- void clearOverrides() | Resets all per-tick overrides
- void setHeadPitchAngleRange(float[]) | Sets the head pitch clamp range

## Inner Classes

### VerticalRange


public static class VerticalRange

Mutable data class holding the current, minimum, and maximum vertical position for altitude-constrained controllers.

- current | double | Current vertical position
- min | double | Minimum desired altitude
- max | double | Maximum desired altitude

- void assign(double current, double min, double max) | Sets all three values
- boolean isWithinRange() | Returns true if `current` is between `min` and `max` inclusive

## Static Methods


static boolean isInMovementState(Ref<EntityStore> ref, MovementState state, ComponentAccessor<EntityStore> componentAccessor)

Checks whether an entity matches a given `MovementState` enum value by inspecting its `MovementStatesComponent` and `Velocity`. The `IDLE` state checks that velocity is close to zero; `WALKING` checks that the entity is moving but not in any other flagged state; `ANY` always returns true.

## Default Methods


default boolean matchesType(Class<? extends MotionController> clazz)

Returns true if this controller is an instance of the given class. Used for runtime controller type checks.


default double getSquaredDistance(Vector3d p1, Vector3d p2, boolean useProjectedDistance)

Returns either the projected waypoint distance squared or the full 3D distance squared depending on the `useProjectedDistance` flag.