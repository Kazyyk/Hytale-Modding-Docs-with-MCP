---
title: "Timers"
kind: "class"
package: "com.hypixel.hytale.server.npc.components"
fqcn: "com.hypixel.hytale.server.npc.components.Timers"
api_surface: false
extends: null
implements: ["Component"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "npc"
  - "components"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.components`

```java
public class Timers implements Component
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Tickable[]` | `timers` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ComponentType<EntityStore,Timers>` | `getComponentType()` |
| `public` | `Tickable[]` | `getTimers()` |
| `@Nonnull @Override public` | `Component<EntityStore>` | `clone()` |
