---
title: "MessageSupport"
kind: "class"
package: "com.hypixel.hytale.server.npc.components.messaging"
fqcn: "com.hypixel.hytale.server.npc.components.messaging.MessageSupport"
api_surface: false
extends: ~
implements: ["Component<EntityStore>"]
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
public abstract class MessageSupport implements Component<EntityStore>
```

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public abstract` | `NPCMessage[]` | `getMessageSlots()` |
| `public` | `boolean` | `isMessageQueued(int messageIndex)` |
| `public` | `boolean` | `isMessageEnabled(int messageIndex)` |
| `@Override public abstract` | `Component<EntityStore>` | `clone()` |
