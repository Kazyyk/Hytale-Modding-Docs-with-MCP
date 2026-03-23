---
title: "NPCMessage"
kind: "class"
package: "com.hypixel.hytale.server.npc.components.messaging"
fqcn: "com.hypixel.hytale.server.npc.components.messaging.NPCMessage"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "npc"
  - "components"
  - "messaging"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.components.messaging`

```java
public class NPCMessage
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `double` | `AGE_INFINITE` |
| `private` | `boolean` | `enabled` |
| `private` | `boolean` | `activated` |
| `private` | `double` | `age` |
| `private` | `Ref<EntityStore>` | `target` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `boolean` | `tickAge(float dt)` |
| `public` | `boolean` | `isEnabled()` |
| `public` | `void` | `setEnabled(boolean enabled)` |
| `public` | `boolean` | `isActivated()` |
| `public` | `boolean` | `isInfinite()` |
| `@Nullable public` | `Ref<EntityStore>` | `getTarget()` |
| `public` | `void` | `activate(Ref<EntityStore> target, double age)` |
| `public` | `void` | `deactivate()` |
| `@Nonnull public` | `NPCMessage` | `clone()` |
