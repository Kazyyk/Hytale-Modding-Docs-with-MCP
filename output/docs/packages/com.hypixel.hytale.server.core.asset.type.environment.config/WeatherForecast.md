---
title: "WeatherForecast"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.environment.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.environment.config.WeatherForecast"
api_surface: false
extends: ~
implements: 
  - "IWeightedElement"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "asset"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.environment.config`

```java
public class WeatherForecast implements IWeightedElement
```

Implementation of `IWeightedElement`.

## Fields

| Field | Type | Description |
|---|---|---|
| `EMPTY_ARRAY` | `WeatherForecast[]` | Static final WeatherForecast[] field. |
| `weatherId` | `String` | String field. |
| `weatherIndex` | `int` | int field. |
| `weight` | `double` | double field. |

## Constructors

| Constructor | Description |
|---|---|
| `WeatherForecast(String weatherId, double weight)` | Creates a new WeatherForecast instance. |
| `WeatherForecast()` | Creates a new WeatherForecast instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getWeatherId()` | `String` | public method. |
| `getWeatherIndex()` | `int` | public method. |
| `processConfig()` | `void` | protected method. |
| `toString()` | `String` | public method. |
| `getWeight()` | `double` | public method. |
