---
title: "SprintStaminaRegenDelay"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.stamina"
fqcn: "com.hypixel.hytale.server.core.modules.entity.stamina.SprintStaminaRegenDelay"
api_surface: false
extends: null
implements: ["Resource<EntityStore>"]
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
public class SprintStaminaRegenDelay implements Resource<EntityStore>
```

Implements `Resource` to provide SprintStaminaRegenDelay functionality.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `private static final` | `AtomicInteger` | `ASSET_VALIDATION_STATE` | `new AtomicInteger(0)` |

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `protected` | `int` | `statIndex` | `0` |
| `protected` | `float` | `statValue` |  |
| `protected` | `int` | `validationState` | `ASSET_VALIDATION_STATE.get() - 1` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `SprintStaminaRegenDelay()` |
| `public` | | `SprintStaminaRegenDelay(@Nonnull SprintStaminaRegenDelay other)` |
| `public static` | `ResourceType<EntityStore, SprintStaminaRegenDelay>` | `getResourceType()` |
| `public` | `int` | `getIndex()` |
| `public` | `float` | `getValue()` |
| `public` | `boolean` | `validate()` |
| `public` | `boolean` | `hasDelay()` |
| `public` | `void` | `markEmpty()` |
| `public` | `void` | `update(int statIndex, float statValue)` |
| `@Nonnull @Override public` | `Resource<EntityStore>` | `clone()` |
| `@Nonnull @Override public` | `String` | `toString()` |
| `public static` | `void` | `invalidateResources()` |
