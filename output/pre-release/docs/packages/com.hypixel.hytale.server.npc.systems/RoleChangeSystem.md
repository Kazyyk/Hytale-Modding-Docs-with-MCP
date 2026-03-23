---
title: "RoleChangeSystem"
kind: "class"
package: "com.hypixel.hytale.server.npc.systems"
fqcn: "com.hypixel.hytale.server.npc.systems.RoleChangeSystem"
api_surface: false
extends: "TickingSystem<EntityStore>"
implements: ~
generator_version: "2.0.0"
generated_at: "2026-03-21T02:17:06Z"
tags:
  - "npc"
  - "ecs-system"
  - "lifecycle"
  - "role"
---

**Package:** `com.hypixel.hytale.server.npc.systems`

```java
public class RoleChangeSystem extends TickingSystem<EntityStore>
```

Processes queued runtime role changes for NPC entities. When an NPC's role needs to change (triggered by `ActionRole`), the request is queued in the `RoleChangeQueue` resource. This system drains the queue each tick, performing the role swap by removing the entity, stripping role-specific components, updating the role name/index, and re-adding the entity to trigger [RoleBuilderSystem](RoleBuilderSystem.md).

## Execution Order

| Dependency | Direction |
|---|---|
| `NewSpawnStartTickingSystem` | AFTER |

## Static Methods

```java
public static void requestRoleChange(
    @Nonnull Ref<EntityStore> ref,
    @Nonnull Role role,
    int roleIndex,
    boolean changeAppearance,
    @Nonnull Store<EntityStore> store
)
```

```java
public static void requestRoleChange(
    @Nonnull Ref<EntityStore> ref,
    @Nonnull Role role,
    int roleIndex,
    boolean changeAppearance,
    @Nullable String state,
    @Nullable String subState,
    @Nonnull ComponentAccessor<EntityStore> store
)
```

Queues a role change request. Marks `role.setRoleChangeRequested()` to prevent further ticking of the old role.

## Tick Logic

```java
@Override
public void tick(float dt, int systemIndex, @Nonnull Store<EntityStore> store)
```

Drains the queue. For each valid request:
1. Removes the entity from the store with `RemoveReason.UNLOAD`.
2. Nulls the role, removes all role-specific components (`BeaconSupport`, event supports, `Timers`, `StateEvaluator`, `ValueStore`, `Repulsion`).
3. Updates role name and index.
4. Re-adds the entity with `AddReason.LOAD` (triggering `RoleBuilderSystem`).
5. If `changeAppearance` is set, applies the new role's appearance.
6. If a target state is specified, sets the new role's state.

## Inner Types

### RoleChangeSystem.RoleChangeQueue

```java
public static class RoleChangeQueue implements Resource<EntityStore>
```

ECS resource holding a `Deque<RoleChangeRequest>` of pending role change operations.

### RoleChangeSystem.RoleChangeRequest

```java
private static class RoleChangeRequest
```

Data class holding: `reference` (Ref), `roleIndex` (int), `changeAppearance` (boolean), `state` (String, nullable), `subState` (String, nullable).

## Related Types

- [RoleBuilderSystem](RoleBuilderSystem.md) -- rebuilds the role after the change
- [NewSpawnStartTickingSystem](NewSpawnStartTickingSystem.md) -- runs before this system
