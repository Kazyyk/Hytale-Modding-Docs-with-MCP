---
title: "SleepTracker"
kind: "class"
package: "com.hypixel.hytale.builtin.beds.sleep.components"
fqcn: "com.hypixel.hytale.builtin.beds.sleep.components.SleepTracker"
api_surface: false
extends: ~
implements: 
  - "Component<EntityStore>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "sleep"
---

**Package:** `com.hypixel.hytale.builtin.beds.sleep.components`

```java
public class SleepTracker implements Component<EntityStore>
```

Implementation of `Component<EntityStore>`.

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getComponentType()` | `ComponentType<EntityStore, SleepTracker>` | static public method. |
| `generatePacketToSend(@Nonnull UpdateSleepState state)` | `UpdateSleepState` | public method. |
| `clone()` | `Component<EntityStore>` | public method. |
