---
title: "CoopResidentComponent"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.farming.component"
fqcn: "com.hypixel.hytale.builtin.adventure.farming.component.CoopResidentComponent"
api_surface: false
extends: null
implements:
  - "Component<EntityStore>"
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "farming"
  - "component"
  - "coop"
---

**Package:** `com.hypixel.hytale.builtin.adventure.farming.component`

```java
public class CoopResidentComponent implements Component<EntityStore>
```

An `EntityStore` component attached to NPC entities that are residents of a [CoopBlock](CoopBlock.md). Tracks the block position of the coop the entity belongs to and whether the entity is marked for despawn.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private` | `Vector3i` | `coopLocation` |
| `private` | `boolean` | `markedForDespawn` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ComponentType<EntityStore, CoopResidentComponent>` | `getComponentType()` |
| `public` | `void` | `setCoopLocation(@Nonnull Vector3i coopLocation)` |
| `@Nonnull public` | `Vector3i` | `getCoopLocation()` |
| `public` | `void` | `setMarkedForDespawn(boolean markedForDespawn)` |
| `public` | `boolean` | `getMarkedForDespawn()` |
| `@Nullable public` | `Component<EntityStore>` | `clone()` |

## Codec

Serialized fields: `CoopLocation` (Vector3i), `MarkedForDespawn` (boolean).
