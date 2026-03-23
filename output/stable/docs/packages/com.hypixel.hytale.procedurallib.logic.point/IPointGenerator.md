---
title: "IPointGenerator"
kind: "interface"
package: "com.hypixel.hytale.procedurallib.logic.point"
fqcn: "com.hypixel.hytale.procedurallib.logic.point.IPointGenerator"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "procedurallib"
  - "logic"
  - "point"
  - "interface"
---

**Package:** `com.hypixel.hytale.procedurallib.logic.point`

```java
public interface IPointGenerator
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `ResultBuffer.ResultBuffer2d` | `nearest2D(int var1, double var2, double var4)` |
| `` | `ResultBuffer.ResultBuffer3d` | `nearest3D(int var1, double var2, double var4, double var6)` |
| `` | `ResultBuffer.ResultBuffer2d` | `transition2D(int var1, double var2, double var4)` |
| `` | `ResultBuffer.ResultBuffer3d` | `transition3D(int var1, double var2, double var4, double var6)` |
| `` | `void` | `collect(int var1, double var2, double var4, double var6, double var8, IPointGenerator.PointConsumer2d var10)` |
| `` | `double` | `getInterval()` |

## Inner Types

- `IPointGenerator.PointConsumer2d`
