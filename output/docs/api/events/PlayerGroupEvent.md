---
title: "PlayerGroupEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events.permissions"
fqcn: "com.hypixel.hytale.server.core.event.events.permissions.PlayerGroupEvent"
api_surface: "public"
cancellable: false
generator_version: "1.0.0"
generated_at: "2026-02-09T23:10:00Z"
tags:
  - permissions
  - player
  - group
---

> Package: `com.hypixel.hytale.server.core.event.events.permissions`
> Extends: `PlayerPermissionChangeEvent`
> Implements: `IEvent<Void>`
> Cancellable: No
> Key type: `Void`

Base event for player group membership changes. Extends `PlayerPermissionChangeEvent` to inherit the `playerUuid` field. This class is not dispatched directly -- its inner classes `Added` and `Removed` are the concrete events fired by the permissions system.

This event cannot be cancelled -- it is a notification of a change that has already occurred.

Because the key type is `Void`, this event is dispatched globally -- all registered listeners receive it regardless of key.

## Fields / Accessors (Base)

| Field | Type | Accessor | Mutable | Notes |
|-------|------|----------|---------|-------|
| `playerUuid` | `UUID` | `getPlayerUuid()` | No | The UUID of the player whose group membership changed. Inherited from `PlayerPermissionChangeEvent`. |
| `groupName` | `String` | `getGroupName()` | No | The name of the group the player was added to or removed from. |

## Inner Classes

### PlayerGroupEvent.Added

Dispatched when a player is added to a permission group.

Inherits all fields from the base class. No additional fields.

**Fired by:** `PermissionsModule.addUserToGroup()` (line 126) via `eventBus.dispatchFor()`.

### PlayerGroupEvent.Removed

Dispatched when a player is removed from a permission group.

Inherits all fields from the base class. No additional fields.

**Fired by:** `PermissionsModule.removeUserFromGroup()` (line 134) via `eventBus.dispatchFor()`.

## Listening

```java
// Listen for a player being added to a group
getEventRegistry().register(PlayerGroupEvent.Added.class, event -> {
    UUID playerUuid = event.getPlayerUuid();
    String groupName = event.getGroupName();
    // Handle player added to group
});

// Listen for a player being removed from a group
getEventRegistry().register(PlayerGroupEvent.Removed.class, event -> {
    UUID playerUuid = event.getPlayerUuid();
    String groupName = event.getGroupName();
    // Handle player removed from group
});
```

## Related Events

- [`PlayerPermissionChangeEvent`](./PlayerPermissionChangeEvent.md) -- the parent class. Also fires `GroupAdded` / `GroupRemoved` inner events which provide an alternate view of the same group membership changes.
- [`GroupPermissionChangeEvent`](./GroupPermissionChangeEvent.md) -- fired when the group's own permissions change (as opposed to membership changes). Part of the broader permissions event cluster.

### Permissions Event Cluster

```
Group permissions change    --> GroupPermissionChangeEvent.Added / .Removed
Player added/removed group  --> PlayerGroupEvent.Added / .Removed
Player direct permissions   --> PlayerPermissionChangeEvent.PermissionsAdded / .PermissionsRemoved
```
