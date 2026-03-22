---
title: "RotatedPositionsScanResult"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.props.directionality"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.props.directionality.RotatedPositionsScanResult"
api_surface: false
extends: ~
implements: 
  - "ScanResult"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "worldgen"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.props.directionality`

```java
public class RotatedPositionsScanResult implements ScanResult
```

Implementation of `ScanResult`.

## Fields

| Field | Type | Description |
|---|---|---|
| `positions` | `List<RotatedPosition>` | final List<RotatedPosition> field. |

## Constructors

| Constructor | Description |
|---|---|
| `RotatedPositionsScanResult(@Nonnull List<RotatedPosition> positions)` | Creates a new RotatedPositionsScanResult instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `cast(ScanResult scanResult)` | `RotatedPositionsScanResult` | static public method. |
| `isNegative()` | `boolean` | public method. |
