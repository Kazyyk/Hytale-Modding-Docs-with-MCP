---
title: "DeployableComponent"
kind: "class"
package: "com.hypixel.hytale.builtin.deployables.component"
fqcn: "com.hypixel.hytale.builtin.deployables.component.DeployableComponent"
api_surface: false
extends: ~
implements: ["Component<EntityStore>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "builtin"
  - "deployables"
  - "component"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.deployables.component`

```java
public class DeployableComponent implements Component<EntityStore>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `Map<DeployableComponent.DeployableFlag, Integer>` | `flags` |
| `private` | `DeployableConfig` | `config` |
| `private` | `Ref<EntityStore>` | `owner` |
| `private` | `UUID` | `ownerUUID` |
| `private` | `Instant` | `spawnInstant` |
| `private` | `float` | `timeSinceLastAttack` |
| `@Nullable private` | `Vector3f` | `debugColor` |
| `private` | `boolean` | `firstTickRan` |
| `private` | `String` | `spawnFace` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `ComponentType<EntityStore, DeployableComponent>` | `getComponentType()` |
| `@Override public` | `Component<EntityStore>` | `clone()` |
| `public` | `void` | `tick(float dt,
        int index,
        @Nonnull ArchetypeChunk<EntityStore> archetypeChunk,
        @Nonnull Store<EntityStore> store,
        @Nonnull CommandBuffer<EntityStore> commandBuffer)` |
| `public` | `void` | `init(@Nonnull Ref<EntityStore> deployerRef,
        @Nonnull Store<EntityStore> store,
        @Nonnull DeployableConfig config,
        @Nonnull Instant spawnInstant,
        @Nonnull String spawnFace)` |
| `public` | `Ref<EntityStore>` | `getOwner()` |
| `public` | `UUID` | `getOwnerUUID()` |
| `public` | `DeployableConfig` | `getConfig()` |
| `public` | `Instant` | `getSpawnInstant()` |
| `public` | `float` | `getTimeSinceLastAttack()` |
| `public` | `void` | `setTimeSinceLastAttack(float time)` |
| `public` | `float` | `incrementTimeSinceLastAttack(float time)` |
| `public` | `String` | `getSpawnFace()` |
| `public` | `int` | `getFlag(@Nonnull DeployableComponent.DeployableFlag key)` |
| `public` | `void` | `setFlag(@Nonnull DeployableComponent.DeployableFlag key, int value)` |
| `@Nonnull public` | `Vector3f` | `getDebugColor()` |

## Inner Types

- `DeployableComponent.DeployableFlag`
