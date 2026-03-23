---
title: "AimingHelper"
kind: "class"
package: "com.hypixel.hytale.server.npc.util"
fqcn: "com.hypixel.hytale.server.npc.util.AimingHelper"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "npc"
  - "utility"
---

**Package:** `com.hypixel.hytale.server.npc.util`

```java
public class AimingHelper
```

Static utility class providing ballistic pitch computation for NPC aiming. Calculates launch angles for parabolic projectile trajectories given distance, height, velocity, and gravity parameters.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `double` | `ensurePossibleThrowSpeed(double distance, double y, double gravity, double throwSpeed)` |
| `public static` | `boolean` | `computePitch(double distance, double height, double velocity, double gravity, float[] resultingPitch)` |
