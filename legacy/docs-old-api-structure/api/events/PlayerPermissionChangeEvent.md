---
title: "PlayerPermissionChangeEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events.permissions"
fqcn: "com.hypixel.hytale.server.core.event.events.permissions.PlayerPermissionChangeEvent"
api_surface: "public"
cancellable: false
generator_version: "1.0.0"
generated_at: "2026-02-18T17:30:00Z"
tags:
  - permissions
  - player
---

> Package: `com.hypixel.hytale.server.core.event.events.permissions`
> Implements: `IEvent<Void>`
> Cancellable: No

Abstract base event for all player-level permission changes. Provides the `playerUuid` field shared by all player permission events. Has four inner classes covering the four types of player permission changes: direct permission grants/revocations and group membership additions/removals.

## Fields / Accessors (Base)

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `playerUuid` | `UUID` | `getPlayerUuid()` | No | No |

- **playerUuid** -- The UUID of the player whose permissions changed.

## Inner Classes

### PlayerPermissionChangeEvent.PermissionsAdded

Dispatched when direct permissions are granted to a player.

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `playerUuid` | `UUID` | `getPlayerUuid()` | No | No |
| `addedPermissions` | `Set<String>` | `getAddedPermissions()` | No | No |

- **addedPermissions** -- The set of permission strings that were granted. Returned as an unmodifiable set.

**Fired by:** `PermissionsModule.addUserPermission()` (line 94) via `eventBus dispatch`.

### PlayerPermissionChangeEvent.PermissionsRemoved

Dispatched when direct permissions are revoked from a player.

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `playerUuid` | `UUID` | `getPlayerUuid()` | No | No |
| `removedPermissions` | `Set<String>` | `getRemovedPermissions()` | No | No |

- **removedPermissions** -- The set of permission strings that were revoked. Returned as an unmodifiable set.

**Fired by:** `PermissionsModule.removeUserPermission()` (line 102) via `eventBus dispatch`.

### PlayerPermissionChangeEvent.GroupAdded

Dispatched when a player is added to a permission group (from the permission-change perspective).

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `playerUuid` | `UUID` | `getPlayerUuid()` | No | No |
| `groupName` | `String` | `getGroupName()` | No | No |

### PlayerPermissionChangeEvent.GroupRemoved

Dispatched when a player is removed from a permission group (from the permission-change perspective).

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `playerUuid` | `UUID` | `getPlayerUuid()` | No | No |
| `groupName` | `String` | `getGroupName()` | No | No |

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
```

## Related Events

- [`PlayerGroupEvent`](./PlayerGroupEvent.md) -- Extends this class. The `Added` and `Removed` inner classes are the primary dispatch targets for group membership changes.
- [`GroupPermissionChangeEvent`](./GroupPermissionChangeEvent.md) -- Fired when a group's own permissions change.

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
