---
title: "GroupPermissionChangeEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events.permissions"
fqcn: "com.hypixel.hytale.server.core.event.events.permissions.GroupPermissionChangeEvent"
api_surface: "public"
cancellable: false
generator_version: "1.0.0"
generated_at: "2026-02-18T17:30:00Z"
tags:
  - permissions
  - group
---

> Package: `com.hypixel.hytale.server.core.event.events.permissions`
> Implements: `IEvent<Void>`
> Cancellable: No

Abstract base event for permission changes on a named group. This class is not dispatched directly -- its inner classes `Added` and `Removed` are the concrete events fired by the permissions system. This event cannot be cancelled -- it is a notification of a change that has already occurred.

## Fields / Accessors (Base)

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `groupName` | `String` | `getGroupName()` | No | No |

- **groupName** -- The name of the permission group that was modified.

## Inner Classes

### GroupPermissionChangeEvent.Added

Dispatched when permissions are added to a group.

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `groupName` | `String` | `getGroupName()` | No | No |
| `addedPermissions` | `Set<String>` | `getAddedPermissions()` | No | No |

- **addedPermissions** -- The set of permission strings that were added to the group. Returned as an unmodifiable set.

**Fired by:** `PermissionsModule.addGroupPermission()` (line 110) via `eventBus dispatch`.

### GroupPermissionChangeEvent.Removed

Dispatched when permissions are removed from a group.

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `groupName` | `String` | `getGroupName()` | No | No |
| `removedPermissions` | `Set<String>` | `getRemovedPermissions()` | No | No |

- **removedPermissions** -- The set of permission strings that were removed from the group. Returned as an unmodifiable set.

**Fired by:** `PermissionsModule.removeGroupPermission()` (line 118) via `eventBus dispatch`.

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

- [`PlayerGroupEvent`](./PlayerGroupEvent.md) -- Fired when a player is added to or removed from a group. This is the player-membership counterpart to group-permission changes.
- [`PlayerPermissionChangeEvent`](./PlayerPermissionChangeEvent.md) -- Fired when a player's individual permissions or group memberships change.
