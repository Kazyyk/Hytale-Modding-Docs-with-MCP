---
title: "ProbeMoveData"
kind: "class"
package: "com.hypixel.hytale.server.npc.movement.controllers"
fqcn: "com.hypixel.hytale.server.npc.movement.controllers.ProbeMoveData"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "movement"
  - "controllers"
---

**Package:** `com.hypixel.hytale.server.npc.movement.controllers`

```java
public class ProbeMoveData
```

Data structure for probing movement validity along a direction. Used by `MotionController.probeMove()` to test whether an NPC can reach a target position, recording the path as a sequence of segments for path smoothing. Segments track start/end points, ground hits, wall hits, climbs, drops, and blocked positions.

## Fields

| Field | Type | Description |
|---|---|---|
| `probePosition` | `Vector3d` | Current probe position (mutated during probe) |
| `probeDirection` | `Vector3d` | Movement direction vector |
| `initialPosition` | `Vector3d` | Starting position of the probe |
| `targetPosition` | `Vector3d` | Desired end position |
| `directionComponentSelector` | `Vector3d` | Axis mask for direction calculations |
| `isAvoidingBlockDamage` | `boolean` | Whether to avoid damage-dealing blocks (default: `true`) |
| `isRelaxedMoveConstraints` | `boolean` | Whether relaxed collision constraints apply (default: `false`) |
| `onGround` | `boolean` | Ground contact state |
| `isSavingSegments` | `boolean` | Whether segment recording is enabled |
| `segmentCount` | `int` | Number of recorded segments |
| `segments` | `Segment[]` | Array of recorded path segments (initially 6, grows by 4) |

## Setup Methods

| Method | Description |
|---|---|
| `ProbeMoveData setPosition(Vector3d)` | Sets probe and initial position; returns `this` |
| `ProbeMoveData setDirection(Vector3d)` | Sets direction and computes target position; returns `this` |
| `ProbeMoveData setTargetPosition(Vector3d)` | Sets target and computes direction; returns `this` |
| `void setSaveSegments(boolean)` | Enables/disables segment recording |

## Probe Methods

| Method | Description |
|---|---|
| `boolean canAdvance(Ref<EntityStore>, MotionController, double threshold, ComponentAccessor<EntityStore>)` | Tests if the probe can advance at least `threshold * directionLength` |
| `boolean canAdvanceAbs(Ref<EntityStore>, MotionController, double requiredDistance, ComponentAccessor<EntityStore>)` | Tests if the probe can advance at least `requiredDistance` |
| `boolean canMoveTo(Ref<EntityStore>, MotionController, double maxDistance, ComponentAccessor<EntityStore>)` | Tests if the probe reaches within `maxDistance` of the target |
| `boolean canMoveTo(Ref<EntityStore>, MotionController, double maxDistance, double maxDistanceY, ComponentAccessor<EntityStore>)` | 2D variant with separate Y tolerance |
| `boolean computePosition(double distance, Vector3d result)` | Interpolates a position along recorded segments at the given distance |

## Segment Recording

| Method | Description |
|---|---|
| `boolean startProbing()` | Resets segment count; returns whether saving is enabled |
| `void addStartSegment(Vector3d, boolean)` | Records probe start |
| `void addEndSegment(Vector3d, boolean, double)` | Records probe end |
| `void addMoveSegment(Vector3d, boolean, double)` | Records a free-move segment |
| `void addHitGroundSegment(Vector3d, double, Vector3d, int)` | Records a ground collision |
| `void addHitWallSegment(Vector3d, boolean, double, Vector3d, int)` | Records a wall collision |
| `void addClimbSegment(Vector3d, double, int)` | Records a climb step |
| `void addDropSegment(Vector3d, double)` | Records a drop step |
| `void addHitEdgeSegment(Vector3d, double)` | Records hitting a terrain edge |
| `void addBlockedGroundSegment(Vector3d, double, Vector3d, int)` | Records blocked on ground |
| `void addBlockedDropSegment(Vector3d, double)` | Records blocked during drop |
| `void changeSegmentToBlockedWall()` | Reclassifies the last segment as blocked wall |
| `void changeSegmentToBlockedEdge()` | Reclassifies the last segment as blocked edge |

## Inner Classes

### Segment

```java
public static class Segment
```

A single segment of a probed movement path.

| Field | Type | Description |
|---|---|---|
| `type` | `Segment.Type` | Segment classification |
| `position` | `Vector3d` | Position at this segment |
| `normal` | `Vector3d` | Collision normal (if applicable) |
| `distance` | `double` | Cumulative distance from start |
| `onGround` | `boolean` | Ground contact at this point |
| `blockId` | `int` | Block ID involved (if applicable) |

### Segment.Type

```java
public static enum Type { START, HIT_GROUND, MOVE, BLOCKED_GROUND, HIT_WALL, BLOCKED_WALL, CLIMB, HIT_EDGE, BLOCKED_EDGE, DROP, BLOCKED_DROP, END }
```

| Value | Blocked | Interpolatable | Description |
|---|---|---|---|
| `START` | false | false | Probe start point |
| `HIT_GROUND` | false | true | Hit the ground surface |
| `MOVE` | false | true | Free movement |
| `BLOCKED_GROUND` | true | true | Blocked by ground |
| `HIT_WALL` | false | true | Hit a vertical surface |
| `BLOCKED_WALL` | true | true | Blocked by wall |
| `CLIMB` | false | false | Climbing a step |
| `HIT_EDGE` | false | true | Hit a terrain edge |
| `BLOCKED_EDGE` | true | true | Blocked at edge |
| `DROP` | false | false | Dropping down |
| `BLOCKED_DROP` | true | false | Blocked during drop |
| `END` | false | true | Probe end point |
