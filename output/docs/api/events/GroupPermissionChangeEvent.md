---
title: "GroupPermissionChangeEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events.permissions"
fqcn: "com.hypixel.hytale.server.core.event.events.permissions.GroupPermissionChangeEvent"
api_surface: "public"
cancellable: false
generator_version: "1.0.0"
generated_at: "2026-02-09T23:10:00Z"
tags:
  - permissions
  - group
---

> Package: `com.hypixel.hytale.server.core.event.events.permissions`
> Implements: `IEvent<Void>`
> Cancellable: No
> Key type: `Void`

Base event for permission changes on a named group. This class is not dispatched directly -- its inner classes `Added` and `Removed` are the concrete events fired by the permissions system.

This event cannot be cancelled -- it is a notification of a change that has already occurred in the permissions module.

Because the key type is `Void`, this event is dispatched globally -- all registered listeners receive it regardless of key.

## Fields / Accessors (Base)

| Field | Type | Accessor | Mutable | Notes |
|-------|------|----------|---------|-------|
| `groupName` | `String` | `getGroupName()` | No | The name of the permission group that was modified. |

## Inner Classes

### GroupPermissionChangeEvent.Added

Dispatched when permissions are added to a group.

| Field | Type | Accessor | Mutable | Notes |
|-------|------|----------|---------|-------|
| `groupName` | `String` | `getGroupName()` | No | Inherited from base class. |
| `addedPermissions` | `Set<String>` | `getAddedPermissions()` | No | The set of permission strings that were added to the group. |

**Fired by:** `PermissionsModule.addGroupPermission()` (line 110) via `eventBus.dispatchFor()`.

### GroupPermissionChangeEvent.Removed

Dispatched when permissions are removed from a group.

| Field | Type | Accessor | Mutable | Notes |
|-------|------|----------|---------|-------|
| `groupName` | `String` | `getGroupName()` | No | Inherited from base class. |
| `removedPermissions` | `Set<String>` | `getRemovedPermissions()` | No | The set of permission strings that were removed from the group. |

**Fired by:** `PermissionsModule.removeGroupPermission()` (line 118) via `eventBus.dispatchFor()`.

## Listening

```java
// Listen for permissions added to a group
getEventRegistry().register(GroupPermissionChangeEvent.Added.class, event -> {
    String group = event.getGroupName();
    Set<String> added = event.getAddedPermissions();
    // Handle new group permissions
});

// Listen for permissions removed from a group
getEventRegistry().register(GroupPermissionChangeEvent.Removed.class, event -> {
    String group = event.getGroupName();
    Set<String> removed = event.getRemovedPermissions();
    // Handle removed group permissions
});
```

## Related Events

- [`PlayerGroupEvent`](./PlayerGroupEvent.md) -- fired when a player is added to or removed from a group. This is the player-membership counterpart to group-permission changes.
- [`PlayerPermissionChangeEvent`](./PlayerPermissionChangeEvent.md) -- fired when a player's individual permissions or group memberships change. Part of the broader permissions event cluster.

### Permissions Event Flow

```
GroupPermissionChangeEvent.Added / .Removed   -- group's permissions change
PlayerGroupEvent.Added / .Removed             -- player's group membership changes
PlayerPermissionChangeEvent.PermissionsAdded / .PermissionsRemoved  -- player's direct permissions change
PlayerPermissionChangeEvent.GroupAdded / .GroupRemoved              -- player's group membership (alternate view)
```
