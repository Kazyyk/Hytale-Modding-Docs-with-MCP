---
title: "FillerPropScanResult"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.props.filler"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.props.filler.FillerPropScanResult"
api_surface: false
extends: ~
implements: 
  - "ScanResult"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "worldgen"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.props.filler`

```java
public class FillerPropScanResult implements ScanResult
```

Implementation of `ScanResult`.

## Fields

| Field | Type | Description |
|---|---|---|
| `positions` | `List<Vector3i>` | List<Vector3i> field. |

## Constructors

| Constructor | Description |
|---|---|
| `FillerPropScanResult(@Nullable List<Vector3i> positions)` | Creates a new FillerPropScanResult instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getFluidBlocks()` | `List<Vector3i>` | public method. |
| `cast(ScanResult scanResult)` | `FillerPropScanResult` | static public method. |
| `isNegative()` | `boolean` | public method. |
