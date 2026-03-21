---
title: "WeatherTracker"
kind: "class"
package: "com.hypixel.hytale.builtin.weather.components"
fqcn: "com.hypixel.hytale.builtin.weather.components.WeatherTracker"
api_surface: false
extends: null
implements: ["Component"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "weather"
  - "components"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.weather.components`

```java
public class WeatherTracker implements Component
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `UpdateWeather` | `updateWeather` |
| `private final` | `Vector3i` | `previousBlockPosition` |
| `private` | `int` | `environmentId` |
| `private` | `boolean` | `firstSendForWorld` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ComponentType<EntityStore,WeatherTracker>` | `getComponentType()` |
| `public` | `void` | `updateWeather(PlayerRef playerRef, WeatherResource weatherComponent, TransformComponent transformComponent, float transitionSeconds, ComponentAccessor<EntityStore> componentAccessor)` |
| `public` | `void` | `sendWeatherIndex(PlayerRef playerRef, int weatherIndex, float transitionSeconds)` |
| `public` | `boolean` | `consumeFirstSendForWorld()` |
| `public` | `void` | `clear()` |
| `public` | `void` | `updateEnvironment(TransformComponent transformComponent, ComponentAccessor<EntityStore> componentAccessor)` |
| `public` | `int` | `getEnvironmentId()` |
| `public` | `int` | `getWeatherIndex()` |
| `public` | `void` | `setWeatherIndex(PlayerRef playerRef, int weatherIndex)` |
| `@Nonnull @Override public` | `Component<EntityStore>` | `clone()` |
