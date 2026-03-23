---
title: "TreasureChestOpeningEvent"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.objectives.events"
fqcn: "com.hypixel.hytale.builtin.adventure.objectives.events.TreasureChestOpeningEvent"
api_surface: false
extends: ~
implements: ['IEvent']
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "adventure"
  - "objectives"
  - "events"
---

**Package:** `com.hypixel.hytale.builtin.adventure.objectives.events`

```java
public class TreasureChestOpeningEvent implements IEvent<String>
```

Server lifecycle event.

## Accessors

| Method | Returns | Description |
|---|---|---|
| `getObjectiveUUID()` | `UUID` | Accessor method. |
| `getChestUUID()` | `UUID` | Accessor method. |
| `getPlayerRef()` | `Ref<EntityStore>` | Accessor method. |
| `getStore()` | `Store<EntityStore>` | Accessor method. |
