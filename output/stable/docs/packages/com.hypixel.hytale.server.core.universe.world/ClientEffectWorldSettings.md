---
title: "ClientEffectWorldSettings"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world"
fqcn: "com.hypixel.hytale.server.core.universe.world.ClientEffectWorldSettings"
api_surface: true
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "world"
  - "settings"
  - "client-effects"
  - "rendering"
---

**Package:** `com.hypixel.hytale.server.core.universe.world`

```java
public class ClientEffectWorldSettings
```

Configurable settings for client-side visual effects in a world, including sun position, bloom, and sunshaft parameters. Serialized via `BuilderCodec` and stored in `WorldConfig`. Produces `UpdateSunSettings` and `UpdatePostFxSettings` packets for client synchronization.

## Fields

| Field | Type | Default | Codec Key | Description |
|---|---|---|---|---|
| `sunHeightPercent` | `float` | `100.0F` | `SunHeightPercent` | Sun height as a percentage. |
| `sunAngleRadians` | `float` | `0.0F` | `SunAngleDegrees` (stored as degrees) | Sun angle in radians (codec converts degrees to radians). |
| `bloomIntensity` | `float` | `0.3F` | `BloomIntensity` | Post-processing bloom intensity. |
| `bloomPower` | `float` | `8.0F` | `BloomPower` | Post-processing bloom power exponent. |
| `sunIntensity` | `float` | `0.25F` | `SunIntensity` | Directional sun light intensity. |
| `sunshaftIntensity` | `float` | `0.3F` | `SunshaftIntensity` | Sunshaft (god ray) intensity. |
| `sunshaftScaleFactor` | `float` | `4.0F` | `SunshaftScaleFactor` | Sunshaft scale factor. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getSunHeightPercent()` | `float` | Returns the sun height percentage. |
| `setSunHeightPercent(float)` | `void` | Sets the sun height percentage. |
| `getSunAngleRadians()` | `float` | Returns the sun angle in radians. |
| `setSunAngleRadians(float)` | `void` | Sets the sun angle in radians. |
| `getBloomIntensity()` | `float` | Returns the bloom intensity. |
| `setBloomIntensity(float)` | `void` | Sets the bloom intensity. |
| `getBloomPower()` | `float` | Returns the bloom power. |
| `setBloomPower(float)` | `void` | Sets the bloom power. |
| `getSunIntensity()` | `float` | Returns the sun intensity. |
| `setSunIntensity(float)` | `void` | Sets the sun intensity. |
| `getSunshaftIntensity()` | `float` | Returns the sunshaft intensity. |
| `setSunshaftIntensity(float)` | `void` | Sets the sunshaft intensity. |
| `getSunshaftScaleFactor()` | `float` | Returns the sunshaft scale factor. |
| `setSunshaftScaleFactor(float)` | `void` | Sets the sunshaft scale factor. |
| `createSunSettingsPacket()` | `UpdateSunSettings` | Creates a packet with current sun height and angle. |
| `createPostFxSettingsPacket()` | `UpdatePostFxSettings` | Creates a packet with current bloom and sunshaft settings. |
