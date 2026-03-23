# ProbeMoveData

Type: class | Package: com.hypixel.hytale.server.npc.movement.controllers

public class ProbeMoveData

Data structure for probing movement validity along a direction. Used by `MotionController.probeMove()` to test whether an NPC can reach a target position, recording the path as a sequence of segments for path smoothing. Segments track start/end points, ground hits, wall hits, climbs, drops, and blocked positions.

## Fields

- probePosition | Vector3d | Current probe position (mutated during probe)
- probeDirection | Vector3d | Movement direction vector
- initialPosition | Vector3d | Starting position of the probe
- targetPosition | Vector3d | Desired end position
- directionComponentSelector | Vector3d | Axis mask for direction calculations
- isAvoidingBlockDamage | boolean | Whether to avoid damage-dealing blocks (default: `true`)
- isRelaxedMoveConstraints | boolean | Whether relaxed collision constraints apply (default: `false`)
- onGround | boolean | Ground contact state
- isSavingSegments | boolean | Whether segment recording is enabled
- segmentCount | int | Number of recorded segments
- segments | Segment[] | Array of recorded path segments (initially 6, grows by 4)

## Setup Methods

- ProbeMoveData setPosition(Vector3d) | Sets probe and initial position; returns `this
- ProbeMoveData setDirection(Vector3d) | Sets direction and computes target position; returns `this
- ProbeMoveData setTargetPosition(Vector3d) | Sets target and computes direction; returns `this
- void setSaveSegments(boolean) | Enables/disables segment recording

## Probe Methods

- boolean canAdvance(Ref<EntityStore>, MotionController, double threshold, ComponentAccessor<EntityStore>) | Tests if the probe can advance at least `threshold * directionLength
- boolean canAdvanceAbs(Ref<EntityStore>, MotionController, double requiredDistance, ComponentAccessor<EntityStore>) | Tests if the probe can advance at least `requiredDistance
- boolean canMoveTo(Ref<EntityStore>, MotionController, double maxDistance, ComponentAccessor<EntityStore>) | Tests if the probe reaches within `maxDistance` of the target
- boolean canMoveTo(Ref<EntityStore>, MotionController, double maxDistance, double maxDistanceY, ComponentAccessor<EntityStore>) | 2D variant with separate Y tolerance
- boolean computePosition(double distance, Vector3d result) | Interpolates a position along recorded segments at the given distance

## Segment Recording

- boolean startProbing() | Resets segment count; returns whether saving is enabled
- void addStartSegment(Vector3d, boolean) | Records probe start
- void addEndSegment(Vector3d, boolean, double) | Records probe end
- void addMoveSegment(Vector3d, boolean, double) | Records a free-move segment
- void addHitGroundSegment(Vector3d, double, Vector3d, int) | Records a ground collision
- void addHitWallSegment(Vector3d, boolean, double, Vector3d, int) | Records a wall collision
- void addClimbSegment(Vector3d, double, int) | Records a climb step
- void addDropSegment(Vector3d, double) | Records a drop step
- void addHitEdgeSegment(Vector3d, double) | Records hitting a terrain edge
- void addBlockedGroundSegment(Vector3d, double, Vector3d, int) | Records blocked on ground
- void addBlockedDropSegment(Vector3d, double) | Records blocked during drop
- void changeSegmentToBlockedWall() | Reclassifies the last segment as blocked wall
- void changeSegmentToBlockedEdge() | Reclassifies the last segment as blocked edge

## Inner Classes

### Segment


public static class Segment

A single segment of a probed movement path.

- type | Segment.Type | Segment classification
- position | Vector3d | Position at this segment
- normal | Vector3d | Collision normal (if applicable)
- distance | double | Cumulative distance from start
- onGround | boolean | Ground contact at this point
- blockId | int | Block ID involved (if applicable)

### Segment.Type


public static enum Type { START, HIT_GROUND, MOVE, BLOCKED_GROUND, HIT_WALL, BLOCKED_WALL, CLIMB, HIT_EDGE, BLOCKED_EDGE, DROP, BLOCKED_DROP, END }

- START | false | false | Probe start point
- HIT_GROUND | false | true | Hit the ground surface
- MOVE | false | true | Free movement
- BLOCKED_GROUND | true | true | Blocked by ground
- HIT_WALL | false | true | Hit a vertical surface
- BLOCKED_WALL | true | true | Blocked by wall
- CLIMB | false | false | Climbing a step
- HIT_EDGE | false | true | Hit a terrain edge
- BLOCKED_EDGE | true | true | Blocked at edge
- DROP | false | false | Dropping down
- BLOCKED_DROP | true | false | Blocked during drop
- END | false | true | Probe end point

Also in this package: AppliedVelocity, AscentAnimationType, BuilderMotionControllerMapUtil, DescentAnimationType, MotionControllerBase, MotionControllerDive, MotionControllerFly, MotionControllerWalk, Segment, Type

Complete API:
  public void setSaveSegments(boolean saveSegments)
  public boolean isAvoidingBlockDamage()
  public void setAvoidingBlockDamage(boolean avoid)
  public boolean isRelaxedMoveConstraints()
  public void setRelaxedMoveConstraints(boolean relaxedMoveConstraints)
  public ProbeMoveData setPosition(Vector3d position)
  public ProbeMoveData setDirection(Vector3d direction)
  public ProbeMoveData setTargetPosition(Vector3d targetPosition)
  public boolean canAdvance(Ref<EntityStore> ref, MotionController motionController, double threshold, ComponentAccessor<EntityStore> componentAccessor)
  public boolean canAdvanceAbs(Ref<EntityStore> ref, MotionController motionController, double requiredDistance, ComponentAccessor<EntityStore> componentAccessor)
  public boolean canMoveTo(Ref<EntityStore> ref, MotionController motionController, double maxDistance, double maxDistanceY, ComponentAccessor<EntityStore> componentAccessor)
  public boolean canMoveTo(Ref<EntityStore> ref, MotionController motionController, double maxDistance, ComponentAccessor<EntityStore> componentAccessor)
  public boolean computePosition(double distance, Vector3d result)
  public boolean startProbing()
  public void addStartSegment(Vector3d position, boolean onGround)
  public void addEndSegment(Vector3d position, boolean onGround, double distance)
  public void addBlockedGroundSegment(Vector3d position, double distance, Vector3d normal, int blockId)
  public void addHitGroundSegment(Vector3d position, double distance, Vector3d normal, int blockId)
  public void addHitWallSegment(Vector3d position, boolean onGround, double distance, Vector3d normal, int blockId)
  public void addMoveSegment(Vector3d position, boolean onGround, double distance)
  public void addClimbSegment(Vector3d position, double distance, int blockId)
  public void addHitEdgeSegment(Vector3d position, double distance)
  public void addDropSegment(Vector3d position, double distance)
  public void addBlockedDropSegment(Vector3d position, double distance)
  public void changeSegmentToBlockedWall()
  public void changeSegmentToBlockedEdge()
  public double getLastDistance()
  protected ProbeMoveData.Segment newSegment()

Fields:
public final Vector3d probePosition
public final Vector3d probeDirection
public final Vector3d initialPosition
public final Vector3d targetPosition
public final Vector3d directionComponentSelector
public boolean isAvoidingBlockDamage
public boolean isRelaxedMoveConstraints
public boolean onGround
public boolean isSavingSegments
public int segmentCount
public ProbeMoveData.Segment[] segments
