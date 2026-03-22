---
title: "WeatherSetCommand"
kind: "class"
package: "com.hypixel.hytale.builtin.weather.commands"
fqcn: "com.hypixel.hytale.builtin.weather.commands.WeatherSetCommand"
api_surface: false
extends: "AbstractWorldCommand"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "weather"
  - "commands"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.weather.commands`

```java
public class WeatherSetCommand extends AbstractWorldCommand
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `RequiredArg<Weather>` | `weatherArg` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override protected` | `void` | `execute(CommandContext context, World world, Store<EntityStore> store)` |
| `protected static` | `void` | `setForcedWeather(World world, String forcedWeather, ComponentAccessor<EntityStore> componentAccessor)` |
