---
title: "WrappedInfoProvider"
kind: "class"
package: "com.hypixel.hytale.server.npc.sensorinfo"
fqcn: "com.hypixel.hytale.server.npc.sensorinfo.WrappedInfoProvider"
api_surface: false
extends: ~
implements: 
  - "InfoProvider"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "npc"
---

**Package:** `com.hypixel.hytale.server.npc.sensorinfo`

```java
public class WrappedInfoProvider implements InfoProvider
```

Implementation of `InfoProvider`.

## Fields

| Field | Type | Description |
|---|---|---|
| `sensors` | `List<Sensor>` | final List<Sensor> field. |
| `positionMatch` | `IPositionProvider` | IPositionProvider field. |
| `passedExtraInfo` | `ExtraInfoProvider` | ExtraInfoProvider field. |

## Constructors

| Constructor | Description |
|---|---|
| `WrappedInfoProvider()` | Creates a new WrappedInfoProvider instance. |
| `WrappedInfoProvider(Sensor[] sensors)` | Creates a new WrappedInfoProvider instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getExtraInfo(Class<E> clazz)` | `E` | public method. |
| `passExtraInfo(E provider)` | `void` | public method. |
| `getPassedExtraInfo(Class<E> clazz)` | `E` | public method. |
| `hasPosition()` | `boolean` | public method. |
| `getPositionProvider()` | `IPositionProvider` | public method. |
| `getParameterProvider(int parameter)` | `ParameterProvider` | public method. |
| `clearMatches()` | `void` | public method. |
| `addMatch(Sensor sensor)` | `void` | public method. |
| `clearPositionMatch()` | `void` | public method. |
| `setPositionMatch(IPositionProvider provider)` | `void` | public method. |
