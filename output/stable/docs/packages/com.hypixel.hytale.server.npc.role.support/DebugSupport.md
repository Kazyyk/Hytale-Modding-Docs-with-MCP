---
title: "DebugSupport"
kind: "class"
package: "com.hypixel.hytale.server.npc.role.support"
fqcn: "com.hypixel.hytale.server.npc.role.support.DebugSupport"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "npc"
  - "role"
  - "debug"
---

**Package:** `com.hypixel.hytale.server.npc.role.support`

```java
public class DebugSupport
```

Manages debug flags, trace logging toggles, and sensor visualization data for an NPC role. Notifies registered `DebugFlagsChangeListener` instances when flags change. Maintains optional lists of `SensorVisData` (range/color pairs) and `EntityVisData` (per-entity match results) for debug rendering.

## Constructors

| Signature |
|---|
| `public DebugSupport(NPCEntity parent, @Nonnull BuilderRole builder)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nullable public` | `RoleDebugDisplay` | `getDebugDisplay()` |
| `public` | `boolean` | `isTraceSuccess()` |
| `public` | `boolean` | `isTraceFail()` |
| `public` | `boolean` | `isTraceSensorFails()` |
| `public` | `void` | `setLastFailingSensor(Sensor sensor)` |
| `public` | `Sensor` | `getLastFailingSensor()` |
| `public` | `boolean` | `isDebugRoleSteering()` |
| `public` | `boolean` | `isDebugMotionSteering()` |
| `public` | `void` | `setDisplayCustomString(String displayCustomString)` |
| `@Nullable public` | `String` | `pollDisplayCustomString()` |
| `public` | `void` | `setDisplayPathfinderString(String displayPathfinderString)` |
| `@Nullable public` | `String` | `pollDisplayPathfinderString()` |
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
| `@Nullable public` | `List<SensorVisData>` | `getSensorVisData()` |
| `@Nullable public` | `Map<Ref<EntityStore>, List<EntityVisData>>` | `getEntityVisData()` |
| `public` | `boolean` | `hasSensorVisData()` |
| `public` | `void` | `clearSensorVisData()` |

## Inner Types

### DebugFlagsChangeListener (interface)

```java
public interface DebugFlagsChangeListener {
    void onDebugFlagsChanged(EnumSet<RoleDebugFlags> flags);
}
```

### EntityVisData (record)

```java
public record EntityVisData(int sensorColorIndex, boolean matched)
```

### SensorVisData (record)

```java
public record SensorVisData(double range, double minRange, int colorIndex, double viewAngle)
```
