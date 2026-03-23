---
title: "FogOptions"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.weather.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.weather.config.FogOptions"
api_surface: false
extends: null
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "server"
  - "weather"
---
**Package:** `com.hypixel.hytale.server.core.asset.type.weather.config`

```java
public class FogOptions
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `boolean` | `ignoreFogLimits` |
| `private` | `float` | `effectiveViewDistanceMultiplier` |
| `private` | `Float` | `fogHeightCameraFixed` |
| `private` | `float` | `fogHeightCameraOffset` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `boolean` | `isIgnoreFogLimits()` |
| `public` | `float` | `getEffectiveViewDistanceMultiplier()` |
| `public` | `Float` | `getFogHeightCameraFixed()` |
| `public` | `float` | `getFogHeightCameraOffset()` |
| `public` | `com.hypixel.hytale.protocol.FogOptions` | `toPacket()` |
| `public` | `String` | `toString()` |
