---
title: "ClearUsedTeleporterSystem"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.teleporter.system"
fqcn: "com.hypixel.hytale.builtin.adventure.teleporter.system.ClearUsedTeleporterSystem"
api_surface: false
extends: "EntityTickingSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "builtin"
  - "adventure"
  - "teleporter"
  - "system"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.adventure.teleporter.system`

```java
public class ClearUsedTeleporterSystem extends EntityTickingSystem<EntityStore>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull public static final` | `Duration` | `TELEPORTER_GLOBAL_COOLDOWN` |
| `@Nonnull private static final` | `Set<Dependency<EntityStore>>` | `DEPENDENCIES` |
| `@Nonnull private final` | `ComponentType<EntityStore, UsedTeleporter>` | `usedTeleporterComponentType` |
| `@Nonnull private final` | `ComponentType<EntityStore, TransformComponent>` | `transformComponentType` |
| `@Nonnull private final` | `ComponentType<EntityStore, TeleportRecord>` | `teleportRecordComponentType` |
| `@Nonnull private final` | `ComponentType<EntityStore, Teleport>` | `teleportComponentType` |
| `@Nonnull private final` | `ComponentType<EntityStore, PendingTeleport>` | `pendingTeleportComponentType` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `ClearUsedTeleporterSystem(@Nonnull ComponentType<EntityStore, UsedTeleporter> usedTeleporterComponentType,
        @Nonnull ComponentType<EntityStore, TransformComponent> transformComponentType,
        @Nonnull ComponentType<EntityStore, TeleportRecord> teleportRecordComponentType,
        @Nonnull ComponentType<EntityStore, Teleport> teleportComponentType,
        @Nonnull ComponentType<EntityStore, PendingTeleport> pendingTeleportComponentType)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `Set<Dependency<EntityStore>>` | `getDependencies()` |
| `@Override public` | `void` | `tick(float dt,
        int index,
        @Nonnull ArchetypeChunk<EntityStore> archetypeChunk,
        @Nonnull Store<EntityStore> store,
        @Nonnull CommandBuffer<EntityStore> commandBuffer)` |
| `private` | `boolean` | `shouldClear(@Nonnull World world, int index, @Nonnull ArchetypeChunk<EntityStore> archetypeChunk)` |
| `@Nonnull @Override public` | `Query<EntityStore>` | `getQuery()` |
