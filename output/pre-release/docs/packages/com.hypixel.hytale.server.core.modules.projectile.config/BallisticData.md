---
title: "BallisticData"
kind: "interface"
package: "com.hypixel.hytale.server.core.modules.projectile.config"
fqcn: "com.hypixel.hytale.server.core.modules.projectile.config.BallisticData"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "projectile"
  - "ballistics"
  - "config"
---

**Package:** `com.hypixel.hytale.server.core.modules.projectile.config`

```java
public interface BallisticData
```

Interface providing ballistic trajectory parameters for projectiles: muzzle velocity, gravity, shot center offsets, and pitch adjustment.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `double` | `getMuzzleVelocity()` |
| `public` | `double` | `getGravity()` |
| `public` | `double` | `getVerticalCenterShot()` |
| `public` | `double` | `getHorizontalCenterShot()` |
| `public` | `double` | `getDepthShot()` |
| `public` | `boolean` | `isPitchAdjustShot()` |
