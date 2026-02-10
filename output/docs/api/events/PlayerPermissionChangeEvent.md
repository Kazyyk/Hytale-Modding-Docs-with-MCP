---
title: "PlayerPermissionChangeEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events.permissions"
fqcn: "com.hypixel.hytale.server.core.event.events.permissions.PlayerPermissionChangeEvent"
api_surface: "public"
cancellable: false
generator_version: "1.0.0"
generated_at: "2026-02-09T23:10:00Z"
tags:
  - permissions
  - player
---

> Package: `com.hypixel.hytale.server.core.event.events.permissions`
> Implements: `IEvent<Void>`
> Cancellable: No
> Key type: `Void`

Base event for all player-level permission changes. This class provides the `playerUuid` field shared by all player permission events. It has four inner classes covering the four types of player permission changes: direct permission grants/revocations and group membership additions/removals.

This event cannot be cancelled -- it is a notification of a change that has already occurred.

Because the key type is `Void`, this event is dispatched globally -- all registered listeners receive it regardless of key.

## Fields / Accessors (Base)

| Field | Type | Accessor | Mutable | Notes |
|-------|------|----------|---------|-------|
| `playerUuid` | `UUID` | `getPlayerUuid()` | No | The UUID of the player whose permissions changed. |

## Inner Classes

### PlayerPermissionChangeEvent.GroupAdded

Dispatched when a player is added to a permission group (from the permission-change perspective).

| Field | Type | Accessor | Mutable | Notes |
|-------|------|----------|---------|-------|
| `playerUuid` | `UUID` | `getPlayerUuid()` | No | Inherited from base class. |
| `groupName` | `String` | `getGroupName()` | No | The name of the group the player was added to. |

Purpose unknown -- inferred from structure. No direct dispatch site found for this specific inner class; group membership changes are dispatched via `PlayerGroupEvent.Added` instead.

### PlayerPermissionChangeEvent.GroupRemoved

Dispatched when a player is removed from a permission group (from the permission-change perspective).

| Field | Type | Accessor | Mutable | Notes |
|-------|------|----------|---------|-------|
| `playerUuid` | `UUID` | `getPlayerUuid()` | No | Inherited from base class. |
| `groupName` | `String` | `getGroupName()` | No | The name of the group the player was removed from. |

Purpose unknown -- inferred from structure. No direct dispatch site found for this specific inner class; group membership changes are dispatched via `PlayerGroupEvent.Removed` instead.

### PlayerPermissionChangeEvent.PermissionsAdded

Dispatched when direct permissions are granted to a player.

| Field | Type | Accessor | Mutable | Notes |
|-------|------|----------|---------|-------|
| `playerUuid` | `UUID` | `getPlayerUuid()` | No | Inherited from base class. |
| `addedPermissions` | `Set<String>` | `getAddedPermissions()` | No | The set of permission strings that were granted to the player. |

**Fired by:** `PermissionsModule.addUserPermission()` (line 94) via `eventBus.dispatchFor()`.

### PlayerPermissionChangeEvent.PermissionsRemoved

Dispatched when direct permissions are revoked from a player.

| Field | Type | Accessor | Mutable | Notes |
|-------|------|----------|---------|-------|
| `playerUuid` | `UUID` | `getPlayerUuid()` | No | Inherited from base class. |
| `removedPermissions` | `Set<String>` | `getRemovedPermissions()` | No | The set of permission strings that were revoked from the player. |

**Fired by:** `PermissionsModule.removeUserPermission()` (line 102) via `eventBus.dispatchFor()`.

## Listening

```java
// Listen for direct permissions being added to a player
getEventRegistry().register(PlayerPermissionChangeEvent.PermissionsAdded.class, event -> {
    UUID playerUuid = event.getPlayerUuid();
    Set<String> added = event.getAddedPermissions();
    // Handle new player permissions
});

// Listen for direct permissions being removed from a player
getEventRegistry().register(PlayerPermissionChangeEvent.PermissionsRemoved.class, event -> {
    UUID playerUuid = event.getPlayerUuid();
    Set<String> removed = event.getRemovedPermissions();
    // Handle revoked player permissions
});

// Listen for group membership changes via the base type
getEventRegistry().register(PlayerPermissionChangeEvent.GroupAdded.class, event -> {
    UUID playerUuid = event.getPlayerUuid();
    String groupName = event.getGroupName();
    // Handle player added to group
});
```

## Related Events

- [`PlayerGroupEvent`](./PlayerGroupEvent.md) -- extends this class. The `Added` and `Removed` inner classes of `PlayerGroupEvent` are the primary dispatch targets for group membership changes.
- [`GroupPermissionChangeEvent`](./GroupPermissionChangeEvent.md) -- fired when a group's own permissions change (distinct from which players belong to the group).

### Permissions Event Cluster

The permissions system fires events at two levels:

**Group level:**
- `GroupPermissionChangeEvent.Added` / `.Removed` -- a group's permission set changes

**Player level:**
- `PlayerPermissionChangeEvent.PermissionsAdded` / `.PermissionsRemoved` -- a player's direct permissions change
- `PlayerGroupEvent.Added` / `.Removed` (extends `PlayerPermissionChangeEvent`) -- a player's group membership changes

### Inheritance Hierarchy

```
PlayerPermissionChangeEvent
  +-- GroupAdded
  +-- GroupRemoved
  +-- PermissionsAdded
  +-- PermissionsRemoved
  +-- PlayerGroupEvent (subclass)
        +-- Added
        +-- Removed
```
