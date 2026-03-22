---
title: "NullSensor"
kind: "class"
package: "com.hypixel.hytale.server.npc.instructions"
fqcn: "com.hypixel.hytale.server.npc.instructions.NullSensor"
api_surface: false
extends: ~
implements: ["Sensor"]
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "npc"
  - "instructions"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.instructions`

```java
public class NullSensor implements Sensor
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `boolean` | `matches(@Nonnull Ref<EntityStore> ref, @Nonnull Role role, double dt, @Nonnull Store<EntityStore> store)` |
| `@Override public` | `InfoProvider` | `getSensorInfo()` |
| `@Override public` | `boolean` | `processDelay(float dt)` |
| `@Override public` | `void` | `clearOnce()` |
| `@Override public` | `void` | `setOnce()` |
| `@Override public` | `boolean` | `isTriggered()` |
| `@Override public` | `void` | `getInfo(Role role, ComponentInfo holder)` |
| `@Override public` | `void` | `setContext(IAnnotatedComponent parent, int index)` |
| `@Override @Nullable public` | `IAnnotatedComponent` | `getParent()` |
| `@Override public` | `int` | `getIndex()` |
