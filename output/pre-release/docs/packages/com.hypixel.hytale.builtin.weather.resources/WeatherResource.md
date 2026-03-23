---
title: "WeatherResource"
kind: "class"
package: "com.hypixel.hytale.builtin.weather.resources"
fqcn: "com.hypixel.hytale.builtin.weather.resources.WeatherResource"
api_surface: false
extends: ~
implements: ['Resource']
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "builtin"
  - "weather"
  - "resources"
---

**Package:** `com.hypixel.hytale.builtin.weather.resources`

```java
public class WeatherResource implements Resource<EntityStore>
```

ECS resource attached to `EntityStore`.

## Constants

| Constant | Type |
|---|---|
| `WEATHER_UPDATE_RATE_S` | `float` |

## Accessors

| Method | Returns | Description |
|---|---|---|
| `getResourceType()` | `ResourceType<EntityStore, WeatherResource>` | Accessor method. |
| `getEnvironmentWeather()` | `Int2IntMap` | Accessor method. |
| `getWeatherIndexForEnvironment(int environmentId)` | `int` | Accessor method. |
| `getForcedWeatherIndex()` | `int` | Accessor method. |
| `setForcedWeather(String forcedWeather)` | `void` | Mutator method. |

## Methods

| Method | Returns | Description |
|---|---|---|
| `consumeForcedWeatherChange()` | `boolean` | Instance method. |
| `compareAndSwapHour(int currentHour)` | `boolean` | Instance method. |
