---
title: "EntityFilterFlock"
kind: "class"
package: "com.hypixel.hytale.server.flock.corecomponents"
fqcn: "com.hypixel.hytale.server.flock.corecomponents.EntityFilterFlock"
api_surface: false
extends: "EntityFilterBase"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "flock"
  - "corecomponents"
  - "class"
---

**Package:** `com.hypixel.hytale.server.flock.corecomponents`

```java
public class EntityFilterFlock extends EntityFilterBase
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `int` | `COST` |
| `protected static final ComponentType<EntityStore,` | `FlockMembership>` | `FLOCK_MEMBERSHIP_COMPONENT_TYPE` |
| `protected static final ComponentType<EntityStore,` | `Player>` | `PLAYER_COMPONENT_TYPE` |
| `protected static final ComponentType<EntityStore,` | `EntityGroup>` | `ENTITY_GROUP_COMPONENT_TYPE` |
| `protected final` | `FlockMembershipType` | `flockMembership` |
| `protected final` | `FlockPlayerMembership` | `flockPlayerMembership` |
| `protected final` | `int[]` | `size` |
| `protected final` | `boolean` | `checkCanJoin` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `boolean` | `matchesEntity(@Nonnull Ref<EntityStore> ref, @Nonnull Ref<EntityStore> targetRef, @Nonnull Role role, @Nonnull Store<EntityStore> store)` |
| `@Override public` | `int` | `cost()` |
