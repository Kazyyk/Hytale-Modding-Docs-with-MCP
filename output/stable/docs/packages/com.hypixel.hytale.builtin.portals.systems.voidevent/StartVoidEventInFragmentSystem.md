---
title: "StartVoidEventInFragmentSystem"
kind: "class"
package: "com.hypixel.hytale.builtin.portals.systems.voidevent"
fqcn: "com.hypixel.hytale.builtin.portals.systems.voidevent.StartVoidEventInFragmentSystem"
api_surface: false
extends: "DelayedSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "portals"
  - "systems"
  - "voidevent"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.portals.systems.voidevent`

```java
public class StartVoidEventInFragmentSystem extends DelayedSystem<EntityStore>
```

Delayed system (1.0s interval) that manages void event lifecycle in portal fragment worlds. Checks elapsed time against the configured start threshold and spawns or removes `VoidEvent` entities.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `delayedTick(float dt, int systemIndex, Store<EntityStore> store)` |
