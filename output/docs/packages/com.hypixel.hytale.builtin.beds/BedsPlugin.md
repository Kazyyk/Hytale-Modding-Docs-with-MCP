---
title: "BedsPlugin"
kind: "class"
package: "com.hypixel.hytale.builtin.beds"
fqcn: "com.hypixel.hytale.builtin.beds.BedsPlugin"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "beds"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.beds`

```java
public class BedsPlugin extends JavaPlugin
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static` | `BedsPlugin` | `instance` |
| `private` | `ComponentType<EntityStore,PlayerSomnolence>` | `playerSomnolenceComponentType` |
| `private` | `ComponentType<EntityStore,SleepTracker>` | `sleepTrackerComponentType` |
| `private` | `ResourceType<EntityStore,WorldSomnolence>` | `worldSomnolenceResourceType` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `BedsPlugin` | `getInstance()` |
| `@Override protected` | `void` | `setup()` |
| `public` | `ComponentType<EntityStore,PlayerSomnolence>` | `getPlayerSomnolenceComponentType()` |
| `public` | `ComponentType<EntityStore,SleepTracker>` | `getSleepTrackerComponentType()` |
| `public` | `ResourceType<EntityStore,WorldSomnolence>` | `getWorldSomnolenceResourceType()` |
