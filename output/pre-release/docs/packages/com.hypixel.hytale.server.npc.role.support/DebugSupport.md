---
title: "DebugSupport"
kind: "class"
package: "com.hypixel.hytale.server.npc.role.support"
fqcn: "com.hypixel.hytale.server.npc.role.support.DebugSupport"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:28:03Z"
tags:
  - "server"
  - "npc"
  - "debug"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.role.support`

```java
public class DebugSupport
```

Manages debug visualization state for NPC roles. Tracks debug flags (steering, avoidance, sensor ranges, path visualization), records sensor range data, entity check data, and path waypoint data for visual debug rendering.

## Constructors

| Signature |
|---|
| `DebugSupport(NPCEntity parent, @Nonnull BuilderRole builder)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `RoleDebugDisplay` | `getDebugDisplay()` |
| `public` | `boolean` | `isTraceSuccess()` |
| `public` | `boolean` | `isTraceFail()` |
| `public` | `boolean` | `isTraceSensorFails()` |
| `public` | `void` | `setLastFailingSensor(Sensor sensor)` |
| `public` | `Sensor` | `getLastFailingSensor()` |
| `public` | `boolean` | `isDebugRoleSteering()` |
| `public` | `boolean` | `isDebugMotionSteering()` |
| `public` | `void` | `setDisplayCustomString(@Nullable String displayCustomString)` |
| `public` | `String` | `pollDisplayCustomString()` |
| `public` | `void` | `setDisplayPathfinderString(@Nullable String displayPathfinderString)` |
| `public` | `String` | `pollDisplayPathfinderString()` |
| `public` | `EnumSet<RoleDebugFlags>` | `getDebugFlags()` |
| `public` | `void` | `setDebugFlags(EnumSet<RoleDebugFlags> debugFlags)` |
| `public` | `boolean` | `isDebugFlagSet(RoleDebugFlags flag)` |
| `public` | `boolean` | `isAnyDebugFlagSet(@Nonnull EnumSet<RoleDebugFlags> flags)` |
| `public` | `void` | `registerDebugFlagsListener(DebugFlagsChangeListener listener)` |
| `public` | `void` | `removeDebugFlagsListener(DebugFlagsChangeListener listener)` |
| `public` | `void` | `notifyDebugFlagsListeners(EnumSet<RoleDebugFlags> flags)` |
| `public` | `boolean` | `isVisSensorRanges()` |
| `public` | `void` | `beginSensorVisualization()` |
| `public` | `int` | `recordSensorRange(double range, double minRange, double viewAngle)` |
| `public` | `void` | `recordEntityCheck(@Nonnull Ref<EntityStore> entityRef, int sensorColorIndex, boolean matched)` |
| `public` | `List<SensorVisData>` | `getSensorVisData()` |
| `public` | `Map<Ref<EntityStore>, List<EntityVisData>>` | `getEntityVisData()` |
| `public` | `boolean` | `hasSensorVisData()` |
| `public` | `void` | `clearSensorVisData()` |
| `public` | `boolean` | `isVisPath()` |
| `public` | `void` | `clearPathVisualization()` |
| `public` | `void` | `recordPathWaypoint(@Nonnull Vector3d position, boolean isCurrentTarget, boolean isEndNode)` |
| `public` | `void` | `recordPathWaypoint(@Nonnull Vector3d position, boolean isCurrentTarget, boolean isEndNode, boolean isSeekTarget)` |
| `public` | `List<PathWaypointVisData>` | `getPathVisData()` |
| `public` | `boolean` | `hasPathVisData()` |

## Inner Types

| Kind | Name | Description |
|---|---|---|
| interface | `DebugFlagsChangeListener` | Listener notified when debug flags change |
| record | `EntityVisData` | Stores sensor color index and match result for an entity check |
| record | [PathWaypointVisData](DebugSupport.PathWaypointVisData.md) | Waypoint visualization data along an NPC path |
| record | `SensorVisData` | Stores range, min range, color index, and view angle for a sensor |
