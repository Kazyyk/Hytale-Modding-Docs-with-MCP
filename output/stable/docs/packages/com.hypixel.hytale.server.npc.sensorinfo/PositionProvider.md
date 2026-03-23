---
title: "PositionProvider"
kind: "class"
package: "com.hypixel.hytale.server.npc.sensorinfo"
fqcn: "com.hypixel.hytale.server.npc.sensorinfo.PositionProvider"
api_surface: false
extends: "InfoProviderBase"
implements: 
  - "IPositionProvider"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "npc"
---

**Package:** `com.hypixel.hytale.server.npc.sensorinfo`

```java
public class PositionProvider extends InfoProviderBase implements IPositionProvider
```

Implementation of `IPositionProvider`.

## Fields

| Field | Type | Description |
|---|---|---|
| `x` | `double` | double field. |
| `y` | `double` | double field. |
| `z` | `double` | double field. |
| `isValid` | `boolean` | boolean field. |

## Constructors

| Constructor | Description |
|---|---|
| `PositionProvider()` | Creates a new PositionProvider instance. |
| `PositionProvider(ParameterProvider parameterProvider)` | Creates a new PositionProvider instance. |
| `PositionProvider(ParameterProvider parameterProvider, ExtraInfoProvider... providers)` | Creates a new PositionProvider instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `clear()` | `void` | public method. |
| `setTarget(@Nullable Ref<EntityStore> ref, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` | `Ref<EntityStore>` | public method. |
| `setTarget(@Nonnull Vector3d pos)` | `void` | public method. |
| `setTarget(double x, double y, double z)` | `void` | public method. |
| `providePosition(@Nonnull Vector3d result)` | `boolean` | public method. |
| `getX()` | `double` | public method. |
| `getY()` | `double` | public method. |
| `getZ()` | `double` | public method. |
| `getPositionProvider()` | `IPositionProvider` | public method. |
| `hasPosition()` | `boolean` | public method. |
| `getTarget()` | `Ref<EntityStore>` | public method. |
