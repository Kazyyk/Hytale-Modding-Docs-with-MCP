---
title: "StaminaModule"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.stamina"
fqcn: "com.hypixel.hytale.server.core.modules.entity.stamina.StaminaModule"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "modules"
  - "entity"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.stamina`

```java
public class StaminaModule extends JavaPlugin
```

Plugin class that registers components, systems, and commands for the StaminaModule subsystem.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static` | `StaminaModule` | `instance` |
| `private` | `ResourceType<EntityStore, SprintStaminaRegenDelay>` | `sprintRegenDelayResourceType` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `StaminaModule(@Nonnull JavaPluginInit init)` |
| `@Override protected` | `void` | `setup()` |
| `public` | `ResourceType<EntityStore, SprintStaminaRegenDelay>` | `getSprintRegenDelayResourceType()` |
| `protected static` | `void` | `onGameplayConfigsLoaded(LoadedAssetsEvent<String, GameplayConfig, AssetMap<String, GameplayConfig>> event)` |
| `public static` | `StaminaModule` | `get()` |
