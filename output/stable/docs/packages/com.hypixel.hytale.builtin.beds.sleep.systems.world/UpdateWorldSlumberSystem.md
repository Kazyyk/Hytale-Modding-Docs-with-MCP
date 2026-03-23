---
title: "UpdateWorldSlumberSystem"
kind: "class"
package: "com.hypixel.hytale.builtin.beds.sleep.systems.world"
fqcn: "com.hypixel.hytale.builtin.beds.sleep.systems.world.UpdateWorldSlumberSystem"
api_surface: false
extends: "TickingSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "beds"
  - "sleep"
  - "systems"
---

**Package:** `com.hypixel.hytale.builtin.beds.sleep.systems.world`

```java
public class UpdateWorldSlumberSystem extends TickingSystem<EntityStore>
```

ECS system handling UpdateWorldSlumber tick processing.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `ComponentType<EntityStore, PlayerSomnolence>` | `playerSomnolenceComponentType` |
| `@Nonnull private final` | `ResourceType<EntityStore, WorldSomnolence>` | `worldSomnolenceResourceType` |
| `@Nonnull private final` | `ResourceType<EntityStore, WorldTimeResource>` | `worldTimeResourceType` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `UpdateWorldSlumberSystem(@Nonnull ComponentType<EntityStore, PlayerSomnolence> playerSomnolenceComponentType,
        @Nonnull ResourceType<EntityStore, WorldSomnolence> worldSomnolenceResourceType,
        @Nonnull ResourceType<EntityStore, WorldTimeResource> worldTimeResourceType)` |
| `@Override public` | `void` | `tick(float dt, int systemIndex, @Nonnull Store<EntityStore> store)` |
| `@Nonnull private static` | `Instant` | `computeWakeupTime(@Nonnull WorldSlumber slumber)` |
| `private static` | `boolean` | `isSomeoneAwake(@Nonnull ComponentAccessor<EntityStore> store, @Nonnull ComponentType<EntityStore, PlayerSomnolence> playerSomnolenceComponentType)` |
