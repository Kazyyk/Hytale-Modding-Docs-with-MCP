---
title: "SwitchActiveSlotEvent"
kind: "class"
package: "com.hypixel.hytale.server.core.event.events.ecs"
fqcn: "com.hypixel.hytale.server.core.event.events.ecs.SwitchActiveSlotEvent"
api_surface: true
extends: "CancellableEcsEvent"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "event"
  - "events"
---

**Package:** `com.hypixel.hytale.server.core.event.events.ecs`

```java
public class SwitchActiveSlotEvent extends CancellableEcsEvent
```

A cancellable ECS event fired when the corresponding SwitchActiveSlot action occurs.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `int` | `previousSlot` |
| `private final` | `int` | `inventorySectionId` |
| `private` | `byte` | `newSlot` |
| `private final` | `boolean` | `serverRequest` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `SwitchActiveSlotEvent(int inventorySectionId, int previousSlot, byte newSlot, boolean serverRequest)` |
| `public` | `int` | `getPreviousSlot()` |
| `public` | `byte` | `getNewSlot()` |
| `public` | `void` | `setNewSlot(byte newSlot)` |
| `public` | `boolean` | `isServerRequest()` |
| `public` | `boolean` | `isClientRequest()` |
| `public` | `int` | `getInventorySectionId()` |
